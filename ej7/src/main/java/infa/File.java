package infa;
import java.util.*;
public class File extends SystemFile {
    private int peso;

    public File(String nombre, String fechaCreacion, int peso) {
      super(nombre,fechaCreacion);
      this.peso=peso;
    }
    public int getTamanio(){
        return this.peso;
    }

    public int getTamanioArchivo(){
        return this.peso;
    }

    public File getArchivo(){
        return this;
    }

    public ArrayList<SystemFile> busquedaNombres(ArrayList<SystemFile> lista,String nombre){
        if(this.getNombre().equals(nombre)){
            lista.add(this);
        }
        return lista;
    }

    public String listadoTotal(String stringLista){
      stringLista = stringLista + "Archivo " + this.getNombre() + "\n";
      return stringLista;
    }

   // public String getFechaArchivo(){
   //     return this.getNombre();
   // }

    public boolean busquedaNombre(String nombreBuscado){
      if(nombreBuscado.equals(this.getNombre())){
        return true;
      }
      return false;
    }
}
