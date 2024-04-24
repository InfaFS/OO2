package infa;

public class CreadorGuerrero extends CreadorDePersonaje{
    public Personaje creadorPersonalizado(){
        return new Guerrero();
    }
}
