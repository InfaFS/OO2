package infa;

public class CompraAltoRiesgo extends ProductoFinanciero {
    private double variacion;
    private int parking;

    public CompraAltoRiesgo (int parking){

        this.variacion =0.6;
        this.parking = parking;
    }

    public double retornoInversion(double montoInicial){
        return this.variacion*this.parking*montoInicial;
    }

}
