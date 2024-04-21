package infa;

public class EnEvaluacion extends ProyectState{
    
    public void aprobarEtapa(Proyecto context){
        context.setState(new Confirmada());
    }

    public void modificarMargenGanacias(Proyecto context,double gananciaNueva){
        double totalMargenInf = 0.11;
        double totalMargenSup = 0.15;
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
