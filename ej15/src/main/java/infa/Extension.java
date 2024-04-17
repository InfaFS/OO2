package infa;

public class Extension extends Decorator {
    public Extension(FileOO2 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint() + "Extension - ";
    }
}
