package infa;

public class CreadorArquero extends CreadorDePersonaje {
    public Personaje creadorPersonalizado(){
        return new Arquero();
    }
}
