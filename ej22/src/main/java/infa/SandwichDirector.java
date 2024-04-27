package infa;

public class SandwichDirector {
    public void buildSandwich(SandwichBuilder sandwichBuilder){
        sandwichBuilder.buildPan();
        sandwichBuilder.buildAderezo();
        sandwichBuilder.buildPrincipal();
        sandwichBuilder.buildAdicional();
    }
}
