package infa; 
import java.util.*;
public class Directorio extends SystemFile { //es el composite

    private ArrayList<SystemFile> contenido;
// ArrayList<SystemFile> contenido
    public Directorio(String nombre, String fechaCreacion) {
        super(nombre,fechaCreacion);
        contenido = new ArrayList<SystemFile>();

    }

   public boolean addFileDirectory(SystemFile file){
        return contenido.add(file);
   }

    public int getTamanio(){
        return (32 + contenido.stream().mapToInt(c -> c.getTamanio()).sum());
    }

    public boolean busquedaNombre (String nombre){
        if (this.getNombre().equals(nombre)){
            return true;
        }
        return contenido.stream().anyMatch(c -> c.busquedaNombre(nombre));
    }

    public int getTamanioArchivo(){
       // return this.contenido.stream().max((f1,f2) -> Integer.compare(f1.getTamanioArchivo(),f2.getTamanioArchivo()));
        return this.contenido.stream().mapToInt(f -> f.getTamanioArchivo()).max().getAsInt();
    }

    public File getArchivo(){
        return this.contenido.stream().map(f -> f.getArchivo()).max((f1,f2) -> f1.getFechaCreacion().compareTo(f2.getFechaCreacion())).get();
    }

    public ArrayList<SystemFile> busquedaNombres(ArrayList<SystemFile> lista,String nombre){
        for(SystemFile f: contenido){
            f.busquedaNombres(lista, nombre);
        }
        return lista;
    }

    public String listadoTotal(String stringLista){ //aplicar para archivos tmb, ver la aplicacion despues
        //if (contenido.isEmpty()){
         //   stringLista = "/Directorio " + this.getNombre() + "\n";
         //   return stringLista;
        //}
        stringLista += "/Directorio " + this.getNombre();
        for(SystemFile f: contenido){
            stringLista += f.listadoTotal(stringLista) + "\n";
        }
        return stringLista;
        
    }
}
