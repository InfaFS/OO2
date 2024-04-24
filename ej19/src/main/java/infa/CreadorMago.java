package infa;

public class CreadorMago extends CreadorDePersonaje {
    public Personaje creadorPersonalizado(){
        return new Mago();
    }
}
