package infa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class novedadStrategy implements PeliculaStrategy {
    
    public String preview(List<Pelicula> peliculasNoReproducidas) {
        if (peliculasNoReproducidas.isEmpty()){
            return "No hay sugerencias disponibles.";
        }

        String str ="";
        List<Pelicula> peliculasMasRecientes = peliculasNoReproducidas.stream()
        .sorted(Comparator.comparing(Pelicula::getAnioDeEstreno).reversed()).limit(3)
        .collect(Collectors.toList());

        for (Pelicula pelicula : peliculasMasRecientes) {
            str+=pelicula.getTitulo()+ ",";
        }
        return str;
    }
}
