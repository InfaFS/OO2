package infa;


import infa.Aderezo.SalsaCriolla;
import infa.Decoradores.AderezoDecorator;
import infa.Decoradores.PanDecorator;
import infa.Decoradores.PrincipalDecorator;
import infa.Decoradores.Sandwich;
import infa.Decoradores.SandwichInterface;
import infa.Pan.PanIntegral;
import infa.Principal.MilaGirgolas;

public class VeganoCreator extends SandwichFactory{
    public SandwichInterface makeSandwich(){
        Sandwich sandwich = new Sandwich();
        PanDecorator pan = new PanDecorator(sandwich,new PanIntegral());
        AderezoDecorator aderezo = new AderezoDecorator(pan,new SalsaCriolla());
        PrincipalDecorator principal = new PrincipalDecorator(aderezo,new MilaGirgolas());
        return principal;
    
    }
}
