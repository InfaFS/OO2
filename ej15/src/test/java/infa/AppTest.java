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
        FileManager fileManager = new FileManager();
        Nombre nombre = new Nombre(fileManager);
        Extension extension = new Extension(nombre);
        fileManager.addArchivo(extension);
        assertEquals("Nombre - Extension - ", fileManager.prettyPrintAll());
        FechaCreacion fechaCreacion = new FechaCreacion(extension);
        fileManager.addArchivo(fechaCreacion);
        assertEquals("Nombre - Extension - FechaCreacion - ", fileManager.prettyPrintAll());
        Permisos permisos = new Permisos(fileManager);
        Nombre nombre_2 = new Nombre(permisos);
        Extension extension2 = new Extension(nombre_2);
        Tamanio tamanio = new Tamanio(extension2);
        fileManager.addArchivo(tamanio);
        assertEquals("Permisos - Nombre - Extension - Tamanio - ", tamanio.prettyPrint());

    }


}
