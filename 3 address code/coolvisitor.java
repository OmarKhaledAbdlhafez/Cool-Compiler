import org.antlr.v4.runtime.ParserRuleContext;
public  coolvisitor  extends CoolRulesBaseVisitor {
    int tcounts=0 , lcounts=0;
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
  @Override
    public Object visitExpressions(CoolRulesParser.ExpressionsContext ctx) {
        String temp = "";
        Object left = visit(ctx.stmt(0));
        Object right = visit(ctx.stmt(1));
        switch(ctx.getChild(1).getText()){
            case "+":
                temp = left +" + " + right ;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "-":
                temp = left + " - " + right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "*":
                temp = left + " * " + right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "/" :
                temp = left + " / " + right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "<":
                temp = left + " < " +right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "<=":
                temp = left + " <= " +right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            case "=":
                temp = left + " == " +right;
                System.out.println("t" + tcount +" = " + temp + ";" );
                tcount++;
                break;
            default:
                System.out.println("not valid operation ");

        }
        return "t"+(tcount-1) ;
    }
      @Override
    public Object visitLoops(CoolRulesParser.LoopsContext ctx) {

        System.out.println("L"+lcount+":");
        lcount++;
        visit(ctx.stmt(0));
        System.out.println("    IfZ  " +"t"+(tcount-1)+"  Goto  "+"L"+lcount+";");
        visit(ctx.stmt(1));
        System.out.println("Goto  "+"L"+(lcount-1)+";");
        System.out.println("L"+lcount+":");

        return "";
    }
        
}
