package infa.Decoradores;

import infa.Adicional.Adicional;

public class AdicionalDecorator extends SandwichDecorator{
    private Adicional adicional;

    public AdicionalDecorator (SandwichInterface sandwich, Adicional adicional) {
        super(sandwich);
        this.adicional=adicional;
    }

    public String aniadirIngrediente() {
        return super.aniadirIngrediente() + "Adicional " + adicional.getTipo() + "Valor( " + adicional.getValor() + " ) ";
    }

    public int getValorSandwich() {
        return super.getValorSandwich() + adicional.getValor();
    }
    
}
