package infa;

import java.util.ArrayList;
import java.util.List;

public class SinPromo extends PromocionStrategy {
    public double AplicarPromo(List<Vehiculo> vehiculos) {
        return vehiculos.stream().mapToDouble(v -> v.getCostoSeguro()).sum();
    }
    
}
