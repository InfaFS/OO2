package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{


    @BeforeEach
    void setUp() throws Exception {
        
    }
 

    @Test
    public void testToDoItem()
    {
        ToDoItem toDoItem = new ToDoItem("Test");
        toDoItem.addComment("Hola juliana!");
        System.out.println(toDoItem.getComentario());
        //toDoItem.workedTime(); //tira error
        //toDoItem.togglePause(); //tira error
        toDoItem.finish(); //imprime nada
        toDoItem.start(); //esta en progress

        toDoItem.addComment("Hola julianita!");
        System.out.println(toDoItem.getComentario());
        System.out.println(toDoItem.workedTime());
        toDoItem.start(); //imprime nada

        toDoItem.togglePause();//esta en paused
        toDoItem.addComment("Hola juti!");
        System.out.println(toDoItem.getComentario());
     
        //imprime nada
        System.out.println(toDoItem.workedTime());

        toDoItem.togglePause();//esta en progress
        System.out.println(toDoItem.workedTime());

        toDoItem.finish(); //esta en finished
        toDoItem.start(); //imprime nada
        toDoItem.finish(); //imprime nada

        toDoItem.addComment("hola!");
        //toDoItem.togglePause(); //tira error
        System.out.println(toDoItem.workedTime());

    }
}
