package infa;

import java.util.ArrayList;

public class Guerrero extends Personaje {
    public Guerrero (Armadura armadura, Armas arma ,ArrayList<Habilidades> habilidades){
        super(arma,armadura,habilidades);
      } 
    
      public String getTipo(){
        return "Guerrero";
      }
}
