package infa;

public class Completada extends EstadoTarea {

    @Override
    public int tiempoUtilizado(TareaSimple tarea){
        return (tarea.getInstanteFin() - tarea.getInstanteInicio());
    }
}
