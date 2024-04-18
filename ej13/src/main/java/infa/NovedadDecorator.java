package infa;

import java.util.*;
import java.util.stream.Collectors;

public class NovedadDecorator extends BaseDecodificadorDecorator {
    public NovedadDecorator(DecodificadorI decodificador) {
        super(decodificador);
    }
    @Override
    public String sugerir() {
        return super.sugerir() + "Novedades: " + this.peliculasMasRecientes() +"\n";
    }

    private String peliculasMasRecientes() {
        String string = "";
    
        List<Pelicula> peliculasReproducidas = getPeliculasReproducidas();
        List<Pelicula> peliculas = getPeliculas();

        List<Pelicula> peliculasNoReproducidas = peliculas.stream()
            .filter(pelicula -> !peliculasReproducidas.contains(pelicula))
            .collect(Collectors.toList());

            List<Pelicula> peliculasMasRecientes = peliculasNoReproducidas.stream()
            .sorted(Comparator.comparing(Pelicula::getAnioDeEstreno).reversed()).limit(3)
            .collect(Collectors.toList());

        for (Pelicula pelicula : peliculasMasRecientes) {
            string+=pelicula.getTitulo()+ ",";
        }
        return string;
    }
    
}
