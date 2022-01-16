public class PythonTranslate extends PseIntGrammarBaseListener {
    int indent = 0;
    @Override
    public void enterPrograma(PseIntGrammarParser.ProgramaContext ctx) {
        super.enterPrograma(ctx);
        System.out.println("Python");
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
    public void enterAsignacion(PseIntGrammarParser.AsignacionContext ctx) {
        super.enterAsignacion(ctx);
        System.out.println(ctx.getText() + ";");
    }

    private String indentation(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            s.append("\t");
        }
        return s.toString();
    }

}
