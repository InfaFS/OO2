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
    LocalDateTime startDate = LocalDateTime.of(2024, Month.APRIL, 1, 0, 0);
    LocalDateTime endDate = startDate.plusDays(10);
    Excursion excursion = new Excursion("Excursion1",startDate, endDate, "La Plata", 100, 2, 4);
    Usuario user1 = new Usuario("John", "Doe", "john.doe@example.com");
    Usuario user2 = new Usuario("Jane", "Smith", "jane.smith@example.com");
    Usuario user3 = new Usuario("Michael", "Johnson", "michael.johnson@example.com");
    Usuario user4 = new Usuario("Emily", "Davis", "emily.davis@example.com");
    
    System.out.println(excursion.mostrarInfo());
    excursion.inscribirUsuario(user1);
    System.out.println(excursion.mostrarInfo());
    //excursion.llevarACabo();
    excursion.inscribirUsuario(user2);

    System.out.println(excursion.mostrarInfo());
    excursion.inscribirUsuario(user3);
    System.out.println(excursion.mostrarInfo());
   // excursion.llevarACabo(); //esta despues la borro para ver cuando tiene cupo maximo
    excursion.inscribirUsuario(user4);

    System.out.println(excursion.mostrarInfo());
    excursion.inscribirUsuario(user4);
    excursion.inscribirUsuario(user4);
    excursion.llevarACabo();
    System.out.println(excursion.mostrarListaEspera());


    }
}
