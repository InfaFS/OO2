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
    Jugada tijera = new Tijera();
    Jugada papel = new Papel();
    Jugada piedra = new Piedra();
    Jugada lagarto = new Lagarto();
    Jugada spock = new Spock();
    @BeforeEach
    void setUp() throws Exception {
        
    }
 
    //faltaria testear lagarto y spock
    @Test
    public void testTijera()
    {
        assertEquals("empate",tijera.contraTijera());
        assertEquals("pierde",tijera.contraPiedra());
        assertEquals("gana",tijera.contraPapel());
    }

    @Test
    public void testPiedra()
    {
        assertEquals("empate",piedra.contraPiedra());
        assertEquals("pierde",piedra.contraPapel());
        assertEquals("gana",piedra.contraTijera());
    }

    @Test
    public void testPapel()
    {
        assertEquals("empate",papel.contraPapel());
        assertEquals("pierde",papel.contraTijera());
        assertEquals("gana",papel.contraPiedra());
    }
}
