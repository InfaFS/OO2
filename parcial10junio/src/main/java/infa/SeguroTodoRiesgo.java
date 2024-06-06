package infa;

public class SeguroTodoRiesgo extends Seguro{
    
    public SeguroTodoRiesgo(Vehiculo vehiculo, Asegurado asegurado) {
        super(vehiculo,asegurado);
    }
    public double costo_seguro_vida (){
        return this.vehiculo.getAntiguedad() * 9000.0;
    }

    public double costo_cobertura_danios() {
        return 100000.0 / asegurado.getEdad();
    }
    
    public double costo_destruccion_total() {
        return 1000.0 * this.vehiculo.getAntiguedad(); //hay un template aca
    }
}
