package infa;

public class Producto2 implements Producto{
    
    public ProductoCombinado obtenerProducto(Cliente cliente){

        ProductoCombinado productoFinal = new ProductoCombinado();
        CompraBajoRiesgo compraBajoRiesgo = new CompraBajoRiesgo(cliente.getParking());
        CompraDolares compraDolares = new CompraDolares(1000.0);
        PlazoFijo plazoFijo = new PlazoFijo(cliente.getPlazo(),cliente.getTasa());
        CompraPesos compraPesos = new CompraPesos(1000.0);
        productoFinal.agregarProducto(compraBajoRiesgo);
        productoFinal.agregarProducto(compraDolares);
        productoFinal.agregarProducto(plazoFijo);
        productoFinal.agregarProducto(compraPesos);
        return productoFinal;
    }
}
