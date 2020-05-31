// Generated from C:/Users/Ismail El-Toukhy/repos/Cool-Compiler/3-Address-Code/src\CoolRules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolRulesParser}.
 */
public interface CoolRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolRulesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolRulesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(CoolRulesParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(CoolRulesParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CoolRulesParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CoolRulesParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(CoolRulesParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(CoolRulesParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(CoolRulesParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(CoolRulesParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CoolRulesParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CoolRulesParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNew(CoolRulesParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNew(CoolRulesParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CoolRulesParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CoolRulesParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invert}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterInvert(CoolRulesParser.InvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invert}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitInvert(CoolRulesParser.InvertContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterString(CoolRulesParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitString(CoolRulesParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(CoolRulesParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(CoolRulesParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CoolRulesParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CoolRulesParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tilde}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterTilde(CoolRulesParser.TildeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tilde}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitTilde(CoolRulesParser.TildeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterInt(CoolRulesParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitInt(CoolRulesParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterMethodcall(CoolRulesParser.MethodcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitMethodcall(CoolRulesParser.MethodcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statem}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStatem(CoolRulesParser.StatemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statem}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStatem(CoolRulesParser.StatemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calling}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCalling(CoolRulesParser.CallingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calling}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCalling(CoolRulesParser.CallingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolRulesParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolRulesParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterLet(CoolRulesParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitLet(CoolRulesParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolRulesParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolRulesParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(CoolRulesParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(CoolRulesParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCase(CoolRulesParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCase(CoolRulesParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CoolRulesParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CoolRulesParser.AssignContext ctx);
}