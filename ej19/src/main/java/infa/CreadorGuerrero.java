package infa;

import java.util.ArrayList;

public class CreadorGuerrero extends CreadorDePersonaje{
    public Personaje creadorPersonalizado(){
        ArrayList<Habilidades> habilidades = new ArrayList<Habilidades>();
        habilidades.add(new CuerpoACuerpo());
        return new Guerrero(new ACuero(), new Espada(), habilidades);
    }
}
