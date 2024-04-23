package infa;

public class ProductoInnovadorTres extends ProductoInnovador {


    public ProductoCombinado obtenerProductoFinanciero(Cliente cliente){
        return new Producto3().obtenerProducto(cliente);
    }

}
