package infa;

public abstract class Seguro {

    protected Vehiculo vehiculo;
    protected Asegurado asegurado;

    public Seguro (Vehiculo vehiculo, Asegurado asegurado){
        this.vehiculo = vehiculo;
        this.asegurado = asegurado;
    }
    //template method
    public double getCostoSeguro() { //recibirlos como parametro 
        return (this.asegurado.seguroDelConductor() + this.costo_seguro_vida()) + this.costo_cobertura_danios() +  (this.vehiculo.getPorcientoValor(0.05)+ this.costo_destruccion_total());
    }
    public abstract double costo_seguro_vida ();
    public abstract double costo_cobertura_danios();
    public abstract double costo_destruccion_total();
    
}
