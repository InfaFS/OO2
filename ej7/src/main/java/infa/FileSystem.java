package infa;
import java.lang.reflect.Array;
import java.util.*;

public class FileSystem {
    private ArrayList<SystemFile> files;


    public FileSystem(){
        files = new ArrayList<SystemFile>();
    }
    //creado por mi
    public boolean addFile(SystemFile file){
       return files.add(file);
    }
    //creado por mi
    public int tamanoTotalOcupado(){
       return files.stream().mapToInt(f -> f.getTamanio()).sum();
    }

    public int archivoMasGrande(){
        return files.stream().mapToInt(f -> f.getTamanioArchivo()).max().getAsInt();
    }
    
    public boolean buscar(String nombre){
       return files.stream().anyMatch(f -> f.busquedaNombre(nombre));
    
    }

    public File archivoMasNuevo(){
        return (File) files.stream().map(f -> f.getArchivo()).max((f1,f2) -> f1.getFechaCreacion().compareTo(f2.getFechaCreacion())).get();
    }

    public ArrayList<SystemFile> buscarTodos(String nombre){
        ArrayList<SystemFile> lista = new ArrayList<SystemFile>();
        for(SystemFile f: files){
            f.busquedaNombres(lista, nombre);
        }
        return lista;
    }

    public String listadoDeContenido(){
        String stringLista = "";
        for(SystemFile f: files){
            stringLista=f.listadoTotal(stringLista);
        }
        return stringLista;
    }
}
