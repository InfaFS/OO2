package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    public void testPasante() {
        Empleado pasante1 = new Pasante(0);
        assertEquals(20000.0, pasante1.basico(), 0.0001f);
        assertEquals(0.0, pasante1.adicional(), 0.0001f);
        assertEquals(17400.0, pasante1.sueldo(), 0.0001f);

        Empleado pasante2 = new Pasante(5);
        assertEquals(20000.0, pasante2.basico(),0.0001f);
        assertEquals(10000, pasante2.adicional(),0.0001f);
        assertEquals(16900.0, pasante2.sueldo(),0.0001f);
    }

    @Test
    public void testTemporario(){
        Empleado temporario = new Temporario(12,false,43);
        assertEquals(((20000 + 12*300 )*0.87 + 2000*43*0.95),  temporario.sueldo());
        Empleado temporario2 = new Temporario(12,true,43);
        assertEquals((20000 + 300*12)*0.87 + (5000 + 2000*43)*0.95, temporario2.sueldo());
    }
    
    //Testear planta
}
 