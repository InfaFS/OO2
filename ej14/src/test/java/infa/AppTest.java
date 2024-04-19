package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

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
    public void testGlobal()
    {
        // Instancia una base de datos que posee dos filas
        DatabaseRealAccess database = new DatabaseRealAccess();
 
        // Retorna el siguiente arreglo: ['Spiderman' 'Marvel'].
        System.out.println(database.getSearchResults("select * from comics where id=1"));
  
        // Retorna 3, que es el id que se le asigna
        System.out.println(database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
 
         // Retorna el siguiente arreglo: ['Patoruzú', 'La flor'], ya que lo insertó antes
        System.out.println(database.getSearchResults("select * from comics where id=3"));
        DatabaseRealAccessProxy proxy = new DatabaseRealAccessProxy(database, "1234");
 
        // Retorna el siguiente arreglo: ['Spiderman' 'Marvel'].
        System.out.println(proxy.getSearchResults("select * from comics where id=1"));

  
        // Retorna 4, que es el id que se le asigna
       System.out.println(proxy.insertNewRow(Arrays.asList("El Principito", "??")));
 
         // Retorna el siguiente arreglo: ['El Principito', '??'], ya que lo insertó antes
       System.out.println(proxy.getSearchResults("select * from comics where id=4")); 
        //funciona error en ambos

    }
}
