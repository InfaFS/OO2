package infa;

public class Tamanio extends BaseDecorator {
    public Tamanio(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint() + " Tamanio: " + file.getTamanio();
    }
}
