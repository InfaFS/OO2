package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.time.Month;

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
        Proyecto proyecto = new Proyecto("Vacaciones de invierno", "01/01/2021", "01/01/2022", "Salir con amigos", 3 , 100);
        proyecto.modificarMargenGanacias(0.02);
        proyecto.modificarMargenGanacias(0.1);
        assertEquals(0.1, proyecto.getMargenDeGanancias());
        proyecto.aprobarEtapa();
        proyecto.aprobarEtapa();
        proyecto.modificarMargenGanacias(0.1);
        proyecto.aprobarEtapa();

        //hacer los demas tests
        

    }
}
