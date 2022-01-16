public class PythonTranslate extends PseIntGrammarBaseListener {
    int indent = 0;
    @Override
    public void enterPrograma(PseIntGrammarParser.ProgramaContext ctx) {
        super.enterPrograma(ctx);
        System.out.println("Python Translator");
        System.out.println("def " + ctx.ID() +  ":");
    }

    @Override
    public void enterComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx) {
        super.enterComando_escribir(ctx);
        indent++;
        String indentation = indentation();
        System.out.print(indentation + "print(");
        indent = 0;
    }

    @Override
    public void exitComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx) {
        super.exitComando_escribir(ctx);
        System.out.println(");");
    }

    @Override
    public void enterAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
        super.enterAsignacion_variable(ctx);
        indent++;
        String indentation = indentation();
        System.out.print(indentation + ctx.ID() + "=");
        indent = 0;
    }

    @Override
    public void enterExpresion(PseIntGrammarParser.ExpresionContext ctx) {
        super.enterExpresion(ctx);
//        System.out.print(ctx.getText());
//        ctx.
    }


    @Override
    public void enterTerm(PseIntGrammarParser.TermContext ctx) {
        super.enterTerm(ctx);
//        ctx.
//        System.out.print(ctx.getText());
        if(ctx.TOKEN_DIV() != null)
            System.out.print(ctx.TOKEN_DIV());
        else if(ctx.TOKEN_MUL() != null)
            System.out.print(ctx.TOKEN_MUL());

    }

    @Override
    public void enterFactor(PseIntGrammarParser.FactorContext ctx) {
        super.enterFactor(ctx);
        if(ctx.ID() != null)
            System.out.print(ctx.ID().getText());
        if(ctx.INT() != null)
            System.out.print(ctx.INT().getText());
        else if(ctx.DOUBLE() != null)
            System.out.print(ctx.DOUBLE().getText());
        else if(ctx.STRING() != null)
            System.out.print(ctx.DOUBLE().getText());
        else if(ctx.TOKEN_PARIZQ() != null)
            System.out.print(ctx.TOKEN_PARIZQ().getText());
        else if(ctx.TOKEN_PARDER() != null)
            System.out.print(ctx.TOKEN_PARDER().getText());

    }

    @Override
    public void enterAsignacion(PseIntGrammarParser.AsignacionContext ctx) {
        super.enterAsignacion(ctx);
        if(ctx.INT() != null)
            System.out.print(ctx.INT().getText());
        else if(ctx.DOUBLE() != null)
            System.out.print(ctx.DOUBLE().getText());
        else if(ctx.STRING() != null)
            System.out.print(ctx.DOUBLE().getText());
        else
        {
            enterExpresion(ctx.expresion());
        }
    }

    @Override
    public void exitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
        super.exitAsignacion_variable(ctx);
        System.out.println(";");
    }

    private String indentation(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            s.append("\t");
        }
        return s.toString();
    }

}
