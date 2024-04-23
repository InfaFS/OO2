package infa;

public class ProductoInnovadorDos extends ProductoInnovador{
    
    public ProductoCombinado obtenerProductoFinanciero(Cliente cliente){
        return new Producto2().obtenerProducto(cliente);

    }
}
