package infa;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Asegurado {

    private PromocionStrategy promo;
    private List<Vehiculo> vehiculos;
    private int edad;

    public Asegurado (PromocionStrategy promo,int edad){
        this.promo=promo;
        this.vehiculos= new ArrayList<Vehiculo>();
        this.edad=edad;
    }
    public double seguroDelConductor () {
        return 100.0 * this.edad;
    }
    
    public int getEdad() {
        return this.edad;
    }

    public List<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }

    public double getCostoTotal(){
        return this.promo.AplicarPromo(getVehiculosConPoliza());
    }

    public void setPromo (PromocionStrategy promo) {
        this.promo=promo; 
    }

    public List<Vehiculo> getVehiculosConPoliza(){
        return vehiculos.stream()
                        .filter(Vehiculo::tieneSeguro)
                        .collect(Collectors.toList());

    }

    public void setVehiculos (List<Vehiculo> vehiculos) {
        this.vehiculos=vehiculos;
    }
}
