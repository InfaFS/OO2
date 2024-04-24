package infa;

public class Usuario {
    private Personaje pj;

    public void PvP(Personaje pjEnemigo){
        pj.atacar(pjEnemigo);
    }

    public Personaje getPersonaje(){
        return this.pj;
    }

    public void setearMago(){
        CreadorDePersonaje creador = new CreadorMago();
        this.pj = creador.crearPersonaje();
    }

    public void setearGuerrero(){
        CreadorDePersonaje creador = new CreadorGuerrero();
        this.pj = creador.crearPersonaje();
    }

    public void setearArquero(){
        CreadorDePersonaje creador = new CreadorArquero();
        this.pj = creador.crearPersonaje();
    }
}
