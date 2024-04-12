package infa;
import java.time.LocalDateTime;
import java.time.Duration;
import javax.management.RuntimeErrorException;

public class Finished extends ToDoItemState {
    

    public void start(ToDoItem context){
        System.out.println("Nothing :P ");
    }

    
    public void togglePause(ToDoItem context){
        throw new RuntimeErrorException(null, "No se puede pausar un item que finalizo");
    }

    
    public void finish(ToDoItem context){
        System.out.println("Nothing :P ");
    }

    public void addComment(String comment, ToDoItem context){
        System.out.println("Nothing :P ");
    }

    public Duration workedTime(ToDoItem context){
        return Duration.between(context.getCreationDate(),context.getLastUpdate());
    }
    //faltan los ultimos 2 puntos
}
