package infa;

public class ClienteGold extends Cliente {
    public ClienteGold(){
        super(24,6.0,30);
    }

    public ClienteGold(int plazo){
        super(24,6.0,plazo);
    }

    private int chequearPlazo(int plazo){
        if (plazo < 30 ){
            return 30;
        }
        return plazo;
    }

    public double obtenerInversionProducto1(Double montoInicial){
        ProductoInnovadorUno productoInnovadorUno = new ProductoInnovadorUno();
        return productoInnovadorUno.obtenerInversionProducto(montoInicial,this);

    }

    public double obtenerInversionProducto2(Double montoInicial){
        ProductoInnovadorDos productoInnovadorDos = new ProductoInnovadorDos();
        return productoInnovadorDos.obtenerInversionProducto(montoInicial,this);
    }

    public double obtenerInversionProducto3(Double montoInicial){
        ProductoInnovadorTres productoInnovadorTres = new ProductoInnovadorTres();
        return productoInnovadorTres.obtenerInversionProducto(montoInicial,this);

    }

    public double obtenerInversionProducto4(Double montoInicial){
        ProductoInnovadorCuatro productoInnovadorCuatro = new ProductoInnovadorCuatro();
        return productoInnovadorCuatro.obtenerInversionProducto(montoInicial,this);
    }
}
