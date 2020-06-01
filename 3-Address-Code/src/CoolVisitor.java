/**
 * overrides some methods in the CoolRulesBaseVisitor class to output the 3-Adress-Code of a cool program
 */
public class CoolVisitor extends CoolRulesBaseVisitor {
    int t_cnt = 0, l_cnt = 0, r_cnt = 0;

    /**
     * responsible for visiting the whole program
     * @param ctx the context of the program
     * @return an empty string
     */
    @Override public Object visitProgram(CoolRulesParser.ProgramContext ctx) {
        System.out.println("");
        for(var classs: ctx.classDefinition()) {
            visit(classs);
        }
        return "";
    }

    /**
     * responsible for visiting the class definition
     * @param ctx the context of the class
     * @return an empty string
     */
    @Override public Object visitClassDefinition(CoolRulesParser.ClassDefinitionContext ctx) {
        String className = ctx.TYPE(0).getText();
        System.out.println(className + ":");
        visit(ctx.body());
        return "";
    }

    /**
     * responsible for visiting the body of the class
     * @param ctx the context of the body
     * @return an empty string
     */
    @Override public Object visitBody(CoolRulesParser.BodyContext ctx) {
        for (var child: ctx.children) {
            visit(child);
        }
        return "";
    }

    /**
     * responsible for visiting an attribute
     * @param ctx the context of the attribute
     * @return an empty string
     */
    @Override public Object visitAttr(CoolRulesParser.AttrContext ctx) {
        if(ctx.getChildCount() > 4) {
            String className = ctx.TYPE().getText();
            String attrName = ctx.IDENTIFIER().getText();
            System.out.println("\t" + className + "." + attrName + " = " + visit(ctx.stmt()));
        }
        return "";
    }

    /**
     * responsible for visiting the class method
     * @param ctx the context of the method
     * @return an empty string
     */
    @Override public Object visitMethod(CoolRulesParser.MethodContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        System.out.println("\t" + methodName + ":");
        System.out.println("\t\tBeginFunc;");
        visit(ctx.stmt());
        System.out.println("\t\tEndFunc;");
        return "";
    }

    /**
     * responsible for visiting a parameter of a method
     * @param ctx the context of the parameter
     * @return the identifier of the parameter
     */
    @Override public Object visitParameter(CoolRulesParser.ParameterContext ctx) {
        return ctx.IDENTIFIER();
    }

    /**
     * responsible for visiting a new object declaration
     * @param ctx the context of the new object
     * @return a string that represents the new object
     */
    @Override public Object visitNew(CoolRulesParser.NewContext ctx) {
        return "new " + ctx.TYPE().getText();
    }

    /**
     * responsible for visiting an identifier
     * @param ctx the context of the identifier
     * @return the text of the identifier
     */
    @Override public Object visitIdentifier(CoolRulesParser.IdentifierContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    /**
     * responsible for visiting a not statement
     * @param ctx the context of the not statement
     * @return a not statement representation
     */
    @Override public Object visitNot(CoolRulesParser.NotContext ctx) {
        return "! " + visit(ctx.stmt());
    }

    /**
     * responsible for visiting a string statement
     * @param ctx the context of the string statement
     * @return the text of the string
     */
    @Override public Object visitString(CoolRulesParser.StringContext ctx) {
        return ctx.STRING().getText();
    }

    /**
     * responsible for visiting the Isvoid statement
     * @param ctx the context of the Isvoid statement
     * @return a representation of the Isvoid statement
     */
    @Override public Object visitIsvoid(CoolRulesParser.IsvoidContext ctx) {
        return "isvoid " + ctx.stmt();
    }

    /**
     * responsible for visiting a while statement
     * @param ctx the context of a wile statement
     * @return an empty string
     */
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

    /**
     * responsible for visiting the tide statement
     * @param ctx the context of the tilde statement
     * @return a representation string of a tilde string
     */
    @Override public Object visitTilde(CoolRulesParser.TildeContext ctx) {
        return "~ " + visit(ctx.stmt());
    }

    /**
     * responsible for visiting an integer
     * @param ctx the context of the integer
     * @return the text of the integer
     */
    @Override public Object visitInt(CoolRulesParser.IntContext ctx) {
        return ctx.INTEGER().getText();
    }

    /**
     * responsible for visitingg the method call statement
     * @param ctx the context of the method call statement
     * @return a representation of the method call statement
     */
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

    /**
     * responsible for visiting a statement between two parenthesis "(statement)"
     * @param ctx the context of the statement
     * @return the statement that is between the two parenthesis
     */
    @Override public Object visitParenStmt(CoolRulesParser.ParenStmtContext ctx) {
        return visit(ctx.stmt());
    }

    /**
     * NOT FINSHED, NEEDS IMPLEMENTATION
     * responsible for visiting a call of an object method
     * @param ctx the context of a call of an object method
     * @return an empty string
     */
    @Override public Object visitCalling(CoolRulesParser.CallingContext ctx) {
        return "";
    }

    /**
     * responsible for visiting a block of statements
     * @param ctx the context of the block
     * @return an empty string
     */
    @Override public Object visitBlock(CoolRulesParser.BlockContext ctx) {
        for(var st: ctx.stmt()){
            visit(st);
        }
        return "";
    }

    /**
     * responsible for visiting the Let statement
     * @param ctx the context of the Let statement
     * @return an empty string
     */
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

    /**
     * responsible for visiting an expression (addition, subtraction, multiplication ..etc)
     * @param ctx the context of the expression
     * @return a representation of the expression
     */
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

    /**
     * responsible for visiting an if statement
     * @param ctx the context of the if statement
     * @return an empty string
     */
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

    /**
     * responsible for visiting a Case statement
     * @param ctx the context of the case statement
     * @return an empty string
     */
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

    /**
     * responsible for visiting an Assign statement
     * @param ctx the context of the Assign statement
     * @return an empty string
     */
    @Override public Object visitAssign(CoolRulesParser.AssignContext ctx) {
        System.out.println("\t\t" + ctx.IDENTIFIER() + " = " + visit(ctx.stmt()) + ";");
        return"";
    }

}
