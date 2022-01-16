public class PythonTranslate extends PseIntGrammarBaseListener {
//
//    // con listener
    @Override
    public void enterPrograma(PseIntGrammarParser.ProgramaContext ctx) {
        super.enterPrograma(ctx);
        System.out.println("Python");
        System.out.println("def " + ctx.ID() +  ":");// atributos);
    }

    @Override
    public void enterComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx) {
        super.enterComando_escribir(ctx);

        System.out.print("print(");
    }
    // print(a)

    @Override
    public void exitComando_escribir(PseIntGrammarParser.Comando_escribirContext ctx) {
        super.exitComando_escribir(ctx);
        System.out.println(")");
    }

    //
//    @Override
//    public void enterDefinicion_variables(PseIntGrammarParser.Definicion_variablesContext ctx) {
//        super.enterDefinicion_variables(ctx);
//    }
//
    @Override
    public void enterAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
        super.enterAsignacion_variable(ctx);
        System.out.print(ctx.ID() + "=");
    }
    
//
//    @Override
//    public void exitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
//        super.exitAsignacion_variable(ctx);
//    }
//
    @Override
    public void enterAsignacion(PseIntGrammarParser.AsignacionContext ctx) {
        super.enterAsignacion(ctx);
        System.out.println(ctx.getText() + ";");
    }
//
//    String currentId = "";
//    @Override
//    public T visitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
//        currentId = ctx.ID().getText();
//        return super.visitAsignacion_variable(ctx);
//    }
//
//    @Override
//    public T visitAsignacion(PseIntGrammarParser.AsignacionContext ctx) {
//

//        String lexpr = (String)visit(ctx.children.get(0));
//        return (T)(currentId + "="+ lexpr + ";");
//    }
}
