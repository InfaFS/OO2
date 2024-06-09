package infa;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class TareaCompleja extends Tarea {

    private List<Tarea> tareas;

    public TareaCompleja (String nombre, String descripcion){
        super(nombre, descripcion);
        this.tareas = new ArrayList<Tarea>();
    }
    
    @Override 
    public void iniciarTarea(){
        for (Tarea tarea : tareas) {
            tarea.iniciarTarea();
        }; 
    }

    @Override
    public void completarTarea(){
        for (Tarea tarea : tareas) {
            tarea.completarTarea();
        }; 
    }

    public int estimacionTotal(){
        return this.tareas.stream().mapToInt( t -> t.estimacionTotal()).sum();
    }
    
    public int tiempoUtilizado(){
        return this.tareas.stream().mapToInt( t -> t.tiempoUtilizado()).sum();
    }

   
    public void addTarea(Tarea tarea){
        this.tareas.add(tarea);
    }
}
