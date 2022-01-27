package de.unituebingen.compilerbau.scanner;

import de.unituebingen.compilerbau.ast.*;
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
import de.unituebingen.compilerbau.ast.statementexpressions.Assignment;
import de.unituebingen.compilerbau.ast.statementexpressions.MethodCall;
import de.unituebingen.compilerbau.ast.statementexpressions.New;
import de.unituebingen.compilerbau.ast.statementexpressions.StatementExpression;
import de.unituebingen.compilerbau.ast.statements.*;
import de.unituebingen.compilerbau.exception.ASTException;
import de.unituebingen.compilerbau.scanner.generated.JavaFiveGrammarLexer;
import de.unituebingen.compilerbau.scanner.generated.JavaFiveGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ScannerParser
{
    public Clazz parse(String sourceCode) throws IOException, ASTException
    {
        CharStream input = CharStreams.fromString(sourceCode);
        JavaFiveGrammarLexer lexer = new JavaFiveGrammarLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        JavaFiveGrammarParser parser = new JavaFiveGrammarParser(tokenStream);

        return new ParseTreeVisitor().visitJavaProgram(parser.javaProgram());
    }

    public static void main(String[] args) throws IOException
    {
        new ScannerParser().parse("int a = 0");
    }

    class ParseTreeVisitor
    {
        public Clazz visitJavaProgram(JavaFiveGrammarParser.JavaProgramContext ctx)
        {
            return visitClazz(ctx.clazz());
        }

        public Clazz visitClazz(JavaFiveGrammarParser.ClazzContext ctx)
        {
            AccessModifier modifier = ctx.AccessModifier().getText().equals("public")
                    ? AccessModifier.PUBLIC
                    : AccessModifier.PRIVATE;
            String name = ctx.Identifier().getText();
            List<Field> fields = new ArrayList<>();
            List<Method> methods = new ArrayList<>();

            for (int i = 0; i < ctx.fieldOrMethod().size(); i++)
            {
                JavaFiveGrammarParser.FieldOrMethodContext fieldOrMethod = ctx.fieldOrMethod(i);
                ParseTree child = fieldOrMethod.getChild(0);
                if (child instanceof JavaFiveGrammarParser.FieldContext)
                {
                    Field field = visitField((JavaFiveGrammarParser.FieldContext) child);
                    fields.add(field);
                } else
                {
                    Method method = visitMethod((JavaFiveGrammarParser.MethodContext) child);
                    methods.add(method);
                }
            }

            return new Clazz(modifier, name, fields, methods);
        }

        public Method visitMethod(JavaFiveGrammarParser.MethodContext ctx)
        {
            AccessModifier modifier = ctx.AccessModifier().getText().equals("public")
                    ? AccessModifier.PUBLIC
                    : AccessModifier.PRIVATE;
            boolean isStatic = ctx.Static() != null;
            Type returnType = visitType(ctx.type());
            String name = ctx.Identifier().getText();
            Map<String, Type> parameters = visitMethodParameterList(ctx.methodParameterList());
            Block body = visitBlockStatement(ctx.blockStatement());
            return new Method(modifier, isStatic, name, returnType, parameters, body);
        }

        public Map<String, Type> visitMethodParameterList(JavaFiveGrammarParser.MethodParameterListContext ctx)
        {
            Map<String, Type> parameters = new HashMap<>();

            for (int i = 0; i < ctx.type().size(); i++)
            {
                Type type = visitType(ctx.type(i));
                String name = ctx.Identifier(i).getText();
                parameters.put(name, type);
            }

            return parameters;
        }

        public Field visitField(JavaFiveGrammarParser.FieldContext ctx)
        {
            AccessModifier modifier = ctx.AccessModifier().getText().equals("public")
                    ? AccessModifier.PUBLIC
                    : AccessModifier.PRIVATE;
            boolean isStatic = ctx.Static() != null;
            LocalVarDeclaration decl =
                    visitLocalVarDeclarationStatement(ctx.localVarDeclarationStatement());
            // TODO how to deal with declarations and assignments??
            return new Field(null, modifier, isStatic, decl.name, null);
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

            throw new ASTException("Unknown statement: " + ctx.getText());
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
            if (ctx.getChild(2) instanceof JavaFiveGrammarParser.LocalVarDeclarationStatementContext)
            {
                init = visitLocalVarDeclarationStatement(ctx.localVarDeclarationStatement());
            }
            if (ctx.getChild(4) instanceof JavaFiveGrammarParser.ExpressionContext)
            {
                termination = visitExpression(ctx.expression());
            }
            if (ctx.getChild(6) instanceof JavaFiveGrammarParser.StatementExpressionContext)
            {
                increment = visitStatementExpression(ctx.statementExpression());
            }
            // body is mandatory
            Statement body = visitStatement(ctx.statement());
            return new For(init, termination, increment, body);
        }

        public LocalVarDeclaration visitLocalVarDeclarationStatement(JavaFiveGrammarParser.LocalVarDeclarationStatementContext ctx)
        {
            Type type = visitType(ctx.type());
            Identifier identifier = new Identifier(ctx.Identifier().getText(), null);
            Expression assignment = null;
            if (ctx.getChildCount() == 4)
            {
                assignment = visitExpression(ctx.expression());
            }
            LocalVarDeclaration decl = new LocalVarDeclaration(identifier.name, assignment);
            decl.setType(type);
            return decl;
        }

        public Return visitReturn(JavaFiveGrammarParser.ReturnStatementContext ctx)
        {
            return new Return(visitExpression(ctx.expression()));
        }

        public Statement visitStatementExpression(JavaFiveGrammarParser.StatementExpressionContext ctx)
        {
            Expression expr = visitExpression(ctx.expression());
            if (expr instanceof StatementExpression)
            {
                return (Statement) expr;
            }
            throw new ASTException("Statement expected but got " + expr);
        }

        public Type visitType(JavaFiveGrammarParser.TypeContext ctx)
        {
            return new Type(ctx.Primitive() == null
                    ? ctx.Identifier().getText()
                    : ctx.Primitive().getText());
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
                        case "*":
                            return new Multiply(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "/":
                            return new Divide(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "%":
                            return new Remainder(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "+":
                            return new Add(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "-":
                            return new Subtract(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "<<":
                            return new ShiftLeft(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case ">>":
                            return new ShiftRight(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case ">>>":
                            return new UnsignedShiftRight(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "<":
                            return new Less(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case ">":
                            return new Greater(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "<=":
                            return new LessOrEqual(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case ">=":
                            return new GreaterOrEqual(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "==":
                            return new Equal(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "!=":
                            return new NotEqual(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "&":
                            return new BitAnd(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "^":
                            return new BitXOR(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "|":
                            return new BitOr(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "&&":
                            return new And(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                        case "||":
                            return new Or(
                                    visitExpression(ctx.expression(0)),
                                    visitExpression(ctx.expression(1))
                            );
                    }
                    break;
                // Ternary expression
                case 5:
                    return new Ternary(
                            visitExpression(ctx.expression(0)),
                            visitExpression(ctx.expression(1)),
                            visitExpression(ctx.expression(2))
                    );
                default:
                    throw new ASTException("Not an expression: " + ctx.getText());
            }

            return null;
        }

        public Expression visitMethodCall(JavaFiveGrammarParser.MethodCallContext ctx)
        {
            String name = null;
            TerminalNode terminal = ctx.Identifier(0);
            if (terminal == null)
            {
                terminal = ctx.This();
                if (terminal == null)
                {
                    throw new ASTException("Expected variable or this.");
                }
            }
            name = terminal.getText();
            // TODO how to make chain calls?? Is there an AST element missing?
            return new MethodCall(null, name, visitExpressionList(ctx.expressionList()));
        }


        public Expression visitNewExp(JavaFiveGrammarParser.NewExpContext ctx)
        {
            return new New(visitExpressionList(ctx.expressionList()));
        }

        public Expression visitAssignment(JavaFiveGrammarParser.AssignmentContext ctx)
        {
            List<TerminalNode> identifierList = ctx.Identifier();
            Expression part = null;

            for (int i = identifierList.size() - 1; i >= 1; i--)
            {
                Identifier identifier = new Identifier(identifierList.get(i).getText(), null);

                if (i == identifierList.size() - 1)
                {
                    // init part with most right expression
                    // e.g a = .... = z = 1
                    part = new Assignment(identifier, visitExpression(ctx.expression()));
                } else
                {
                    // case: a = ... d = e = ... = 1
                    part = new Assignment(identifier, part);
                }
            }

            return new Assignment(new Identifier(identifierList.get(0).getText(), null), part);
        }


        public List<Expression> visitExpressionList(JavaFiveGrammarParser.ExpressionListContext ctx) throws
                                                                                                     ASTException
        {
            List<Expression> expressionList = new ArrayList<>();
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

            if (!(expr instanceof Identifier) || ((Identifier) expr).name.equals("this"))
            {
                throw new ASTException("Variable expected but got " + expr);
            }
            // TODO how to distinguish between ++a and a++?
            return new Assignment(
                    expr,
                    add ? new Add(expr, new IntLiteral(1)) : new Subtract(expr, new IntLiteral(1))
            );

        }

        private List<Statement> verifyStatementExpressions(List<Expression> expressionList)
        {
            for (Expression expr : expressionList)
            {
                if (!(expr instanceof StatementExpression))
                {
                    throw new ASTException("Statement expected but got " + expr);
                }
            }
            return expressionList.stream().map(exp -> (Statement) exp).collect(Collectors.toList());
        }
    }
}
