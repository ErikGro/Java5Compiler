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
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JavaFiveGrammarParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JavaFiveGrammarParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFiveGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaFiveGrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFiveGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaFiveGrammarParser.ForInitContext ctx);
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