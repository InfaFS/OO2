package infa;

public class Nombre extends Decorator {
    public Nombre(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint() + "Nombre - ";
    }
    
}
