package infa;
import java.time.LocalDateTime;
import java.time.Duration;

public class ToDoItem {
    private ToDoItemState state;
    private String name;
    private String comentario;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdate;
     
    public ToDoItem(String name){
        this.name = name;
        setState(new Pending());
        this.comentario = "";
    }

    public LocalDateTime getCreationDate(){
        return this.creationDate;
    }

    public LocalDateTime getLastUpdate(){
        return this.lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate){
        this.lastUpdate = lastUpdate;
    }

    public void setCreationDate(){
        this.creationDate = LocalDateTime.now();
    }

    public void setState(ToDoItemState state){
        this.state = state;
    }
    
    public void addCommentToDoItem(String comment){
        this.comentario = comment;
    }
    public void addComment(String comment){
        this.state.addComment(comment, this);
    }


    public void start(){
        this.state.start(this);
    }

    public void togglePause(){
        this.state.togglePause(this);
    }

    public void finish(){
        this.state.finish(this);
    }

    public Duration workedTime(){
        return this.state.workedTime(this);
    }

    public String getComentario(){
        return this.comentario;
    }
}
