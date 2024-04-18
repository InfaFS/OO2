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
    public void testGlobal()
    {
        FileManager fileManager = new FileManager("nombre", "extension", 10, "fechaCreacion", "fechaModificacion", "permisos");
        Nombre nombre = new Nombre(fileManager);
        Extension extension = new Extension(nombre);
        System.out.println(extension.prettyPrint());
        FechaCreacion fechaCreacion = new FechaCreacion(extension);
        System.out.println(fechaCreacion.prettyPrint());
        
        FileManager fileManager2 = new FileManager("nombre2", "extension2", 20, "fechaCreacion2", "fechaModificacion2", "permisos2");
        Permisos permisos = new Permisos(fileManager2);
        Nombre nombre2 = new Nombre(permisos);
        Extension extension2 = new Extension(nombre2);
        Tamanio tamanio = new Tamanio(extension2);
        System.out.println(tamanio.prettyPrint());
    }


}
