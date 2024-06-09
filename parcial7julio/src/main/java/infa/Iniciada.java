package infa;

public class Iniciada extends EstadoTarea {

    @Override
    public void completarTarea(TareaSimple tarea){
        tarea.setInstanteFin((int) System.currentTimeMillis());
        tarea.setEstado(new Completada());
    }

}
