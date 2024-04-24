package infa.Decoradores;

public class Sandwich implements SandwichInterface {
    private int valorSandwich = 0;

    public String aniadirIngrediente() {
        return "Creando Sandwich --> ";
    }

    public int getValorSandwich() {
        return this.valorSandwich;
    }
}
