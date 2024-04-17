package infa;

public class Permisos extends Decorator{
    public Permisos(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint() + "Permisos - ";
    }
}
