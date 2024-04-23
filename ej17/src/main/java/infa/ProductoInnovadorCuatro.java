package infa;

public class ProductoInnovadorCuatro extends ProductoInnovador {


    public ProductoCombinado obtenerProductoFinanciero(Cliente cliente){
        return new Producto4().obtenerProducto(cliente);
    }

}
