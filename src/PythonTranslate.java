public class PythonTranslate<T> extends PseIntGrammarBaseVisitor<T> {

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
    public T visitAsignacion_variable(PseIntGrammarParser.Asignacion_variableContext ctx) {
        currentId = ctx.ID().getText();
        return super.visitAsignacion_variable(ctx);
    }

    @Override
    public T visitAsignacion(PseIntGrammarParser.AsignacionContext ctx) {

        if(ctx.expresion() != null)
        {
            //expreson

        }
        else if(ctx.INT() != null )
        {

        }
        else if(ctx.DOUBLE() != null)
        {

        }
        String lexpr = (String)visit(ctx.children.get(0));
        return (T)(currentId + "="+ lexpr + ";");
    }
}
