package infa;

public class EncriptadorBlowfish extends Encriptador{
    public String encriptar(String mensaje){
        return (mensaje + " {Encriptado con Blowfish}");
    }
}
