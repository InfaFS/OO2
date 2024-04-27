package infa;

import infa.Aderezo.SalsaTartara;
import infa.Adicional.VerdurasGrilladas;
import infa.Pan.PanChipa;
import infa.Principal.Pollo;

public class SinTACCBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    public SinTACCBuilder() {
        this.sandwich = new Sandwich();
    }

    public void buildPan() {
        this.sandwich.setPan(new PanChipa());
    }

    public void buildAderezo() {
        this.sandwich.setAderezo(new SalsaTartara());
    }

    public void buildPrincipal() {
        this.sandwich.setPrincipal(new Pollo());
    }

    public void buildAdicional() {
        this.sandwich.setAdicional(new VerdurasGrilladas());
    }

    public Sandwich getSandwich(){
        return this.sandwich;
    }

}
