package infa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class puntajeStrategy implements PeliculaStrategy {
        
        public String preview(List<Pelicula> peliculasNoReproducidas) {
            if (peliculasNoReproducidas.isEmpty()){
                return "No hay sugerencias disponibles.";
            }
            String str ="";
            List<Pelicula> peliculasConMayorPuntaje = peliculasNoReproducidas.stream()
            .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed()).limit(3)
            .collect(Collectors.toList());
    
        
        for (Pelicula pelicula : peliculasConMayorPuntaje) {
            str+=pelicula.getTitulo()+ ",";
        }
        return str;
        }
    
}
