// Generated from C:/Users/matth/IdeaProjects/compilerbau_ws2021/src/main/java/de/unituebingen/compilerbau/scanner\JavaFiveGrammar.g4 by ANTLR 4.9.2
package de.unituebingen.compilerbau.scanner.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaFiveGrammarParser}.
 */
public interface JavaFiveGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#javaProgram}.
	 * @param ctx the parse tree
	 */
	void enterJavaProgram(JavaFiveGrammarParser.JavaProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#javaProgram}.
	 * @param ctx the parse tree
	 */
	void exitJavaProgram(JavaFiveGrammarParser.JavaProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#clazz}.
	 * @param ctx the parse tree
	 */
	void enterClazz(JavaFiveGrammarParser.ClazzContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#clazz}.
	 * @param ctx the parse tree
	 */
	void exitClazz(JavaFiveGrammarParser.ClazzContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#clazzMember}.
	 * @param ctx the parse tree
	 */
	void enterClazzMember(JavaFiveGrammarParser.ClazzMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#clazzMember}.
	 * @param ctx the parse tree
	 */
	void exitClazzMember(JavaFiveGrammarParser.ClazzMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(JavaFiveGrammarParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(JavaFiveGrammarParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(JavaFiveGrammarParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(JavaFiveGrammarParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaFiveGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaFiveGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(JavaFiveGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(JavaFiveGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaFiveGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaFiveGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaFiveGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaFiveGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(JavaFiveGrammarParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(JavaFiveGrammarParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaFiveGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaFiveGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(JavaFiveGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(JavaFiveGrammarParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaFiveGrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaFiveGrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#localVarDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDeclarationStatement(JavaFiveGrammarParser.LocalVarDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#localVarDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDeclarationStatement(JavaFiveGrammarParser.LocalVarDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaFiveGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaFiveGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaFiveGrammarParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaFiveGrammarParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaFiveGrammarParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaFiveGrammarParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaFiveGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaFiveGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#expression()}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaFiveGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#expression()}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaFiveGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JavaFiveGrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JavaFiveGrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#newExp}.
	 * @param ctx the parse tree
	 */
	void enterNewExp(JavaFiveGrammarParser.NewExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#newExp}.
	 * @param ctx the parse tree
	 */
	void exitNewExp(JavaFiveGrammarParser.NewExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaFiveGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaFiveGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaFiveGrammarParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaFiveGrammarParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JavaFiveGrammarParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JavaFiveGrammarParser.ParExpressionContext ctx);
}