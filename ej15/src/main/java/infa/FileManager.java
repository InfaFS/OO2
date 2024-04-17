package infa;

import java.util.ArrayList;

public class FileManager implements FileOO2 {
    // realizar la implementacion de la clase
    private ArrayList<Decorator> lista;

    public FileManager(){
        lista = new ArrayList<Decorator>();
    }

    public void addArchivo(Decorator d){
        lista.add(d);
    }

    @Override
    public String prettyPrint() {
        return "";

    }

    public void deleteUltimoArchivo(){
        this.lista.remove(lista.size()-1);
    }

    public String prettyPrintAll(){
       if(this.lista.size() == 0)
           return "No hay archivos\n";
       return this.lista.get(this.lista.size()-1).prettyPrint();
    }
}
