package infa;

public abstract class BaseDecorator implements FileOO2 {
    protected FileOO2 file;

    public BaseDecorator(FileOO2 file) {
        this.file = file;
    }

    public String prettyPrint() {
        return file.prettyPrint();
    }

    public String getNombre() {
        return file.getNombre();
    }

    public String getExtension() {
        return file.getExtension();
    }

    public int getTamanio() {
        return file.getTamanio();
    }

    public String getFecha() {
        return file.getFecha();
    }

    public String getFechaModificacion() {
        return file.getFechaModificacion();
    }

    public String getPermisos() {
        return file.getPermisos();
    }
   


}
