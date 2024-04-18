package infa;

import java.util.ArrayList;

public class FileManager implements FileOO2 {
    private String nombre;
    private String extension;
    private int tamanio;
    private String fechaCreacion;
    private String fechaModificacion;
    private String permisos;
    
    public FileManager(String nombre, String extension, int tamanio, String fechaCreacion, String fechaModificacion, String permisos) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.permisos = permisos;
    }

    public String prettyPrint() {
        return "* ";

    }
    
    public String getNombre() {
        return this.nombre;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public String getFecha() {
        return this.fechaCreacion;
    }

    public String getFechaModificacion() {
        return this.fechaModificacion;
    }

    public String getPermisos() {
        return this.permisos;
    }


}
