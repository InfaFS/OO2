package infa;

public class Producto3 implements Producto {
    
    public ProductoCombinado obtenerProducto(Cliente cliente){
        ProductoCombinado productoFinal = new ProductoCombinado();
        CompraAltoRiesgo compraAltoRiesgo = new CompraAltoRiesgo(cliente.getParking());
        CompraBajoRiesgo compraBajoRiesgo = new CompraBajoRiesgo(cliente.getParking());
        PlazoFijo plazoFijo = new PlazoFijo(cliente.getPlazo(), cliente.getTasa());

        productoFinal.agregarProducto(compraAltoRiesgo);
        productoFinal.agregarProducto(compraBajoRiesgo);
        productoFinal.agregarProducto(plazoFijo);
        return productoFinal;

    }
}
