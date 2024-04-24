package infa;

import java.util.ArrayList;

public class Mago extends Personaje {

  public Mago (Armadura armadura, Armas arma ,ArrayList<Habilidades> habilidades){
    super(arma,armadura,habilidades);
  } 

  public String getTipo(){
    return "Mago";
  }
}
