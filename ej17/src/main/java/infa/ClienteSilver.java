package infa;

public class ClienteSilver extends Cliente {
    public ClienteSilver(){
        super(72,5.0,35);   
    }

    public ClienteSilver(int plazo){
        super(72,5.0,plazo);
        

    }

    private int chequearPlazo(int plazo){
        if (plazo < 35 ){
            return 35;
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
}
