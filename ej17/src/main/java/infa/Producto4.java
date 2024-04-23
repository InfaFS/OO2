package infa;

public class Producto4 implements Producto {
    public ProductoCombinado obtenerProducto(Cliente cliente){
    ProductoCombinado productoFinal = new ProductoCombinado();
        CompraAltoRiesgo compraAltoRiesgo = new CompraAltoRiesgo(cliente.getParking());
        CompraAltoRiesgo compraAltoRiesgo2 = new CompraAltoRiesgo(cliente.getParking());
        CompraAltoRiesgo compraAltoRiesgo3 = new CompraAltoRiesgo(cliente.getParking());
        
        productoFinal.agregarProducto(compraAltoRiesgo);
        productoFinal.agregarProducto(compraAltoRiesgo2);
        productoFinal.agregarProducto(compraAltoRiesgo3);
        return productoFinal;
    }
}
