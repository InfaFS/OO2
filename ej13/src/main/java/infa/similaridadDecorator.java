package infa;

import java.util.*;
import java.util.stream.Collectors;

public class similaridadDecorator extends BaseDecodificadorDecorator {
    public similaridadDecorator(DecodificadorI decodificador) {
        super(decodificador);
    }

    @Override
    public String sugerir() {
        return super.sugerir() + "Similares: " + this.peliculasMasSimilares() +"\n";
    }

    private String peliculasMasSimilares(){
        String string = "";
        List<Pelicula> peliculasReproducidas = getPeliculasReproducidas();
        List<Pelicula> peliculas = getPeliculas();

        List<Pelicula> peliculasNoReproducidas = peliculas.stream()
            .filter(pelicula -> !peliculasReproducidas.contains(pelicula))
            .collect(Collectors.toList());
        List<Pelicula> peliculasAAnalizar = new ArrayList<Pelicula>();
            for (Pelicula pelicula : peliculasReproducidas) {
                for (Pelicula pelicula2 : peliculasNoReproducidas) {
                    if(pelicula.getPeliculasSimilares().contains(pelicula2) && !peliculasAAnalizar.contains(pelicula2)){
                        peliculasAAnalizar.add(pelicula2);
                    }
                    }
                }
        List<Pelicula> peliculasMasSimilares = peliculasAAnalizar.stream()
                .sorted(Comparator.comparing(Pelicula::getAnioDeEstreno).reversed()).limit(3).collect(Collectors.toList());
        
        for (Pelicula pelicula : peliculasMasSimilares) {
            string+=pelicula.getTitulo()+ ",";
        }
        return string;
    }
}
