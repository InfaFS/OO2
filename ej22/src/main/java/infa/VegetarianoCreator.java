package infa;

import infa.Adicional.Berenjenas;
import infa.Decoradores.AdicionalDecorator;
import infa.Decoradores.PanDecorator;
import infa.Decoradores.PrincipalDecorator;
import infa.Decoradores.Sandwich;
import infa.Decoradores.SandwichInterface;
import infa.Pan.PanSemillas;
import infa.Principal.ProvoGrillada;

public class VegetarianoCreator extends SandwichFactory{
    public SandwichInterface makeSandwich(){
        Sandwich sandwich = new Sandwich();
        PanDecorator pan = new PanDecorator(sandwich,new PanSemillas());
        PrincipalDecorator principal = new PrincipalDecorator(pan,new ProvoGrillada());
        AdicionalDecorator adicional = new AdicionalDecorator(principal,new Berenjenas());
        return adicional;
    
    }
}
