package infa;

public class Confirmada extends ProyectState{
    
    public void aprobarEtapa(Proyecto context){
        System.out.println("El proyecto ya esta confirmado");
    }
    
    public void modificarMargenGanacias(Proyecto context,double gananciaNueva){
        System.out.println("El proyecto ya esta confirmado");
    }

    public void cancelarProyecto (Proyecto context){
        context.setState(new Cancelado());
        context.setObjetivo(context.getObjetivo()+" -Cancelado.");
    }

    
}
