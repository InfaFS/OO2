package infa;

import java.util.ArrayList;
import java.util.List;

public class MultiplesPolizas extends PromocionStrategy {

    public double AplicarPromo(List<Vehiculo> vehiculos){
        if (vehiculos.size() >= 2) {
            return vehiculos.stream().mapToDouble(vehiculo -> AplicarDescuento(vehiculo)).sum(); 
        }
        return vehiculos.stream().mapToDouble( vehiculo -> vehiculo.getCostoSeguro()).sum();
    }
    
    private double AplicarDescuento(Vehiculo vehiculo){
        return vehiculo.getCostoSeguro() - vehiculo.getCostoSeguro() * 0.1;
    }
}
