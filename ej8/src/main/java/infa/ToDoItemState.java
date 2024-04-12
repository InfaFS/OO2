package infa;

import java.time.Duration;

public abstract class ToDoItemState { //Ver si puedo pasarlo a interface despues
    public abstract void start(ToDoItem context);
    public abstract void togglePause(ToDoItem context);
    public abstract void finish(ToDoItem context);
    public abstract Duration workedTime(ToDoItem context);
    public abstract void addComment(String comment, ToDoItem context);
}