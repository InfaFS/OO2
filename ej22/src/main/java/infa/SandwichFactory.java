package infa;

import infa.Decoradores.SandwichInterface;

public abstract class SandwichFactory {
    public void orderSandwich(){
        SandwichInterface sandwich = makeSandwich();
        System.out.println(sandwich.aniadirIngrediente());
        System.out.println("Valor total -->" + sandwich.getValorSandwich());
    }
    public abstract SandwichInterface makeSandwich();
    
}
