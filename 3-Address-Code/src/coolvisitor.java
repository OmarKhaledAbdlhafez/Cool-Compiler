import org.antlr.v4.runtime.ParserRuleContext;

public coolvisitor extends CoolRulesBaseVisitor {

    int tcnt = 0, lcnt = 0;

    @Override public T visitProgram(CoolRulesParser.ProgramContext ctx){

    }

    @Override public T visitClassDefinition(CoolRulesParser.ClassDefinitionContext ctx) {

    }


    @Override public T visitBody(CoolRulesParser.BodyContext ctx) {

    }


    @Override public T visitAttr(CoolRulesParser.AttrContext ctx) {

    }


    @Override public T visitMethod(CoolRulesParser.MethodContext ctx) {

    }


    @Override public T visitParameter(CoolRulesParser.ParameterContext ctx) {

    }


    @Override public T visitNew(CoolRulesParser.NewstmtContext ctx) {

    }


    @Override public Object visitIdentifier(CoolRulesParser.IdentifierContext ctx) {
        return ctx.IDENTIFIER();

    }


    @Override public T visitInvert(CoolRulesParser.InvertContext ctx) {

    }


    @Override public T visitString(CoolRulesParser.StringContext ctx) {
        return ctx.STRING ();

    }


    @Override public T visitIsvoid(CoolRulesParser.IsvoidContext ctx) {

    }


    @Override public Object visitWhile(CoolRulesParser.WhileContext ctx) {
        System.out.println("t"+tcnt+" = "+visit(ctx.stmt(0))+";");
        tcnt++;
        System.out.println("while t"+(tcnt-1)+"goto L"+lcnt+";");
        lcnt++;
        System.out.println("goto L"+lcnt+";");
        System.out.println("L"+(lcnt-1)+":");
        System.out.println(visit(ctx.stmt(1)));    
        return "";
    }


    @Override public T visitTilde(CoolRulesParser.TildeContext ctx) {

    }


    @Override public Object visitInt(CoolRulesParser.IntContext ctx) {
        return ctx.INTEGER()  ;

    }


    @Override public T visitMethodcall(CoolRulesParser.MethodcallContext ctx) {

    }


    @Override public T visitStatem(CoolRulesParser.StatemContext ctx) {

    }


    @Override public T visitCalling(CoolRulesParser.CallingContext ctx) {

    }


    @Override public T visitBlock(CoolRulesParser.BlockContext ctx) {

    }


    @Override public T visitLet(CoolRulesParser.LetContext ctx) {

    }


    @Override public Object visitExpr(CoolRulesParser.ExprContext ctx) {
         String temp = "";
        Object left = visit(ctx.stmt(0));
        Object right = visit(ctx.stmt(1));
        switch(ctx.getChild(1).getText()){
            case "+":
                temp = left +" + " + right ;
                System.out.println("t" + tcnt +" = " + temp + ";" );
                tcnt++;
                break;
            case "-":
                temp = left + " - " + right;
                System.out.println("t" + tcnt +" = " + temp + ";" );
                tcnt++;
                break;
            case "*":
                temp = left + " * " + right;
                System.out.println("t" + tcnt +" = " + temp + ";" );
                tcnt++;
                break;
            case "/" :
                temp = left + " / " + right;
                System.out.println("t" + tcnt +" = " + temp + ";" );
                tcnt++;
                break;
            case "<":
                temp = left + " < " +right;
                System.out.println("t" + tcnt +" = " + temp + ";" );
                tcnt++;
                break;
            case "<=":
                temp = left + " <= " +right;
                System.out.println("t" + tcnt +" = " + temp + ";" );
                tcnt++;
                break;
            case "=":
                temp = left + " == " +right;
                System.out.println("t" + tcnt +" = " + temp + ";" );
                tcnt++;
                break;
            default:
                System.out.println("not valid operation ");

        }
        return "";

    }


    @Override public T visitIf(CoolRulesParser.IfContext ctx) {

    }


    @Override public T visitCase(CoolRulesParser.CaseContext ctx) {

    }


    @Override public Object visitAssign(CoolRulesParser.AssignContext ctx) {
         System.out.println(ctx.IDENTIFIER()+" = " + visit(ctx.stmt())+";");
        return"";

    }

}
