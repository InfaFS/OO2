package infa;

import java.util.ArrayList;
import java.util.List;

public class MultiplesPolizas extends PromocionStrategy {
    private static final double diez_porciento = 0.1;
    public double AplicarPromo(Asegurado asegurado){
        if (asegurado.getVehiculos().size() > 2) {
            return asegurado.getCostosSeguros() * diez_porciento;
        }
        return 0;
    }
    

}
