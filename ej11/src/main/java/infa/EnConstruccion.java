package infa;

public class EnConstruccion extends ProyectState {

    public void aprobarEtapa(Proyecto context) {
        if (this.getCostoProyecto(context) > 0) {
            context.setState(new EnEvaluacion());
        }
        else {
            throw new RuntimeException("El costo del proyecto es 0");
        }
    }
    
    public void modificarMargenGanacias(Proyecto context,double gananciaNueva){

        double totalMargenInf = 0.08;
        double totalMargenSup = 0.11;
        if ((gananciaNueva >= totalMargenInf) && (gananciaNueva <= totalMargenSup)){
            context.setGanacia(gananciaNueva);
        }
        else {
            System.out.println("El margen de ganancias no esta en el rango permitido");

        }

    }

    public void cancelarProyecto (Proyecto context){
        context.setState(new Cancelado());
        context.setObjetivo(context.getObjetivo()+" -Cancelado.");
    }
}
