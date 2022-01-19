// Generated from C:/Users/matth/IdeaProjects/compilerbau_ws2021/src/main/java/de/unituebingen/compilerbau/scanner\JavaFiveGrammar.g4 by ANTLR 4.9.2
package de.unituebingen.compilerbau.scanner.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaFiveGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaFiveGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#javaProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaProgram(JavaFiveGrammarParser.JavaProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#clazz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClazz(JavaFiveGrammarParser.ClazzContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(JavaFiveGrammarParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(JavaFiveGrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaFiveGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JavaFiveGrammarParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaFiveGrammarParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#localVarDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDeclarationStatement(JavaFiveGrammarParser.LocalVarDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaFiveGrammarParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaFiveGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#expression()}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaFiveGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JavaFiveGrammarParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#newExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExp(JavaFiveGrammarParser.NewExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JavaFiveGrammarParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFiveGrammarParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JavaFiveGrammarParser.ParExpressionContext ctx);
}