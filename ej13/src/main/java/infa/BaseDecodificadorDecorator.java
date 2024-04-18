package infa;
//hacer strategy
import java.util.ArrayList;
import java.util.List;

public class BaseDecodificadorDecorator implements DecodificadorI {
    
    private DecodificadorI decodificador;
        
    public BaseDecodificadorDecorator(DecodificadorI decodificador) {
        this.decodificador = decodificador;
    }
    
    @Override
    public List<Pelicula> getPeliculas() {
        return this.decodificador.getPeliculas();
    }

    
    @Override
    public List<Pelicula> getPeliculasReproducidas() {
        return this.decodificador.getPeliculasReproducidas();
    }

    @Override
    public String sugerir(){
        return this.decodificador.sugerir();
    }
}
