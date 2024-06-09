package infa.Avion;

public abstract class Avion {
    private int asientos;
    private Double cargaKg;
    public Double cargaKg(){
        return 1500.0;
    }
    public abstract int getAsientos();
}
