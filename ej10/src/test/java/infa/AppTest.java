package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @BeforeEach
    void setUp() throws Exception {
        
    }
 
    //faltaria testear lagarto y spock
    @Test
    public void testConexion()
    {
        Conexion conexionNormal = new Conexion();
        conexionNormal.enviarMensaje("Responde carlitos!");

        ConexionSegura conexionSegura = new ConexionSegura(new EncriptadorRC4());
        conexionSegura.enviarMensaje("Responde carlitos!");
        conexionSegura.setEncriptador(new EncriptadorBlowfish());
        conexionSegura.enviarMensaje("Responde carlitos!");
        conexionSegura.setEncriptador(new EncriptadorRSA());
        conexionSegura.enviarMensaje("Responde carlitos!");        
    }


}
