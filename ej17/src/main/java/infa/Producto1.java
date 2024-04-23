package infa;

public class Producto1 implements Producto{
    

    public ProductoCombinado obtenerProducto(Cliente cliente){
        ProductoCombinado productoFinal = new ProductoCombinado();
        CompraDolares compraDolares = new CompraDolares(1000);
        PlazoFijo plazoFijo = new PlazoFijo(cliente.getPlazo(),cliente.getTasa());
        CompraPesos compraPesos = new CompraPesos(1000);
        productoFinal.agregarProducto(compraDolares);
        productoFinal.agregarProducto(plazoFijo);
        productoFinal.agregarProducto(compraPesos);
        return productoFinal;

    }
}
