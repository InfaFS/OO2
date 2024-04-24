package infa.Decoradores;

import infa.Pan.Pan;

public class PanDecorator extends SandwichDecorator {
    private Pan pan;
    public PanDecorator (SandwichInterface sandwich, Pan pan) {
        super(sandwich);
        this.pan=pan;
    }


    public String aniadirIngrediente() {
        return super.aniadirIngrediente() + "Pan " + pan.getTipo() + "Valor( " + pan.getValor() + " ) ";
    }

    public int getValorSandwich() {
        return super.getValorSandwich() + pan.getValor();
    }
}


