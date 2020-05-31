import org.antlr.v4.runtime.ParserRuleContext;
import java.sql.SQLOutput;
public  coolvisitor  extends CoolRulesBaseVisitor {
@Override public Object visitProgram(CoolRulesParser.ProgramContext ctx) {
    return visitChildren(ctx);
}
@Override public Object visitIdentifier(CoolRulesParser.IdentifierContext ctx) {
    return ctx.IDENTIFIER();
}
@Override public Object visitString(CoolRulesParser.StringContext ctx) {
    return ctx.STRING() ;
}
@Override public Object visitInt(CoolRulesParser.IntContext ctx) {
    return ctx.INTEGER()  ;
}
@Override public T visitAssignment(CoolRulesParser.AssignmentContext ctx) {
        System.out.println("    "+ ctx.IDENTIFIER()+" = " + visit(ctx.stmt())+";");
        return"";
}
        }