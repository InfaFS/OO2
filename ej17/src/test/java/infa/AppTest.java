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
 
    //faltaria testear lagarto y spock
    @Test
    public void testGlobal()
    {
        ClienteGold cliente = new ClienteGold();
       assertEquals(1800000.0, cliente.obtenerInversionProducto1(10000.0));
      // assertEquals(1800000.0, cliente.obtenerInversionProducto2(10000.0));
       // ProductoInnovadorUno producto = new ProductoInnovadorUno();
       // assertEquals(1800000, producto.obtenerInversionProducto(10000.0, cliente));
       ClienteSilver cliente2 = new ClienteSilver();
       assertEquals(298598.3, cliente.obtenerInversionProducto4(100.0),0.1);
       assertEquals(1750000.0, cliente2.obtenerInversionProducto1(10000.0));

       //hacer demas tests
       //las implementaciones no son accurate con la vida real!
    }


}
