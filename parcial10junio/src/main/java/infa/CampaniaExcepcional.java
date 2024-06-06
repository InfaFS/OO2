package infa;

import java.util.ArrayList;
import java.util.List;

public class CampaniaExcepcional extends PromocionStrategy {

    public double AplicarPromo(List<Vehiculo> vehiculos) {
        return vehiculos.stream().mapToDouble(v -> v.getCostoSeguro()).sum() - CincuentaPorcientoSeguroMasEconomico(vehiculos);
    }
    private double CincuentaPorcientoSeguroMasEconomico(List<Vehiculo> vehiculos){
        return vehiculos.stream().mapToDouble(vehiculo -> vehiculo.getCostoSeguro()).min().orElse(0);
    }
}
