package infa;

public class EncriptadorRSA extends Encriptador {
    public String encriptar(String mensaje){
        return (mensaje + " {Encriptado con RSA}");
    }
}
