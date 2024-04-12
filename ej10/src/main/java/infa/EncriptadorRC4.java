package infa;

public class EncriptadorRC4 extends Encriptador {
    public String encriptar(String mensaje){
        return (mensaje + " {Encriptado con RC4}");
    }
}
