package infa;

import java.util.*;

public abstract class SystemFile {
    private String nombre;
    private String fechaCreacion;
    
    public SystemFile(String nombre, String fechaCreacion){
        this.nombre=nombre;
        this.fechaCreacion=fechaCreacion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getFechaCreacion(){
        return this.fechaCreacion;
    }

    public abstract boolean busquedaNombre(String nombreBuscado);
    public abstract int getTamanio();
    public abstract int getTamanioArchivo();
    public abstract File getArchivo();
    public abstract ArrayList<SystemFile> busquedaNombres(ArrayList<SystemFile> lista,String nombre);
    public abstract String listadoTotal(String stringLista);

}
