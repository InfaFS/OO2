package infa;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class BibliotecaTest
{
    Biblioteca biblioteca;
    public static void main(String[] args) {
        System.out.println("Comenzando test");

  //  Biblioteca biblioteca = new Biblioteca();
  //  biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
  //  biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
    
   // System.out.println(biblioteca.exportarSocios());
    }

    @BeforeEach
	void setUp() throws Exception {
        biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}   

    @Test
    public void testSocio()
    {
        Socio socio3 = new Socio("Juliana Tiseira", "macaco03@gmail.com" ,"03362/4" );
        assertEquals("Juliana Tiseira", socio3.getNombre());
        assertEquals("macaco03@gmail.com", socio3.getEmail());
        assertEquals("03362/4", socio3.getLegajo());

        
    }

    @Test
    public void testAdaptadorJSONsimple() 
    {
        String textConVorhees = biblioteca.exportarSocios();
        biblioteca.setExporter( new JSONSimpleAdapter() );
        assertEquals(textConVorhees,biblioteca.exportarSocios());
    }

    @Test
    public void testAdaptadorJackson() 
    {
        String textConVorhees = biblioteca.exportarSocios();
        biblioteca.setExporter( new JacksonAdapter() );
        assertEquals(textConVorhees,biblioteca.exportarSocios());
    }
}
