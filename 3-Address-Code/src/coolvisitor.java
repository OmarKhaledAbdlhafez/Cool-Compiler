//import org.antlr.v4.runtime.ParserRuleContext;

import javax.swing.*;

public class CoolVisitor extends CoolRulesBaseVisitor {

    int t_cnt = 0, l_cnt = 0, r_cnt = 0;

    @Override public Object visitProgram(CoolRulesParser.ProgramContext ctx) {
        System.out.println("");
        for(var classs: ctx.classDefinition()) {
            visit(classs);
        }
        return "";
    }

    @Override public Object visitClassDefinition(CoolRulesParser.ClassDefinitionContext ctx) {
        String className = ctx.TYPE(0).getText();
        System.out.println(className + ":");
        visit(ctx.body());
        return "";
    }


    @Override public Object visitBody(CoolRulesParser.BodyContext ctx) {
        for (var child: ctx.children) {
            visit(child);
        }
        return "";
    }


    @Override public Object visitAttr(CoolRulesParser.AttrContext ctx) {
        if(ctx.getChildCount() > 4) {
            String className = ctx.TYPE().getText();
            String attrName = ctx.IDENTIFIER().getText();
            System.out.println("\t" + className + "." + attrName + " = " + visit(ctx.stmt()));
        }
        return "";
    }


    @Override public Object visitMethod(CoolRulesParser.MethodContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        System.out.println("\t" + methodName + ":");
        System.out.println("\t\tBeginFunc;");
        visit(ctx.stmt());
        System.out.println("\t\tEndFunc;");
        return "";
    }


    @Override public Object visitParameter(CoolRulesParser.ParameterContext ctx) {
        return ctx.IDENTIFIER();
    }


    @Override public Object visitNew(CoolRulesParser.NewContext ctx) {
        return "new " + ctx.TYPE().getText();
    }


    @Override public Object visitIdentifier(CoolRulesParser.IdentifierContext ctx) {
        return ctx.IDENTIFIER().getText();
    }


    @Override public Object visitNot(CoolRulesParser.NotContext ctx) {
        return "! " + visit(ctx.stmt());
    }


    @Override public Object visitString(CoolRulesParser.StringContext ctx) {
        return ctx.STRING().getText();
    }


    @Override public Object visitIsvoid(CoolRulesParser.IsvoidContext ctx) {
        return "isvoid " + ctx.stmt();
    }


    @Override public Object visitWhile(CoolRulesParser.WhileContext ctx) {
        String startLabel = "L" + l_cnt++;
        System.out.println("\t" + startLabel + ":");
        String condition = visit(ctx.stmt(0)).toString();
        String endLabel = "L" + l_cnt++;
        System.out.println("\t\tIfZ " + condition + " Goto " + endLabel + ";");
        visit(ctx.stmt(1));
        System.out.println("\t\tGoto " + startLabel + ";");
        System.out.println("\t" + endLabel + ":");
        return "";
    }


    @Override public Object visitTilde(CoolRulesParser.TildeContext ctx) {
        return "~ " + visit(ctx.stmt());
    }


    @Override public Object visitInt(CoolRulesParser.IntContext ctx) {
        return ctx.INTEGER().getText();
    }


    @Override public Object visitMethodCall(CoolRulesParser.MethodCallContext ctx) {
        for(var st: ctx.stmt()) {
            String paramValue = visit(st).toString();
            System.out.println("\t\tt" + t_cnt + " = " + paramValue + ";");
            System.out.println("\t\tPushParam t" + t_cnt++ + ";");
        }
        System.out.println("\t\tPushRefParam r" + r_cnt + ";");
        System.out.println("\t\tLCall " + ctx.IDENTIFIER().getText() + ";");
        System.out.println("\t\tPopParams;");
        return "r" + r_cnt++;
    }


    @Override public Object visitParenStmt(CoolRulesParser.ParenStmtContext ctx) {
        return visit(ctx.stmt());
    }


    @Override public Object visitCalling(CoolRulesParser.CallingContext ctx) {
        return "";
    }


    @Override public Object visitBlock(CoolRulesParser.BlockContext ctx) {
        for(var st: ctx.stmt()){
            visit(st);
        }
        return "";
    }


    @Override public Object visitLet(CoolRulesParser.LetContext ctx) {
        int sz= ctx.stmt().size() - 1;
        //System.out.println(sz);
        for(int i = 0; i < sz; ++i) {
            String id = ctx.IDENTIFIER(i).getText();
            System.out.println("\t\t" + id + " = " + visit(ctx.stmt(i)) + ";");
        }
        visit(ctx.stmt(sz));
        //System.out.println(ctx.stmt(sz).getText());
        return "";
    }


    @Override public Object visitExpr(CoolRulesParser.ExprContext ctx) {
        String temp = "";
        Object left = visit(ctx.stmt(0));
        Object right = visit(ctx.stmt(1));
        switch(ctx.getChild(1).getText()){
            case "+":
                temp = left +" + " + right ;
                System.out.println("\t\tt" + t_cnt++ + " = " + temp + ";");
                break;
            case "-":
                temp = left + " - " + right;
                System.out.println("\t\tt" + t_cnt++ + " = " + temp + ";");
                break;
            case "*":
                temp = left + " * " + right;
                System.out.println("\t\tt" + t_cnt++ + " = " + temp + ";");
                break;
            case "/" :
                temp = left + " / " + right;
                System.out.println("\t\tt" + t_cnt++ + " = " + temp + ";");
                break;
            case "<":
                temp = left + " < " + right;
                System.out.println("\t\tt" + t_cnt++ + " = " + temp + ";");
                break;
            case "<=":
                temp = left + " <= " + right;
                System.out.println("\t\tt" + t_cnt++ + " = " + temp + ";");
                break;
            case "=":
                temp = left + " == " +right;
                System.out.println("\t\tt" + t_cnt++ + " = " + temp + ";");
                break;
            default:
                System.out.println("non-valid operation");

        }
        return "t" + (t_cnt - 1);
    }


    @Override public Object visitIf(CoolRulesParser.IfContext ctx) {
        String condition = visit(ctx.stmt(0)).toString();
        String falseLabel = "L" + l_cnt++;
        System.out.println("\t\tIfZ " + condition + " Goto " + falseLabel + ";");
        visit(ctx.stmt(1));
        String endLabel = "";
        if(ctx.stmt().size() > 2) {
            endLabel = "L" + l_cnt++;
            System.out.println("\t\tGoto " + endLabel + ";");
            System.out.println("\t" + falseLabel + ":");
            visit(ctx.stmt(2));
        }
        else {
            endLabel = falseLabel;
        }
        System.out.println("\t" + endLabel + ":");
        return "";
    }


    @Override public Object visitCase(CoolRulesParser.CaseContext ctx) {
        String val = "t" + t_cnt++;
        System.out.println("\t\t" + val + " = " + visit(ctx.stmt(0)).toString() + ";");
        //int curLabel = l_cnt;
        int sz = ctx.stmt().size();
        String endLabel = "L" + (l_cnt + sz / 2 + 1);
        // generate labels with their statements
        for(int i = 1; i < sz; ++i) {
            System.out.println("\tL" + l_cnt + ":");
            String condition = val + " of type " + ctx.TYPE(i - 1);
            System.out.println("\t\tIfZ " + condition + " Goto L" + ++l_cnt + ";");
            System.out.println("\t\t" + ctx.IDENTIFIER(i - 1) + " = " + val);
            //System.out.println("\t\tGoto " + curLabel++ + ";");
            visit(ctx.stmt(i));
            System.out.println("\t\tGoto " + endLabel + ";");
        }
        System.out.println("\t" + endLabel + ":");
        return "";
    }


    @Override public Object visitAssign(CoolRulesParser.AssignContext ctx) {
        System.out.println("\t\t" + ctx.IDENTIFIER() + " = " + visit(ctx.stmt()) + ";");
        return"";
    }

}
