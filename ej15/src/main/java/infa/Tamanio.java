package infa;

public class Tamanio extends Decorator {
    public Tamanio(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint() + "Tamanio - ";
    }
}
