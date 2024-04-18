package infa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class similaridadStrategy implements PeliculaStrategy {
    private List<Pelicula> peliculasReproducidas;

    public similaridadStrategy(List<Pelicula> peliculasReproducidas) {
        this.peliculasReproducidas = peliculasReproducidas;
    }
    
    public String preview(List<Pelicula> peliculasNoReproducidas){
        if (peliculasNoReproducidas.isEmpty()){
            return "No hay sugerencias disponibles.";
        }

        String str ="";
        List<Pelicula> peliculasAAnalizar = new ArrayList<Pelicula>();
            for (Pelicula pelicula : this.peliculasReproducidas) {
                for (Pelicula pelicula2 : peliculasNoReproducidas) {
                    if(pelicula.getPeliculasSimilares().contains(pelicula2) && !peliculasAAnalizar.contains(pelicula2)){
                        peliculasAAnalizar.add(pelicula2);
                    }
                    }
                }
        List<Pelicula> peliculasMasSimilares = peliculasAAnalizar.stream()
                .sorted(Comparator.comparing(Pelicula::getAnioDeEstreno).reversed()).limit(3).collect(Collectors.toList());
        
        for (Pelicula pelicula : peliculasMasSimilares) {
            str+=pelicula.getTitulo()+ ",";
        } 
        return str;
    }
}
