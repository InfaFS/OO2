package infa;

public class CompraBajoRiesgo extends ProductoFinanciero {
    private double variacion;
    private int parking;

    public CompraBajoRiesgo(int parking){

        this.variacion = 0.05;
        this.parking = parking;
    }

    public double retornoInversion(double montoInicial){
        return this.variacion*montoInicial*this.parking;
    }

}
