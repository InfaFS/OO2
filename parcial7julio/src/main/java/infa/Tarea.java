package infa;

public abstract class Tarea {
    private String nombre;
    private String descripcion;

    public Tarea (String nombre ,String descripcion) {
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    public abstract int estimacionTotal ();
    public abstract int tiempoUtilizado();
    public abstract void iniciarTarea();
    public abstract void completarTarea();
   
    public double avanceTarea(){
        return this.tiempoUtilizado() / this.estimacionTotal();
    }



}
