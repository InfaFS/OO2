package infa;

public abstract class ProductoInnovador {
    
    public double obtenerInversionProducto(double montoInicial,Cliente cliente){
      ProductoCombinado producto = obtenerProductoFinanciero(cliente);
        return producto.retornoInversion(montoInicial);

    }

    public abstract ProductoCombinado obtenerProductoFinanciero(Cliente cliente);

}
