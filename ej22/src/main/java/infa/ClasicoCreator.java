package infa;

import infa.Aderezo.Mayonesa;
import infa.Adicional.Tomate;
import infa.Decoradores.AderezoDecorator;
import infa.Decoradores.AdicionalDecorator;
import infa.Decoradores.PanDecorator;
import infa.Decoradores.PrincipalDecorator;
import infa.Decoradores.Sandwich;
import infa.Decoradores.SandwichInterface;
import infa.Pan.PanBrioche;
import infa.Principal.CarneTernera;

public class ClasicoCreator extends SandwichFactory{
    public SandwichInterface makeSandwich(){
        Sandwich sandwich = new Sandwich();
        PanDecorator pan = new PanDecorator(sandwich,new PanBrioche());
        AderezoDecorator aderezo = new AderezoDecorator(pan,new Mayonesa());
        PrincipalDecorator principal = new PrincipalDecorator(aderezo,new CarneTernera());
        AdicionalDecorator adicional = new AdicionalDecorator(principal,new Tomate());
        return adicional;
    
    }
}
