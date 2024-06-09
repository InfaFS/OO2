package infa;

public class SeguroTodoRiesgo extends Seguro{
    private static final double seguro_vida_valor = 9000.0;
    private static final double valor_cobertura_danios = 100000.0;
    private static final double valor_destruccion_total = 1000.0;
    public SeguroTodoRiesgo(Vehiculo vehiculo, Asegurado asegurado) {
        super(vehiculo,asegurado);
    }
    public double costo_seguro_vida (){
        return this.vehiculo.getAntiguedad() * seguro_vida_valor;
    }

    public double costo_cobertura_danios() {
        return valor_cobertura_danios / asegurado.getEdad();
    }
    
    public double costo_destruccion_total() {
        return valor_destruccion_total * this.vehiculo.getAntiguedad(); //hay un template aca
    }
}
