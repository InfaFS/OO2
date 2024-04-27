package infa.Decoradores;
//decorator solo para funcionalidades

import infa.Principal.Principal;

public class PrincipalDecorator extends SandwichDecorator{
    private Principal principal;

    public PrincipalDecorator(SandwichInterface sandwich, Principal principal){
        super(sandwich);
        this.principal = principal;
    } 

    public String aniadirIngrediente(){
        return super.aniadirIngrediente() + "Principal " + principal.getTipo() + "Valor( " + principal.getValor() + " ) ";
    }

    public int getValorSandwich(){
        return super.getValorSandwich() + principal.getValor();
    }
}
