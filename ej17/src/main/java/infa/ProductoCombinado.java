package infa;

import java.util.ArrayList;

public class ProductoCombinado extends ProductoFinanciero {
    private ArrayList<ProductoFinanciero> productos;
    
    public ProductoCombinado(){
        this.productos = new ArrayList<ProductoFinanciero>();
    }

    public void agregarProducto(ProductoFinanciero producto){
        this.productos.add(producto);
    }

    public double retornoInversion(double montoInicial){
        double retorno = montoInicial;
        for (ProductoFinanciero producto : this.productos){
            retorno = producto.retornoInversion(retorno);
        }
        return retorno;
    }
}
