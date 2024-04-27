package infa;

import infa.Aderezo.NullAderezo;
import infa.Adicional.Berenjenas;
import infa.Pan.PanSemillas;
import infa.Principal.ProvoGrillada;

public class VegetarianoBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    public VegetarianoBuilder() {
        this.sandwich = new Sandwich();
    }

    public void buildPan() {
        this.sandwich.setPan(new PanSemillas());
    }

    public void buildAderezo() {
       this.sandwich.setAderezo(new NullAderezo());
    }

    public void buildPrincipal() {
        this.sandwich.setPrincipal(new ProvoGrillada());
    }

    public void buildAdicional() {
        this.sandwich.setAdicional(new Berenjenas());
    }

    public Sandwich getSandwich(){
        return this.sandwich;
    }
}
