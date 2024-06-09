package infa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pendiente extends EstadoTarea {
    @Override
    public void iniciarTarea(TareaSimple tarea){
        tarea.setEstado(new Iniciada());
        tarea.setInstanteComienzo((int) System.currentTimeMillis());
    }


}
