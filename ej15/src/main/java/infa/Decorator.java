package infa;

public abstract class Decorator implements FileOO2 {
    protected FileOO2 file;

    public Decorator(FileOO2 file) {
        this.file = file;
    }

    @Override
    public String prettyPrint() {
        return file.prettyPrint();
    }
}
