package infa;


import static org.junit.jupiter.api.Assertions.assertEquals;

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
        SandwichDirector sandwichDirector = new SandwichDirector();
        SinTACCBuilder SinTACCBuilder = new SinTACCBuilder();
        VegetarianoBuilder VegetarianoBuilder = new VegetarianoBuilder();
        VeganoBuilder VeganoBuilder = new VeganoBuilder();
        ClasicoBuilder ClasicoBuilder = new ClasicoBuilder();
        
        sandwichDirector.buildSandwich(SinTACCBuilder);
        sandwichDirector.buildSandwich(VegetarianoBuilder);
        sandwichDirector.buildSandwich(VeganoBuilder);
        sandwichDirector.buildSandwich(ClasicoBuilder);

        Sandwich sandwichSinTacc = SinTACCBuilder.getSandwich();
        System.out.println(sandwichSinTacc.getListado());
        assertEquals(618, sandwichSinTacc.getValorSandwich());

        Sandwich sandwichVegetariano = VegetarianoBuilder.getSandwich();
        System.out.println(sandwichVegetariano.getListado());
        assertEquals(420, sandwichVegetariano.getValorSandwich());

        Sandwich sandwichVegano = VeganoBuilder.getSandwich();
        System.out.println(sandwichVegano.getListado());
        assertEquals(620, sandwichVegano.getValorSandwich());

        Sandwich sandwichClasico = ClasicoBuilder.getSandwich();
        System.out.println(sandwichClasico.getListado());
        assertEquals(500, sandwichClasico.getValorSandwich());

    
    }


}
