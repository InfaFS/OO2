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
    LocalDate fecha1;
    LocalDate fecha2;
    List<Vehiculo> vehiculos;
    Vehiculo renault;
    Vehiculo clio;
    PromocionStrategy promo;
    Asegurado asegurado;
    Seguro SeguroTerceros;
    Seguro SeguroTerceros2;
    @BeforeEach
    void setUp() throws Exception {
        fecha1 = LocalDate.of(1988,12 ,16);
        fecha2 = LocalDate.of(2001,12 ,16);
        vehiculos = new ArrayList<Vehiculo>();
        renault = new Vehiculo(680000.0,4,fecha1);
        clio = new Vehiculo(1200000.0,5,fecha2);
        promo = new SinPromo();
        asegurado = new Asegurado(promo,50);
        SeguroTerceros = new SeguroTerceros(renault,asegurado);
        SeguroTerceros2 = new SeguroTerceros(clio,asegurado);
        renault.setSeguro(SeguroTerceros);
        clio.setSeguro(SeguroTerceros2);
        vehiculos.add(renault);
        vehiculos.add(clio);
        asegurado.setPromo(promo);
        asegurado.setVehiculos(vehiculos);
    }
 
    //faltaria testear lagarto y spock
    @Test
    public void testPeruano()
    {   
        assertEquals(40200.0, asegurado.getCostoTotal());

    }


}
