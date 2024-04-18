package infa;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class puntajeDecorator extends BaseDecodificadorDecorator {
    public puntajeDecorator(DecodificadorI decodificador) {
        super(decodificador);
    }

    @Override
    public String sugerir() {
        return super.sugerir() + "Puntaje: " + this.peliculasMejorPuntadas() +"\n";
    }

    private String peliculasMejorPuntadas(){
        String string = "";
        List<Pelicula> peliculasReproducidas = getPeliculasReproducidas();
        List<Pelicula> peliculas = getPeliculas();

        List<Pelicula> peliculasNoReproducidas = peliculas.stream()
            .filter(pelicula -> !peliculasReproducidas.contains(pelicula))
            .collect(Collectors.toList());
        List<Pelicula> peliculasConMayorPuntaje = peliculasNoReproducidas.stream()
            .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed()).limit(3)
            .collect(Collectors.toList());
    
        
        for (Pelicula pelicula : peliculasConMayorPuntaje) {
            string+=pelicula.getTitulo()+ ",";
        }
        return string;
    }
}
