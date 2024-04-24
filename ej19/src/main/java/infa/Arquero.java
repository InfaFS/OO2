package infa;

import java.util.ArrayList;

public class Arquero extends Personaje {
    public Arquero (Armadura armadura, Armas arma ,ArrayList<Habilidades> habilidades){
        super(arma,armadura,habilidades);
      } 
    
      public String getTipo(){
        return "Arquero";
      }
}   
