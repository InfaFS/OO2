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
    
    @BeforeEach
    void setUp() throws Exception {
        
    }
 
    //faltaria testear lagarto y spock
    @Test
    public void testPeruano()
    {   
        LocalDate fecha1 = LocalDate.of(1988,12 ,16);
        LocalDate fecha2 = LocalDate.of(2001,12 ,16);
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Vehiculo renault = new Vehiculo(680000.0,4,fecha1);
        Vehiculo clio = new Vehiculo(1200000.0,5,fecha2);
        PromocionStrategy promo = new SinPromo();
        Asegurado asegurado = new Asegurado(promo,50);
        Seguro SeguroTerceros = new SeguroTerceros(renault,asegurado);
        Seguro SeguroTerceros2 = new SeguroTerceros(clio,asegurado);
        renault.setSeguro(SeguroTerceros);
        clio.setSeguro(SeguroTerceros2);
        vehiculos.add(renault);
        vehiculos.add(clio);
        asegurado.setPromo(promo);
        asegurado.setVehiculos(vehiculos);

        //tengo que poner todo eso arriba pero bien en elsetup

        assertEquals(7800.0,SeguroTerceros.costo_cobertura_danios());
        assertEquals(5000.0, asegurado.seguroDelConductor());
        assertEquals(46800.0, SeguroTerceros.getCostoSeguro());
        assertEquals(124800.0, asegurado.getCostoTotal());



    }


}
