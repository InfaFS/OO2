package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @BeforeEach
    void setUp() throws Exception {
        
    }
 
    //faltaria testear lagarto y spock
    @Test
    public void testGlobal()
    {
        //arrange
        Decodificador decodificador = new Decodificador();
        Pelicula Thor = new Pelicula("Thor", 2007, 7.9);
        Pelicula CapitanAmerica = new Pelicula("Capitan America", 2016,7.8 );
        Pelicula IronMan = new Pelicula("Iron Man", 2010, 7.9);
        Pelicula Dunkirk = new Pelicula("Dunkirk", 2017,7.91);
        Pelicula Rocky = new Pelicula("Rocky", 1976, 8.1);
        Pelicula Rambo = new Pelicula("Rambo", 1979, 7.8);
       
        Thor.addPeliculaSimilar(CapitanAmerica);
        Thor.addPeliculaSimilar(IronMan);

        Rocky.addPeliculaSimilar(Rambo);

        decodificador.addPelicula(Thor);
        decodificador.addPelicula(CapitanAmerica);
        decodificador.addPelicula(IronMan);
        decodificador.addPelicula(Dunkirk);
        decodificador.addPelicula(Rocky);
        decodificador.addPelicula(Rambo);
        
        decodificador.addPeliculaReproducida(Thor);
        decodificador.addPeliculaReproducida(Rocky);

        puntajeStrategy puntaje = new puntajeStrategy();
        decodificador.setStrategy(puntaje);
        System.out.println(decodificador.sugerir());
        novedadStrategy novedad = new novedadStrategy();
        decodificador.setStrategy(novedad);
        System.out.println(decodificador.sugerir());
        similaridadStrategy similaridad = new similaridadStrategy(decodificador.getPeliculas());
        decodificador.setStrategy(similaridad);
        System.out.println(decodificador.sugerir());
        
    }


}
