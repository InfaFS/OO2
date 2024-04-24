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
        ClasicoCreator sandwichFactory = new ClasicoCreator();
        sandwichFactory.orderSandwich();
        VegetarianoCreator sandwichFactory2 = new VegetarianoCreator();
        sandwichFactory2.orderSandwich();
        VeganoCreator sandwichFactory3 = new VeganoCreator();
        sandwichFactory3.orderSandwich();
        SinTACCCreator sandwichFactory4 = new SinTACCCreator();
        sandwichFactory4.orderSandwich();


        
    }


}
