package de.unituebingen.compilerbau.typing;

import de.unituebingen.compilerbau.ast.*;
import de.unituebingen.compilerbau.ast.expression.Binary;
import de.unituebingen.compilerbau.ast.expression.DotOperator;
import de.unituebingen.compilerbau.ast.expression.Identifier;
import de.unituebingen.compilerbau.ast.expression.Ternary;
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
import de.unituebingen.compilerbau.exception.TypeCheckException;

import java.util.List;
import java.util.Map;

public class TypeChecker implements ASTVisitor {
    private final Environment env = new Environment();
    private Map<String, Clazz> clazzes = null;
    private String current = null;

    /**
     *
     * @param input Abstract Syntax tree
     * @return true, if the input has no type errors
     */
    public boolean check(Map<String, Clazz> input) throws TypeCheckException {
        this.clazzes = input;
        for (String name: input.keySet()) {
            this.current = name;
            this.checkClazz(input.get(name));
        }

        return true;
    }

    private void checkClazz(Clazz clazz) throws TypeCheckException {
        checkFields(clazz.fields);

        env.openScope();
        for (Field field: clazz.fields)
            env.addToScope(new Identifier(field.getName(), field.getType()));

        for (Method meth: clazz.methods) {
            env.openScope();

            for (Identifier param: meth.parameters)
                env.addToScope(param);

            meth.body.visit(this);
            System.out.println(meth.body.getType());
            if (!meth.body.getType().equals(meth.returnType))
                throw new TypeCheckException("Returned value does not match declared type in '" + meth.name + "'");

            env.closeScope();
        }
        env.closeScope();
    }

    private void checkFields(List<Field> fields) {
        for (Field field: fields) {
            if (field.expression != null) {
                field.expression.visit(this);
                if (!field.getType().equals(field.expression.getType()))
                    throw new TypeCheckException("lhs and rhs of an assignment must be of the same type");
            }
        }
    }

    private void expect(Type t, Expression exp) throws TypeCheckException {
        exp.visit(this);
        if (!exp.getType().equals(t))
            throw new TypeCheckException("Expected type " + t.name + ", got " + exp.getType().name);
    }

    private void expectSame(Expression expr1, Expression expr2) throws TypeCheckException {
        expr1.visit(this);
        expect(expr1.getType(), expr2);
    }

    private void checkBinary(Type argT, Type retT, Binary bin) {
        expect(argT, bin.left);
        expect(argT, bin.right);
        bin.setType(retT);
    }

    @Override
    public void visit(Identifier identifier) throws TypeCheckException {
        if (identifier.name.equals("this"))
            identifier.setType(new Type(current));
        else {
            Type type = this.env.lookup(identifier.name);
            if (type == null)
                throw new TypeCheckException("Name '" + identifier.name + "' is not declared");

            identifier.setType(type);
        }
    }

    @Override
    public void visit(IntLiteral intLiteral) throws TypeCheckException {
        // Nothing to do here...
    }

    @Override
    public void visit(BooleanLiteral booleanLiteral) throws TypeCheckException {
        // Nothing to do here...
    }

    @Override
    public void visit(CharLiteral charLiteral) throws TypeCheckException {
        // Nothing to do here...
    }

    @Override
    public void visit(DotOperator dotOperator) throws TypeCheckException {
        Clazz clazz;
        boolean isStatic = false;
        if (dotOperator.left instanceof Identifier &&
                clazzes.containsKey(((Identifier) dotOperator.left).name)) {
            // Static?
            clazz = clazzes.get(((Identifier) dotOperator.left).name);
            ((Identifier) dotOperator.left).setType(new Type(((Identifier) dotOperator.left).name));
            isStatic = true;
        } else {
            dotOperator.left.visit(this);
            clazz = this.clazzes.get(dotOperator.left.getType().name);
        }

        Field field = clazz.fieldByName(dotOperator.right);
        // Does the field exist? Is it static?
        if (field == null)
            throw new TypeCheckException("Field '" + dotOperator.right + "' does not exits");
        if (field.access != AccessModifier.PUBLIC)
            throw new TypeCheckException("Field '" + dotOperator.right + "' is not public");

        if (isStatic && !field.isStatic)
            throw new TypeCheckException("Field is not static");
        else if (!isStatic && field.isStatic)
            throw new TypeCheckException("Non static field cannot be accessed on class");

        dotOperator.setStatic(field.isStatic);
        dotOperator.setType(field.getType());
    }

    @Override
    public void visit(Add add) throws TypeCheckException {
        expectSame(add.left, add.right);
        if (add.left.getType().equals(Type.INT) || add.left.getType().equals(Type.CHAR))
            add.setType(add.left.getType());
        else
            throw new TypeCheckException("Addition is only defined on INT and CHAR");
    }

    @Override
    public void visit(Divide divide) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, divide);
    }

    @Override
    public void visit(Multiply multiply) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, multiply);
    }

    @Override
    public void visit(Remainder reminder) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, reminder);
    }

    @Override
    public void visit(Subtract subtract) throws TypeCheckException {
        expectSame(subtract.left, subtract.right);
        if (subtract.left.getType().equals(Type.INT) || subtract.left.getType().equals(Type.CHAR))
            subtract.setType(subtract.left.getType());
        else
            throw new TypeCheckException("Subtraction is only defined on INT and CHAR");
    }

    @Override
    public void visit(And and) throws TypeCheckException {
        checkBinary(Type.BOOLEAN, Type.BOOLEAN, and);
    }

    @Override
    public void visit(Or or) throws TypeCheckException {
        checkBinary(Type.BOOLEAN, Type.BOOLEAN, or);
    }

    @Override
    public void visit(BitAnd bitand) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, bitand);
    }

    @Override
    public void visit(BitOr bitor) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, bitor);
    }

    @Override
    public void visit(BitXOR bitxor) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, bitxor);
    }

    @Override
    public void visit(ShiftLeft shiftLeft) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, shiftLeft);
    }

    @Override
    public void visit(ShiftRight shiftRight) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, shiftRight);
    }

    @Override
    public void visit(UnsignedShiftRight unsignedShiftRight) throws TypeCheckException {
        checkBinary(Type.INT, Type.INT, unsignedShiftRight);
    }

    @Override
    public void visit(Ternary ternary) throws TypeCheckException {
        expect(Type.BOOLEAN, ternary.first);
        expectSame(ternary.second, ternary.third);
        ternary.setType(ternary.second.getType());
    }

    @Override
    public void visit(Equal equal) throws TypeCheckException {
        expectSame(equal.left, equal.right);
        equal.setType(Type.BOOLEAN);
    }

    @Override
    public void visit(Greater greater) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, greater);
    }

    @Override
    public void visit(GreaterOrEqual greaterOrEqual) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, greaterOrEqual);
    }

    @Override
    public void visit(Less less) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, less);
    }

    @Override
    public void visit(LessOrEqual lessOrEqual) throws TypeCheckException {
        checkBinary(Type.INT, Type.BOOLEAN, lessOrEqual);
    }

    @Override
    public void visit(NotEqual notEqual) throws TypeCheckException {
        expectSame(notEqual.left, notEqual.right);
        notEqual.setType(Type.BOOLEAN);
    }

    @Override
    public void visit(Negate negate) throws TypeCheckException {
        expect(Type.INT, negate.expression);
        negate.setType(Type.INT);
    }

    @Override
    public void visit(Not not) throws TypeCheckException {
        expect(Type.BOOLEAN, not.expression);
        not.setType(Type.BOOLEAN);
    }

    @Override
    public void visit(Increment increment) throws TypeCheckException {
        expect(Type.INT, increment.expression);
        increment.setType(Type.INT);
    }

    @Override
    public void visit(Decrement decrement) throws TypeCheckException {
        expect(Type.INT, decrement.expression);
        decrement.setType(Type.INT);
    }

    @Override
    public void visit(Assignment assignment) throws TypeCheckException {
        expectSame(assignment.left, assignment.right);
        assignment.setType(assignment.left.getType());
    }

    @Override
    public void visit(MethodCall methodCall) throws TypeCheckException {
        Clazz clazz;
        boolean isStatic = false;
        if (methodCall.expr != null) {
            if (methodCall.expr instanceof Identifier &&
                this.clazzes.containsKey(((Identifier) methodCall.expr).name)) {
                // Static?
                clazz = clazzes.get(((Identifier) methodCall.expr).name);
                ((Identifier) methodCall.expr).setType(new Type(((Identifier) methodCall.expr).name));
                isStatic = true;
            } else {
                // Called on object
                methodCall.expr.visit(this);
                clazz = this.clazzes.get(methodCall.expr.getType().name);
            }
        } else
            // Called on this
            clazz = clazzes.get(current);

        // Evaluate arguments
        for (Expression arg: methodCall.args)
            arg.visit(this);
        Method method = clazz.findMethod(methodCall.name, methodCall.args);

        // Does the method exist? Is it public?
        if (method == null)
            throw new TypeCheckException("Method '" + methodCall.name + "' is not defined in '" + clazz.name + "'");
        if (method.access != AccessModifier.PUBLIC)
            throw new TypeCheckException("'" + method.name + "' cannot be accessed");

        // Is a static method called on an object?
        if (isStatic && !method.isStatic)
            throw new TypeCheckException("Method is not static");
        else if (!isStatic && method.isStatic)
            throw new TypeCheckException("Non static method cannot be called on class");

        methodCall.setMethod(method);
        methodCall.isStatic = method.isStatic;
        methodCall.setType(method.returnType);
    }

    @Override
    public void visit(New _new) throws TypeCheckException {
        Clazz clazz = clazzes.get(_new.getType().name);
        if (clazz == null)
            throw new TypeCheckException("'" + _new.getType().name + "' does not exist");

        // Evaluate arguments
        for (Expression arg: _new.args)
            arg.visit(this);

        Method constructor = clazz.findMethod(_new.getType().name, _new.args);
        // Default constructor?
        if (constructor == null && !_new.args.isEmpty())
            throw new TypeCheckException("Default constructor takes no arguments");
    }

    @Override
    public void visit(For _for) throws TypeCheckException {
        env.openScope();
        if (_for.init != null ) _for.init.visit(this);
        if (_for.termination != null) expect(Type.BOOLEAN, _for.termination);
        if (_for.increment != null) _for.increment.visit(this);
        _for.body.visit(this);
        _for.setType(_for.body.getType());
        env.closeScope();
    }

    @Override
    public void visit(If _if) throws TypeCheckException {
        env.openScope();
        expect(Type.BOOLEAN, _if.condition);

        env.openScope();
        _if.body.visit(this);
        _if.setType(_if.body.getType());
        env.closeScope();

        if (_if.elseBody != null) {
            env.openScope();
            _if.elseBody.visit(this);
            if (!_if.body.getType().equals(_if.elseBody.getType()))
                throw new TypeCheckException("Inconsistent return types");

            env.closeScope();
        }
        env.closeScope();
    }

    @Override
    public void visit(LocalVarDeclaration localVarDeclaration) throws TypeCheckException {
        // LocalVarDeclaration has its type already set by the parser!
        this.env.addToScope(new Identifier(localVarDeclaration.name, localVarDeclaration.getType()));
        if (localVarDeclaration.expression != null) {
            localVarDeclaration.expression.visit(this);
            if (!localVarDeclaration.expression.getType().equals(localVarDeclaration.getType()))
                throw new TypeCheckException("Assigned value does not match the declared type of '" +
                        localVarDeclaration.getType() + "'");
        }
        localVarDeclaration.setType(Type.VOID);
    }

    @Override
    public void visit(Return _return) throws TypeCheckException {
        if (_return.expr == null)
            _return.setType(Type.VOID);
        else {
            _return.expr.visit(this);
            _return.setType(_return.expr.getType());
        }
    }

    @Override
    public void visit(While _while) throws TypeCheckException {
        env.openScope();
        expect(Type.BOOLEAN, _while.condition);
        _while.body.visit(this);
        _while.setType(_while.body.getType());
        env.closeScope();
    }

    @Override
    public void visit(Block block) throws TypeCheckException {
        env.openScope();
        Type type = Type.VOID;
        for (Statement stmt: block.body) {
            stmt.visit(this);
            // Statement expressions are all void (as statements)
            if (!(stmt instanceof StatementExpression))
                type = mergeType(type, stmt.getType());
        }
        block.setType(type);
        env.closeScope();
    }

    private Type mergeType(Type a, Type b) throws TypeCheckException {
        // TODO: Refactor this shit show!
        if (a.equals(Type.VOID))
            return b;
        if (b.equals(Type.VOID))
            return a;
        if (!a.equals(b))
            throw new TypeCheckException("Conflicting return types");
        return a;
    }
}
