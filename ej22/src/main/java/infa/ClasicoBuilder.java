package infa;

import infa.Aderezo.Mayonesa;
import infa.Adicional.Tomate;
import infa.Pan.PanBrioche;
import infa.Principal.CarneTernera;

public class ClasicoBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    public ClasicoBuilder() {
        this.sandwich = new Sandwich();
    }

    public void buildPan() {
        this.sandwich.setPan(new PanBrioche());
    }

    public void buildAderezo() {
        this.sandwich.setAderezo(new Mayonesa());
    }

    public void buildPrincipal() {
        this.sandwich.setPrincipal(new CarneTernera());
    }

    public void buildAdicional() {
        this.sandwich.setAdicional(new Tomate());
    }

    public Sandwich getSandwich(){
        return this.sandwich;
    }
}
