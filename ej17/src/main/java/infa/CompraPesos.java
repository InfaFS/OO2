package infa;

public class CompraPesos extends ProductoFinanciero{

    private double valorCompra;
    
    public CompraPesos(double valorCompra){
        this.valorCompra = valorCompra;
    }
    public double retornoInversion(double montoInicial){
        return montoInicial * this.valorCompra;
    }
    
}
