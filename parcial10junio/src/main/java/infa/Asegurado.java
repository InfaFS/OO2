package infa;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Asegurado {
    private static final double seguroDelConductor_precio = 100.0;
    private PromocionStrategy promo;
    private List<Vehiculo> vehiculos;
    private int edad;

    public Asegurado (PromocionStrategy promo,int edad){
        this.promo=promo;
        this.vehiculos= new ArrayList<Vehiculo>();
        this.edad=edad;
    }
    public double seguroDelConductor () {
        return seguroDelConductor_precio * this.edad;
    }
    
    public int getEdad() {
        return this.edad;
    }

    public List<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }

    public double getCostoTotal(){
        return this.getCostosSeguros() - this.promo.AplicarPromo(this);
    }

    public double getCostosSeguros () {
        return this.vehiculos.stream().mapToDouble( v -> v.getCostoSeguro()).sum();
    }
    public void setPromo (PromocionStrategy promo) {
        this.promo=promo; 
    }

    public void setVehiculos (List<Vehiculo> vehiculos) {
        this.vehiculos=vehiculos;
    }

    public double CincuentaPorcientoSeguroMasEconomico(){
        return this.vehiculos.stream().mapToDouble(vehiculo -> vehiculo.getCostoSeguro()).min().orElse(0);
    }
}
