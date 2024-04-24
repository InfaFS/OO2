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
    public void testGlobal()
    {
        Usuario jugador1 = new Usuario();
        Usuario jugador2 = new Usuario();

        jugador1.setearMago();
        jugador2.setearGuerrero();

        jugador1.PvP(jugador2.getPersonaje());
        assertEquals(100, jugador1.getPersonaje().consultarVida());
        assertEquals(99, jugador2.getPersonaje().consultarVida());
        jugador2.PvP(jugador1.getPersonaje());
        assertEquals(92, jugador1.getPersonaje().consultarVida());
        
    }


}
