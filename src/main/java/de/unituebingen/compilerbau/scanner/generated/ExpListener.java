// Generated from Exp.g4 by ANTLR 4.3
package de.unituebingen.compilerbau.scanner.generated;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpParser}.
 */
public interface ExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(@NotNull ExpParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(@NotNull ExpParser.AtomExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(@NotNull ExpParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(@NotNull ExpParser.EvalContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExpParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(@NotNull ExpParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#multiplyExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(@NotNull ExpParser.MultiplyExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExpParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(@NotNull ExpParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#additionExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(@NotNull ExpParser.AdditionExpContext ctx);
}