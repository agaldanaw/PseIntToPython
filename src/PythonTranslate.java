public class PythonTranslate extends PseIntGrammarBaseVisitor<String> {

    // con listener
//    @Override
//    public void enterPrograma(PseIntGrammarParser.ProgramaContext ctx) {
//        super.enterPrograma(ctx);
//        System.out.println("Python");
//        System.out.println("def " + ctx.ID());
//    }
//
//
//    @Override
//    public void enterDefinicion_variables(PseIntGrammarParser.Definicion_variablesContext ctx) {
//        super.enterDefinicion_variables(ctx);
//
//    }
//
//    @Override
//    public void enterAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
//        super.enterAsignacion_variable(ctx);
//    }
//
//    @Override
//    public void exitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
//        super.exitAsignacion_variable(ctx);
//    }
//
//    @Override
//    public void enterAsignacion(PseIntGrammarParser.AsignacionContext ctx) {
//        super.enterAsignacion(ctx);
//        System.out.println(ctx.INT());
//
//    }

    String currentId = "";
    @Override
    public String visitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
        currentId = ctx.ID().getText();
        return super.visitAsignacion_variable(ctx);
    }

    @Override
    public String visitAsignacion(PseIntGrammarParser.AsignacionContext ctx) {
        String lexpr = visit(ctx.children.get(0));
        return currentId + "="+ lexpr + ";";
    }
}
