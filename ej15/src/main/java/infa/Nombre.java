package infa;

public class Nombre extends BaseDecorator {
    public Nombre(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return super.prettyPrint() + " Nombre: " + file.getNombre();
    }
    
}
