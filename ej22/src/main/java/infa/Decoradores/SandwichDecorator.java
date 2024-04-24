package infa.Decoradores;

public class SandwichDecorator implements SandwichInterface {
    
    private SandwichInterface sandwich;
    
    public SandwichDecorator(SandwichInterface sandwich) {
        this.sandwich = sandwich;
    }
    
    public String aniadirIngrediente() {
        return this.sandwich.aniadirIngrediente();
    }
    
    public int getValorSandwich() {
        return this.sandwich.getValorSandwich();
    }
}
