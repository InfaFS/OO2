package infa;
import java.time.LocalDateTime;
import java.time.Duration;
import javax.management.RuntimeErrorException;

public class Pending extends ToDoItemState {

    public void start(ToDoItem context){
        context.setState(new InProgress());
        context.setCreationDate();
    }

    
    public void togglePause(ToDoItem context){
        throw new RuntimeErrorException(null, "No se puede pausar un item que no esta en progreso");
    }

    
    public void finish(ToDoItem context){
        System.out.println("Nothing :P ");
    }

    public void addComment(String comment, ToDoItem context){
        context.addCommentToDoItem(comment);
    }

    public Duration workedTime(ToDoItem context){
        throw new RuntimeErrorException(null, "El ToDoItem no se inicializo");

    }

}
