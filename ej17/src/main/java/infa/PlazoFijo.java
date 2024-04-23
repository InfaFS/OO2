package infa;

public class PlazoFijo extends ProductoFinanciero{
    private int cantidadDias;
    private double tasaInteres;

    public PlazoFijo(int cantidadDias, double tasaInteres){
        this.cantidadDias = cantidadDias;
        this.tasaInteres = tasaInteres;
    }

    public double retornoInversion(double montoInicial){
        return montoInicial * this.cantidadDias * this.tasaInteres;
    }

}
