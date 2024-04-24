package infa;

import infa.Aderezo.SalsaTartara;
import infa.Adicional.VerdurasGrilladas;
import infa.Decoradores.AderezoDecorator;
import infa.Decoradores.AdicionalDecorator;
import infa.Decoradores.PanDecorator;
import infa.Decoradores.PrincipalDecorator;
import infa.Decoradores.Sandwich;
import infa.Decoradores.SandwichInterface;
import infa.Pan.PanChipa;
import infa.Principal.Pollo;

public class SinTACCCreator extends SandwichFactory{
    public SandwichInterface makeSandwich(){
        Sandwich sandwich = new Sandwich();
        PanDecorator pan = new PanDecorator(sandwich,new PanChipa());
        AderezoDecorator aderezo = new AderezoDecorator(pan,new SalsaTartara());
        PrincipalDecorator principal = new PrincipalDecorator(aderezo,new Pollo());
        AdicionalDecorator adicional = new AdicionalDecorator(principal,new VerdurasGrilladas());
        return adicional;
    
    }
}
