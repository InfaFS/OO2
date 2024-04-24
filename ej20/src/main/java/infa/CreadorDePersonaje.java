package infa;

public abstract class CreadorDePersonaje {

    public Personaje crearPersonaje(){
        return creadorPersonalizado();
    }
    
    public abstract Personaje creadorPersonalizado();

    
}
