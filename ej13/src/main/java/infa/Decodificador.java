package infa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador{
    private List<Pelicula> peliculasReproducidas;
    private List<Pelicula> peliculas;
    private PeliculaStrategy estrategia;

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

    public List<Pelicula> getPeliculasNoReproducidas() {
        return this.peliculas.stream()
            .filter(pelicula -> !this.peliculasReproducidas.contains(pelicula))
            .collect(Collectors.toList());
    }

    public String sugerir(){
       return this.estrategia.preview(this.peliculas);
    }
    
    public void setStrategy(PeliculaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    
}
