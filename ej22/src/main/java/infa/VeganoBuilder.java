package infa;

import infa.Aderezo.SalsaCriolla;
import infa.Adicional.NullAdicional;
import infa.Pan.PanIntegral;
import infa.Principal.MilaGirgolas;

public class VeganoBuilder implements SandwichBuilder {
    private Sandwich sandwich;
    public VeganoBuilder() {
        this.sandwich = new Sandwich();
    }

    public void buildPan() {
        this.sandwich.setPan(new PanIntegral());
    }

    public void buildAderezo() {
        this.sandwich.setAderezo(new SalsaCriolla());
    }

    public void buildPrincipal() {
        this.sandwich.setPrincipal(new MilaGirgolas());
    }

    public void buildAdicional() {
        this.sandwich.setAdicional(new NullAdicional());
    }

    public Sandwich getSandwich(){
        return this.sandwich;
    }
}
