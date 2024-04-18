package infa;


import java.util.ArrayList;
import java.util.List;

public interface DecodificadorI  {
    public List<Pelicula> getPeliculas();
    public List<Pelicula> getPeliculasReproducidas();
    public String sugerir();
}
