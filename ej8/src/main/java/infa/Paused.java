package infa;
import java.time.LocalDateTime;
import java.time.Duration;
public class Paused extends ToDoItemState{
    
    
    public void start(ToDoItem context){
        System.out.println("Nothing :P ");
    }

    
    public void togglePause(ToDoItem context){
        context.setState(new InProgress());
    }


    public void finish(ToDoItem context){
        context.setState(new Finished());
        context.setLastUpdate(LocalDateTime.now());
    }

    public void addComment(String comment, ToDoItem context){
        context.addCommentToDoItem(comment);
    }

    public Duration workedTime(ToDoItem context){
        return Duration.between(context.getCreationDate(), LocalDateTime.now());
    }
}
