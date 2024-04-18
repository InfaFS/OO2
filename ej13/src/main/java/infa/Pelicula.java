package infa;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private int anioDeEstreno;
    private ArrayList<Pelicula> peliculasSimilares;
    private double puntaje;
    
    public Pelicula(String titulo, int anioDeEstreno, double puntaje) {
        this.titulo = titulo;
        this.anioDeEstreno = anioDeEstreno;
        this.puntaje = puntaje;
        this.peliculasSimilares = new ArrayList<Pelicula>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAnioDeEstreno() {
        return this.anioDeEstreno;
    }

    public ArrayList<Pelicula> getPeliculasSimilares() {
        return this.peliculasSimilares;
    }

    public void addPeliculaSimilar(Pelicula pelicula) {
        if (!this.peliculasSimilares.contains(pelicula) && !pelicula.getPeliculasSimilares().contains(this)) {
            this.peliculasSimilares.add(pelicula);
            pelicula.addPeliculaSimilar(this);
        }
        return;

    }

    public double getPuntaje() {
        return this.puntaje;
    }
}
