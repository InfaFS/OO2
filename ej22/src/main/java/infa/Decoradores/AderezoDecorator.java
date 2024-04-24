package infa.Decoradores;

import infa.Aderezo.Aderezo;

public class AderezoDecorator extends SandwichDecorator {
    private Aderezo aderezo;
    public AderezoDecorator (SandwichInterface sandwich, Aderezo aderezo) {
        super(sandwich);
        this.aderezo=aderezo;
    }


    public String aniadirIngrediente() {
        return super.aniadirIngrediente() + "Aderezo " + aderezo.getTipo() + "Valor( " + aderezo.getValor() + " ) ";
    }

    public int getValorSandwich() {
        return super.getValorSandwich() + aderezo.getValor();
    }
}
