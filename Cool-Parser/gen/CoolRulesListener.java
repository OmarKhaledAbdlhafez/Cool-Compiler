// Generated from E:/4th CE/2nd Term/PlayGround/Cool-Compiler/src\CoolRules.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CoolRulesParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CoolRulesParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolRulesParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(CoolRulesParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolRulesParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(CoolRulesParser.OpContext ctx);
}