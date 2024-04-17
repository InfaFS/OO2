package infa;

public class FechaCreacion extends Decorator{
    public FechaCreacion(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint() + "FechaCreacion - ";
    }
}
