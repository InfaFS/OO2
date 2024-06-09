package infa;

public class SeguroTerceros extends Seguro {
    
    public SeguroTerceros(Vehiculo vehiculo, Asegurado asegurado) {
        super(vehiculo,asegurado);
    }
    public double costo_seguro_vida (){
        // return this.asegurado.getEdad() * 100.0; en el conductor
        return 0.0;
    }

    public double costo_cobertura_danios() {
        return 1000.0 + this.vehiculo.getPorcientoValor(0.01);
    }
    
    public double costo_destruccion_total() {
        return 0.0;
    }
}
