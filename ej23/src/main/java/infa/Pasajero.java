package infa;

public class Pasajero {
    
    private String nombre;
    private String DNI;

    public Pasajero (String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDNI() {
        return this.DNI;
    }
}
