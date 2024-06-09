package infa;

public class TareaSimple extends Tarea {
    private int duracionEstimada;
    protected EstadoTarea estado;
    private int instanteComienzo;
    private int instanteFin;

    public TareaSimple(String nombre, String descripcion, int duracionEstimada){
        super(nombre, descripcion);
        this.duracionEstimada = duracionEstimada;
        this.estado = new Pendiente();
    }

    public int estimacionTotal (){
        return this.duracionEstimada;
    }

    public int tiempoUtilizado(){
        return this.estado.tiempoUtilizado(this);
    }

    public void setInstanteComienzo (int comienzo) {
        this.instanteComienzo = comienzo;
    }

    public void setInstanteFin (int fin) {
        this.instanteFin = fin;
    }

    public void iniciarTarea(){
        this.estado.iniciarTarea(this);
    }

    public void completarTarea(){
        this.estado.completarTarea(this);
    }

    public void setEstado(EstadoTarea estado){
        this.estado = estado;
    }

    public int getInstanteInicio(){
        return this.instanteComienzo;
    }

    public int getInstanteFin(){
        return this.instanteFin;
    }




}
