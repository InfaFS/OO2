package infa;

public class Permisos extends BaseDecorator{
    public Permisos(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint() + " Permisos: " + file.getPermisos();
    }
}
