package infa;

import java.util.ArrayList;

public class CreadorArquero extends CreadorDePersonaje {
    public Personaje creadorPersonalizado(){
        ArrayList<Habilidades> habilidades = new ArrayList<Habilidades>();
        habilidades.add(new ADistancia());

        return new Arquero(new ACuero(), new Arco(), habilidades);
    }
}
