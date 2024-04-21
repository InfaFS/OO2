package infa;

public abstract class ProyectState {
    public abstract void aprobarEtapa(Proyecto context);
    public double getCostoProyecto(Proyecto context){
        return context.getMontoPagoIntegranteDia() * context.getNumIntegrantes();
    }
    public double getPrecioProyecto(Proyecto context){
        return this.getCostoProyecto(context) + context.getMargenDeGanancias();
    }
    public abstract void modificarMargenGanacias(Proyecto context, double gananciaNueva);
    public abstract void cancelarProyecto(Proyecto context);

}
