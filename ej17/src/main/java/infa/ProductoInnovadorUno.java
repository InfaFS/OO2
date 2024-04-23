package infa;

public class ProductoInnovadorUno extends ProductoInnovador {


    public ProductoCombinado obtenerProductoFinanciero(Cliente cliente){
        return new Producto1().obtenerProducto(cliente);
    }
}
