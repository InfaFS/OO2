package infa;

public class SeguroTercerosCompleto extends Seguro{

    public SeguroTercerosCompleto(Vehiculo vehiculo, Asegurado asegurado) {
        super(vehiculo,asegurado);
    }
    public double costo_seguro_vida (){
        return this.vehiculo.getOcupantes() * 5000.0;
    }

    public double costo_cobertura_danios() {
        if (vehiculo.getAntiguedad() > 4) {
            return vehiculo.getAntiguedad() * 4000.0;
        }
        return 10000.0;
    }
    
    public double costo_destruccion_total() {
        return 10000.0; //hay un template aca
    }
}
