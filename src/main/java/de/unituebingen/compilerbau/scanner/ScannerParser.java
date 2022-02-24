package de.unituebingen.compilerbau.scanner;

import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.DotOperator;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.Ternary;
import de.unituebingen.compilerbau.ast.expression.This;
import de.unituebingen.compilerbau.ast.expression.arithmetic.*;
import de.unituebingen.compilerbau.ast.expression.bitwisebinary.*;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.And;
import de.unituebingen.compilerbau.ast.expression.conditionaloperators.Or;
import de.unituebingen.compilerbau.ast.expression.literal.BooleanLiteral;
import de.unituebingen.compilerbau.ast.expression.literal.CharLiteral;
import de.unituebingen.compilerbau.ast.expression.literal.IntLiteral;
import de.unituebingen.compilerbau.ast.expression.relationaloperators.*;
import de.unituebingen.compilerbau.ast.expression.unary.Negate;
import de.unituebingen.compilerbau.ast.expression.unary.Not;
import de.unituebingen.compilerbau.ast.statementexpressions.*;
import de.unituebingen.compilerbau.ast.statements.*;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.scanner.generated.JavaFiveGrammarLexer;
import de.unituebingen.compilerbau.scanner.generated.JavaFiveGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class ScannerParser
{
    public Map<String, Clazz> parse(String sourceCode) throws ASTException
    {
        CharStream input = CharStreams.fromString(sourceCode);
        JavaFiveGrammarLexer lexer = new JavaFiveGrammarLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JavaFiveGrammarParser parser = new JavaFiveGrammarParser(tokenStream);
        ASTErrorListener errorListener = new ASTErrorListener();
        lexer.addErrorListener(errorListener);
        parser.addErrorListener(errorListener);

        return new ParseTreeVisitor().visitJavaProgram(parser.javaProgram());
    }

    static class ParseTreeVisitor
    {
        public Map<String, Clazz> visitJavaProgram(JavaFiveGrammarParser.JavaProgramContext ctx)
        {
            Map<String, Clazz> clazzes = new HashMap<>();
            for (JavaFiveGrammarParser.ClazzContext clsCtx : ctx.clazz())
            {
                Clazz cls = visitClazz(clsCtx);
                clazzes.put(cls.name, cls);
            }
            return clazzes;
        }

        public Clazz visitClazz(JavaFiveGrammarParser.ClazzContext ctx)
        {
            AccessModifier modifier = parseAccessModifier(ctx.AccessModifier());
            String name = ctx.Identifier().getText();
            List<Field> fields = new ArrayList<>();
            List<Method> methods = new ArrayList<>();

            for (JavaFiveGrammarParser.ClazzMemberContext clzMemCtx : ctx.clazzMember())
            {
                ParseTree child = clzMemCtx.getChild(0);
                if (child instanceof JavaFiveGrammarParser.FieldContext)
                {
                    Field field = visitField((JavaFiveGrammarParser.FieldContext) child);
                    fields.add(field);
                } else if (child instanceof JavaFiveGrammarParser.MethodContext)
                {
                    Method method = visitMethod((JavaFiveGrammarParser.MethodContext) child);
                    methods.add(method);
                } else if (child instanceof JavaFiveGrammarParser.ConstructorContext)
                {
                    Method method =
                            visitConstructor((JavaFiveGrammarParser.ConstructorContext) child,
                            name
                    );
                    methods.add(method);
                }
            }

            return new Clazz(modifier, name, fields, methods);
        }

        public Method visitConstructor(
                JavaFiveGrammarParser.ConstructorContext ctx, String clazzName)
        {
            AccessModifier modifier = parseAccessModifier(ctx.AccessModifier());
            String name = ctx.Identifier().getText();
            if (!clazzName.equals(name))
            {
                throw new ASTException("Class name expected");
            }
            Vector<Identifier> parameters = visitMethodParameterList(ctx.parameterList());
            Block body = visitBlockStatement(ctx.blockStatement());

            return new Method(modifier, false, name, new Type("void"), parameters, body);
        }

        public Method visitMethod(JavaFiveGrammarParser.MethodContext ctx)
        {
            AccessModifier modifier = parseAccessModifier(ctx.AccessModifier());
            boolean isStatic = ctx.Static() != null;
            Type returnType = visitType(ctx.type());
            String name = ctx.Identifier().getText();
            Vector<Identifier> parameters = visitMethodParameterList(ctx.parameterList());
            Block body = visitBlockStatement(ctx.blockStatement());
            return new Method(modifier, isStatic, name, returnType, parameters, body);
        }

        public Vector<Identifier> visitMethodParameterList(JavaFiveGrammarParser.ParameterListContext ctx)
        {
            Vector<Identifier> parameters = new Vector<>();

            for (int i = 0; i < ctx.type().size(); i++)
            {
                Type type = visitType(ctx.type(i));
                String name = ctx.Identifier(i).getText();
                parameters.add(new Identifier(name, type));
            }

            return parameters;
        }

        public Field visitField(JavaFiveGrammarParser.FieldContext ctx)
        {
            AccessModifier modifier = parseAccessModifier(ctx.AccessModifier());
            boolean isStatic = ctx.Static() != null;
            LocalVarDeclaration decl =
                    visitLocalVarDeclarationStatement(ctx.localVarDeclarationStatement());
            return new Field(modifier, isStatic, decl.name, decl.expression, decl.getType());
        }

        public AccessModifier parseAccessModifier(TerminalNode accessModifier)
        {
            if (accessModifier == null)
            {
                return AccessModifier.PACKAGEPRIVATE;
            }
            switch (accessModifier.getText())
            {
                case "public":
                    return AccessModifier.PUBLIC;
                case "private":
                    return AccessModifier.PRIVATE;
            }
            throw new ASTException("Unknown access modifier: " + accessModifier.getText());
        }

        public Statement visitStatement(JavaFiveGrammarParser.StatementContext ctx)
        {
            ParseTree child = ctx.getChild(0);
            if (child.getText().equals(";"))
            {
                return new Block(new ArrayList<>());
            }
            if (child instanceof JavaFiveGrammarParser.BlockStatementContext)
            {
                return visitBlockStatement(ctx.blockStatement());
            }
            if (child instanceof JavaFiveGrammarParser.IfStatementContext)
            {
                return visitIf(ctx.ifStatement());
            }
            if (child instanceof JavaFiveGrammarParser.SwitchStatementContext)
            {
                return visitSwitch(ctx.switchStatement());
            }
            if (child instanceof JavaFiveGrammarParser.WhileStatementContext)
            {
                return visitWhile(ctx.whileStatement());
            }
            if (child instanceof JavaFiveGrammarParser.DoWhileStatementContext)
            {
                return visitDoWhile(ctx.doWhileStatement());
            }
            if (child instanceof JavaFiveGrammarParser.ForStatementContext)
            {
                return visitFor(ctx.forStatement());
            }
            if (child instanceof JavaFiveGrammarParser.LocalVarDeclarationStatementContext)
            {
                return visitLocalVarDeclarationStatement(ctx.localVarDeclarationStatement());
            }
            if (child instanceof JavaFiveGrammarParser.ReturnStatementContext)
            {
                return visitReturn(ctx.returnStatement());
            }
            if (child instanceof JavaFiveGrammarParser.StatementExpressionContext)
            {
                return visitStatementExpression(ctx.statementExpression());
            }
            if (ctx.Continue() != null)
            {
                throw new ASTException("Continue not supported");
            }
            if (ctx.Break() != null)
            {
                throw new ASTException("Break not supported");
            }

            throw new ASTException("Unknown statement: " + ctx);
        }


        public Block visitBlockStatement(JavaFiveGrammarParser.BlockStatementContext ctx)
        {
            List<Statement> statements = new ArrayList<>(ctx.statement().size());
            for (JavaFiveGrammarParser.StatementContext statementCtx : ctx.statement())
            {
                Statement statement = visitStatement(statementCtx);
                statements.add(statement);
            }
            return new Block(statements);
        }

        public If visitIf(JavaFiveGrammarParser.IfStatementContext ctx)
        {
            Expression condition = visitParExpression(ctx.parExpression());
            Statement ifBody = visitStatement(ctx.statement(0));
            Statement elseBody = null;
            // else clause present
            if (ctx.getChildCount() == 5)
            {
                elseBody = visitStatement(ctx.statement(1));
            }
            return new If(condition, ifBody, elseBody);
        }

        public Statement visitSwitch(JavaFiveGrammarParser.SwitchStatementContext ctx)
        {
            throw new ASTException("Switch not supported yet");
        }

        public While visitWhile(JavaFiveGrammarParser.WhileStatementContext ctx)
        {
            Expression condition = visitParExpression(ctx.parExpression());
            Statement body = visitStatement(ctx.statement());
            return new While(condition, body);
        }

        public Statement visitDoWhile(JavaFiveGrammarParser.DoWhileStatementContext ctx)
        {
            throw new ASTException("Do while not supported yet");
        }

        public For visitFor(JavaFiveGrammarParser.ForStatementContext ctx)
        {
            Statement init = null;
            Expression termination = null;
            Statement increment = null;
            // init, termination and increment are optional thats why we need to check
            // if they are present
            if (ctx.getChild(2) instanceof JavaFiveGrammarParser.ForInitContext)
            {
                init = visitForInit(ctx.forInit());
            }
            if (ctx.getChild(4) instanceof JavaFiveGrammarParser.ExpressionContext)
            {
                termination = visitExpression(ctx.expression());
            }
            if (ctx.getChild(6) instanceof JavaFiveGrammarParser.ForIncrementContext)
            {
                increment = visitForIncrement(ctx.forIncrement());
            }
            // body is mandatory
            Statement body = visitStatement(ctx.statement());
            return new For(init, termination, increment, body);
        }

        public Statement visitForInit(JavaFiveGrammarParser.ForInitContext ctx)
        {
            Type type = visitType(ctx.type());
            String name = ctx.Identifier().getText();
            Expression expr = visitExpression(ctx.expression());
            LocalVarDeclaration decl = new LocalVarDeclaration(name, expr);
            decl.setType(type);
            return decl;
        }

        public Statement visitForIncrement(JavaFiveGrammarParser.ForIncrementContext ctx)
        {
            Expression expr = visitExpression(ctx.expression());
            if (expr instanceof StatementExpression)
            {
                return (Statement) expr;
            }
            throw new ASTException("Statement expected");
        }

        public LocalVarDeclaration visitLocalVarDeclarationStatement(JavaFiveGrammarParser.LocalVarDeclarationStatementContext ctx)
        {
            Type type = visitType(ctx.type());
            Identifier identifier = new Identifier(ctx.Identifier().getText(), type);
            Expression assignment = null;
            if (ctx.getChildCount() == 5)
            {
                assignment = visitExpression(ctx.expression());
            }
            LocalVarDeclaration decl = new LocalVarDeclaration(identifier.name, assignment);
            decl.setType(type);
            return decl;
        }

        public Return visitReturn(JavaFiveGrammarParser.ReturnStatementContext ctx)
        {
            return new Return(ctx.getChildCount() == 3 ? visitExpression(ctx.expression()) : null);
        }

        public Statement visitStatementExpression(JavaFiveGrammarParser.StatementExpressionContext ctx)
        {
            Expression expr = visitExpression(ctx.expression());
            if (expr instanceof StatementExpression)
            {
                return (Statement) expr;
            }
            throw new ASTException("Statement expected");
        }

        public Type visitType(JavaFiveGrammarParser.TypeContext ctx)
        {
            if (ctx.Primitive() != null)
            {
                switch (ctx.Primitive().getText())
                {
                    case "int":
                        return Type.INT;
                    case "char":
                        return Type.CHAR;
                    case "boolean":
                        return Type.BOOLEAN;
                    case "void":
                        return Type.VOID;
                }
                // cannot happen right?? just in case...
                throw new ASTException("Primitive type expected! Actual: " + ctx.Primitive()
                        .getText());
            } else
            {
                return new Type(ctx.Identifier().getText());
            }
        }

        public Expression visitExpression(JavaFiveGrammarParser.ExpressionContext ctx)
        {
            String op = null;
            switch (ctx.getChildCount())
            {
                // Primitive, Variable, this or some other rule
                case 1:
                    TerminalNode node = ctx.Int();
                    if (node != null)
                    {
                        return new IntLiteral(Integer.parseInt(node.getText()));
                    }
                    node = ctx.Char();
                    if (node != null)
                    {
                        return new CharLiteral(node.getText().charAt(1));
                    }
                    node = ctx.Bool();
                    if (node != null)
                    {
                        return new BooleanLiteral(Boolean.parseBoolean(node.getText()));
                    }
                    node = ctx.Identifier();
                    if (node != null)
                    {
                        return new Identifier(node.getText(), null);
                    }
                    node = ctx.This();
                    if (node != null)
                    {
                        return new This();
                    }
                    ParseTree element = ctx.getChild(0);
                    if (element instanceof JavaFiveGrammarParser.ParExpressionContext)
                    {
                        return visitParExpression(ctx.parExpression());
                    }
                    if (element instanceof JavaFiveGrammarParser.MethodCallContext)
                    {
                        return visitMethodCall(ctx.methodCall());
                    }
                    if (element instanceof JavaFiveGrammarParser.NewExpContext)
                    {
                        return visitNewExp(ctx.newExp());
                    }
                    if (element instanceof JavaFiveGrammarParser.AssignmentContext)
                    {
                        return visitAssignment(ctx.assignment());
                    }
                    break;
                // Unary, post- or prefix expression
                case 2:
                    Expression expr = visitExpression(ctx.expression(0));
                    op = ctx.getChild(1).getText();
                    if (op.equals("++") || op.equals("--"))
                    {
                        return makePostOrPreIncrement(expr, op.equals("++"), true);
                    }
                    // prefix
                    op = ctx.getChild(0).getText();
                    switch (op)
                    {
                        case "++":
                            return makePostOrPreIncrement(expr, true, false);
                        case "--":
                            return makePostOrPreIncrement(expr, false, false);
                        case "+":
                            return expr;
                        case "-":
                            return new Negate(expr);
                        case "~":
                            //TODO Bitwise invert not supported
                            throw new ASTException("Bitwise invert not implemented");
                        case "!":
                            return new Not(expr);
                    }
                    break;
                // Binary expression
                case 3:
                    op = ctx.getChild(1).getText();
                    switch (op)
                    {
                        case ".":
                            Expression left = visitExpression(ctx.expression(0));
                            if (ctx.getChild(2) instanceof JavaFiveGrammarParser.MethodCallContext)
                            {
                                MethodCall call = visitMethodCall(ctx.methodCall());
                                call.setExpr(left);
                                return call;
                            } else
                            {
                                String identifier = ctx.Identifier().getText();
                                return new DotOperator(left, identifier);
                            }
                        case "*":
                            return new Multiply(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "/":
                            return new Divide(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "%":
                            return new Remainder(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "+":
                            return new Add(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "-":
                            return new Subtract(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "<<":
                            return new ShiftLeft(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case ">>":
                            return new ShiftRight(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case ">>>":
                            return new UnsignedShiftRight(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "<":
                            return new Less(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case ">":
                            return new Greater(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "<=":
                            return new LessOrEqual(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case ">=":
                            return new GreaterOrEqual(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "==":
                            return new Equal(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "!=":
                            return new NotEqual(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "&":
                            return new BitAnd(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "^":
                            return new BitXOR(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "|":
                            return new BitOr(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "&&":
                            return new And(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "||":
                            return new Or(visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                    }
                    break;
                // Ternary expression
                case 5:
                    return new Ternary(visitExpression(ctx.expression(0)),
                            visitExpression(ctx.expression(1)),
                            visitExpression(ctx.expression(2))
                    );
            }
            throw new ASTException("Not an expression: " + ctx.getText());
        }

        public MethodCall visitMethodCall(JavaFiveGrammarParser.MethodCallContext ctx)
        {
            String name = ctx.Identifier().getText();
            List<Expression> args = visitExpressionList(ctx.expressionList());
            // expr will be set after the method call is created when there is a dot
            // e.g a.m();
            return new MethodCall(null, name, args);
        }

        public Expression visitNewExp(JavaFiveGrammarParser.NewExpContext ctx)
        {
            New _new = new New(visitExpressionList(ctx.expressionList()));
            _new.setType(new Type(ctx.Identifier().getText()));
            return _new;
        }

        public Expression visitAssignment(JavaFiveGrammarParser.AssignmentContext ctx)
        {
            Expression selectorPart = visitSelectorPart(ctx.selectorPart());
            Expression assignmentPart = visitAssignmentPart(ctx.assignmentPart());
            return new Assignment(selectorPart,
                    handleAssignment(ctx.getChild(1).getText(), selectorPart, assignmentPart)
            );
        }

        private Expression visitSelectorPart(JavaFiveGrammarParser.SelectorPartContext ctx)
        {
            // single variable
            if (ctx.getChildCount() == 1)
            {
                return new Identifier(ctx.Identifier(0).getText(), null);
            }
            Expression dot = ctx.This() == null
                    ? new Identifier(ctx.Identifier(0).getText(), null)
                    : new DotOperator(new This(), ctx.Identifier(0).getText());
            for (int i = 1; i < ctx.Identifier().size(); i++)
            {
                dot = new DotOperator(dot, ctx.Identifier(i).getText());
            }
            return dot;
        }

        private Expression visitAssignmentPart(JavaFiveGrammarParser.AssignmentPartContext ctx)
        {
            Expression expr = visitExpression(ctx.expression());
            Assignment assignment = null;
            for (int i = ctx.getChildCount() - 2; i >= 1; i -= 2)
            {
                String assignmentOp = ctx.getChild(i).getText();
                Identifier identifier = new Identifier(ctx.getChild(i - 1).getText(), null);
                if (i == ctx.getChildCount() - 2)
                {
                    assignment = new Assignment(identifier,
                            handleAssignment(assignmentOp, identifier, expr)
                    );
                } else
                {
                    // case: a = ... d = e = ... = 1
                    Expression bla = handleAssignment(assignmentOp, identifier, assignment.left);
                    assignment.setLeft(bla);
                    assignment = new Assignment(identifier, assignment);
                }
            }
            return assignment == null ? expr : assignment;
        }

        private Expression handleAssignment(String op, Expression first, Expression expr)
        {
            switch (op)
            {
                case "=":
                    return expr;
                case "+=":
                    return new Add(first, expr);
                case "-=":
                    return new Subtract(first, expr);
                case "*=":
                    return new Multiply(first, expr);
                case "/=":
                    return new Divide(first, expr);
                case "%=":
                    return new Remainder(first, expr);
                case "&=":
                    return new BitAnd(first, expr);
                case "^=":
                    return new BitXOR(first, expr);
                case "|=":
                    return new BitOr(first, expr);
                case "<<=":
                    return new ShiftLeft(first, expr);
                case ">>=":
                    return new ShiftRight(first, expr);
                case ">>>=":
                    return new UnsignedShiftRight(first, expr);
            }
            return expr;
        }

        public List<Expression> visitExpressionList(JavaFiveGrammarParser.ExpressionListContext ctx) throws
                                                                                                     ASTException
        {
            List<Expression> expressionList = new ArrayList<>();
            // no arguments
            if (ctx == null)
            {
                return expressionList;
            }

            for (JavaFiveGrammarParser.ExpressionContext expr : ctx.expression())
            {
                expressionList.add(visitExpression(expr));
            }
            return expressionList;
        }


        public Expression visitParExpression(JavaFiveGrammarParser.ParExpressionContext ctx) throws
                                                                                             ASTException
        {
            return visitExpression(ctx.expression());
        }

        private Expression makePostOrPreIncrement(Expression expr, boolean add, boolean postfix)
        {
            if (!(expr instanceof Identifier || expr instanceof This))
            {
                throw new ASTException("Variable expected but got " + expr);
            }
            return add ? new Increment(expr, postfix) : new Decrement(expr, postfix);
        }
    }

    static class ASTErrorListener implements ANTLRErrorListener
    {

        @Override
        public void syntaxError(
                Recognizer<?, ?> recognizer,
                Object o,
                int line,
                int column,
                String s,
                RecognitionException e)
        {
            throw new ASTException(s + " in line " + line + ":" + column);
        }

        @Override
        public void reportAmbiguity(
                Parser parser,
                DFA dfa,
                int i,
                int i1,
                boolean b,
                BitSet bitSet,
                ATNConfigSet atnConfigSet)
        {

        }

        @Override
        public void reportAttemptingFullContext(
                Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet)
        {

        }

        @Override
        public void reportContextSensitivity(
                Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet)
        {

        }
    }
}
