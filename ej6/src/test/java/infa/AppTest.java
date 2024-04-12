package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

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
    public void testAgua()
    {
        Topografia agua = new Agua();
        assertEquals(100,agua.proporcionDeAgua());
        assertEquals(0,agua.proporcionDeTierra());
        assertTrue(agua.igualAgua());
        Topografia agua2 = new Agua();
        assertTrue(agua.igual(agua2));
        Topografia tierra3 = new Tierra();
        assertTrue(!agua.igual(tierra3));
        assertTrue(!agua.igualMixta(null));
        assertTrue(!agua.igualTierra());
    }

    @Test
    public void testTierra()
    {
        Topografia tierra = new Tierra();
        assertEquals(0,tierra.proporcionDeAgua());
        assertEquals(100,tierra.proporcionDeTierra());
        assertTrue(tierra.igualTierra());
        Topografia tierra2 = new Tierra();
        assertTrue(tierra.igual(tierra2));
        Topografia agua3 = new Agua();
        assertTrue(!tierra.igual(agua3));
        assertTrue(!tierra.igualMixta(null));
        assertTrue(!tierra.igualAgua());
    }

    @Test
    public void testMixtas(){
        Topografia agua = new Agua();
        Topografia tierra = new Tierra();
        Topografia agua2 = new Agua();
        Topografia tierra2 = new Tierra();
        Topografia mixta = new Mixta(agua,agua2,tierra,tierra2);
        assertEquals(50,mixta.proporcionDeAgua());
        assertEquals(50,mixta.proporcionDeTierra());
        assertTrue(!mixta.igual(agua));
        assertTrue(!mixta.igual(tierra));

        Topografia agua_1 = new Agua();
        Topografia tierra_1 = new Tierra();
        Topografia agua_2 = new Agua();
        Topografia tierra_2 = new Tierra();


        Topografia mixtaDos = new Mixta(agua_1,agua_2,tierra_1,tierra_2);
        assertTrue(mixta.igual(mixtaDos));


        Topografia mixtaTres= new Mixta(agua_1,tierra_1,tierra_2,agua_2);
        assertTrue(!mixta.igual(mixtaTres));

    }

    @Test 
    public void testPantano(){
        Topografia pantano = new Pantano();
        assertEquals(70, pantano.proporcionDeAgua());
        assertEquals(30, pantano.proporcionDeTierra());
        assertTrue(!pantano.igualAgua());
        assertTrue(!pantano.igualTierra());
        assertTrue(!pantano.igualMixta(null));

        Topografia agua = new Agua();
        Topografia tierra = new Tierra();
        Topografia agua2 = new Agua();
        
        Topografia mixta = new Mixta(agua,agua2,pantano,tierra);

        assertEquals(67,mixta.proporcionDeAgua());
        assertEquals(32, mixta.proporcionDeTierra());

        Topografia agua_2 = new Agua();
        Topografia tierra_2 = new Tierra();
        Topografia agua_3 = new Agua();
        Topografia tierra_3 = new Tierra();
        Topografia patano_1 = new Pantano();
        ArrayList<Topografia> partes_1 = new ArrayList<Topografia>();
        partes_1.add(agua_2);
        partes_1.add(agua_3);
        partes_1.add(patano_1);
        partes_1.add(tierra_2);

        Topografia mixta_1 = new Mixta(agua_2,agua_3,patano_1,tierra_2);
        assertTrue(mixta_1.igual(mixta) );

    }
}
