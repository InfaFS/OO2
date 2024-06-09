package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    TareaCompleja prepararAlmuerzo;
    TareaCompleja realizarCompras;
    TareaSimple iralsuper;
    TareaSimple irAVerdu; 
    TareaSimple cocinar;
    TareaSimple prepararMesa;
    @BeforeEach
    void setUp() throws Exception {
        prepararAlmuerzo = new TareaCompleja("preparar almuerzp","es compleja");
        realizarCompras = new TareaCompleja("realizar compras","hay que hacerlo");
        iralsuper = new TareaSimple("ir al super","simple", 3);
        irAVerdu = new TareaSimple("ir a la verdu", "simple",1);
        cocinar = new TareaSimple("ir a cocinar","simple",2);
        prepararMesa = new TareaSimple("prepara mesa", "simple", 1);
        
        prepararAlmuerzo.addTarea(realizarCompras);
        realizarCompras.addTarea(iralsuper);
        realizarCompras.addTarea(irAVerdu);
        prepararAlmuerzo.addTarea(cocinar);
        prepararAlmuerzo.addTarea(prepararMesa);
    }
 
    //faltaria testear lagarto y spock
    @Test
    public void testPeruano() throws InterruptedException
    {   

        assertEquals(7,prepararAlmuerzo.estimacionTotal());
        assertEquals(0,iralsuper.avanceTarea());
        assertEquals(0, realizarCompras.avanceTarea());
        prepararAlmuerzo.iniciarTarea();
        iralsuper.completarTarea();
        irAVerdu.completarTarea();
        System.out.println(prepararAlmuerzo.avanceTarea());

    }


}
