package infa;

public class Cancelado extends ProyectState{
    
    public void cancelarProyecto (Proyecto context){
        System.out.println("El proyecto ya fue cancelado");
    }

    public void modificarMargenGanacias(Proyecto context,double gananciaNueva){
        System.out.println("El proyecto ya fue cancelado");
    }

    public void aprobarEtapa(Proyecto context){
        System.out.println("El proyecto ya fue cancelado");
    }

    public double getCostoProyecto(Proyecto context){
        return 0;
    }

    public double getPrecioProyecto(Proyecto context){
        return 0;
    }
}
