package infa;

import java.util.ArrayList;
import java.util.List;

public class CampaniaExcepcional extends PromocionStrategy {

    public double AplicarPromo(Asegurado asegurado) {
        return asegurado.CincuentaPorcientoSeguroMasEconomico();
    }

}
