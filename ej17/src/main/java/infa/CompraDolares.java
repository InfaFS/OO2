package infa;

public class CompraDolares extends ProductoFinanciero {
    private double valorCompra;

    public CompraDolares(double valorCompra){
        this.valorCompra = valorCompra;
    }
    public double retornoInversion(double montoInicial){
        return montoInicial / this.valorCompra;
    }
    
}
