package infa;

public class SeguroTercerosCompleto extends Seguro{
    private static final double monto_seguro_vida = 5000.0;
    private static final double valor_cobertura_danios_1 = 4000.0;
    private static final double valor_cobertura_danios_2 = 10000.0;
    public SeguroTercerosCompleto(Vehiculo vehiculo, Asegurado asegurado) {
        super(vehiculo,asegurado);
    }
    public double costo_seguro_vida (){
        return this.vehiculo.getOcupantes() * monto_seguro_vida;
    }

    public double costo_cobertura_danios() {
        if (vehiculo.getAntiguedad() > 4) {
            return vehiculo.getAntiguedad() * valor_cobertura_danios_1;
        }
        return valor_cobertura_danios_2;
    }
    
    public double costo_destruccion_total() {
        return valor_cobertura_danios_2; //hay un template aca
    }
}
