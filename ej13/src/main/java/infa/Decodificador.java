package infa;

import java.util.ArrayList;
import java.util.List;

public class Decodificador implements DecodificadorI{
    private List<Pelicula> peliculasReproducidas;
    private List<Pelicula> peliculas;
    private List<Pelicula> peliculasNoReproducidas;
    public Decodificador() {
        this.peliculas = new ArrayList<Pelicula>();
        this.peliculasReproducidas = new ArrayList<Pelicula>();
    }

    public void addPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    public void addPeliculaReproducida(Pelicula pelicula) {
        this.peliculasReproducidas.add(pelicula);
    }

    public List<Pelicula> getPeliculas() {
        return this.peliculas;
    }

    public List<Pelicula> getPeliculasReproducidas() {
        return this.peliculasReproducidas;
    }

    public String sugerir(){
        if (this.peliculas.isEmpty()){
            return "No hay sugerencias disponibles.";
        }
        return "Sugerencias: \n";
    }
    
    
}
