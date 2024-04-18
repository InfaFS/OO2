package infa;

public class FechaCreacion extends BaseDecorator{
    public FechaCreacion(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint() + " FechaCreacion: " + file.getFecha();
    }
}
