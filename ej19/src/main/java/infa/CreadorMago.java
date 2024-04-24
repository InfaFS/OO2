package infa;

import java.util.ArrayList;

public class CreadorMago extends CreadorDePersonaje {
    public Personaje creadorPersonalizado(){
        ArrayList<Habilidades> habilidades = new ArrayList<Habilidades>();
        habilidades.add(new ADistancia());
        habilidades.add(new Magia());
        return new Mago(new ACuero(), new Baston(),habilidades);
    }
}
