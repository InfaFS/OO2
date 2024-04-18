package infa;

public class FechaModificacion extends BaseDecorator {
    public FechaModificacion(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint() + " FechaModificacion: " + file.getFechaModificacion();
    }

}
