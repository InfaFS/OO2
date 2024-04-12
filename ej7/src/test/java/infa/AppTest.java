package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    public void testFileSystem_tamanioTotalOcupado(){
        FileSystem fs = new FileSystem();
        File a1 = new File("a1","01/01/2021",100);
        File a2 = new File("a2","01/02/2021",100);
        File a3 = new File("a3","01/03/2021",100);
        File a4 = new File("a4","01/04/2021",100);
        File a5 = new File("a5","01/05/2021",100);
        File a6 = new File("a6","01/06/2021",100);
        File a7 = new File("a7","01/07/2021",100);
        File a8 = new File("a8","01/08/2021",100);

        Directorio d1 = new Directorio("d1","01/01/2021");
        d1.addFileDirectory(a4);
        d1.addFileDirectory(a5);
        d1.addFileDirectory(a6);
        
        Directorio d2 = new Directorio("d2","01/01/2021");
        d2.addFileDirectory(a7);
        d2.addFileDirectory(a8);

        d1.addFileDirectory(d2); //agrego a d1 un directorio para mostrar la recursion

        fs.addFile(a1);
        fs.addFile(d1);
        fs.addFile(a2);
        fs.addFile(a3);
        assertEquals(864,fs.tamanoTotalOcupado());


    
    
    }
    
    @Test
    public void testFileSystem_buscar(){
        FileSystem fs = new FileSystem();
        File a1 = new File("a1","01/01/2021",100);
        File a2 = new File("a2","01/02/2021",100);
        File a3 = new File("a3","01/03/2021",100);
        File a4 = new File("a4","01/04/2021",100);
        File a5 = new File("a5","01/05/2021",100);
        File a6 = new File("a6","01/06/2021",100);
        File a7 = new File("a7","01/07/2021",100);
        File a8 = new File("a8","01/08/2021",100);

        Directorio d1 = new Directorio("d1","01/01/2021");
        d1.addFileDirectory(a4);
        d1.addFileDirectory(a5);
        d1.addFileDirectory(a6);
        
        Directorio d2 = new Directorio("d2","01/01/2021");
        d2.addFileDirectory(a7);
        d2.addFileDirectory(a8);

        d1.addFileDirectory(d2); //agrego a d1 un directorio para mostrar la recursion

        fs.addFile(a1);
        fs.addFile(d1);
        fs.addFile(a2);
        fs.addFile(a3);

        assertEquals(true,fs.buscar("a1")); //busco archivo
        assertEquals(true,fs.buscar("d1")); //busco directorio
        assertEquals(true,fs.buscar("d2")); //busco directorio dentro de directorio
        assertEquals(true,fs.buscar("a8")); //busco archivo dentro de directorio lejano
        assertEquals(false,fs.buscar("a27")); //busco archivo que no existe
        
    }

    @Test
    public void testFileSystem_archivoMasGrande(){
        FileSystem fs = new FileSystem();
        File a1 = new File("a1","01/01/2021",100);
        File a2 = new File("a2","01/02/2021",200);
        File a3 = new File("a3","01/03/2021",140);
        File a4 = new File("a4","01/04/2021",300);
        File a5 = new File("a5","01/05/2021",220);
        File a6 = new File("a6","01/06/2021",210);
        File a7 = new File("a7","01/07/2021",700);
        File a8 = new File("a8","01/08/2021",1000);

        Directorio d1 = new Directorio("d1","01/01/2021");
        d1.addFileDirectory(a4);
        d1.addFileDirectory(a5);
        d1.addFileDirectory(a6);
        
        Directorio d2 = new Directorio("d2","01/01/2021");
        d2.addFileDirectory(a7);
        d2.addFileDirectory(a8);

        d1.addFileDirectory(d2); //agrego a d1 un directorio para mostrar la recursion

        fs.addFile(a1);
        fs.addFile(d1);
        fs.addFile(a2);
        fs.addFile(a3);

        assertEquals(1000, fs.archivoMasGrande());
    }

    @Test
    public void testFileSystem_archivoMasReciente(){
        FileSystem fs = new FileSystem();
        File a1 = new File("a1","01/01/2021",100);
        File a2 = new File("a2","01/02/2021",200);
        File a3 = new File("a3","01/03/2021",140);
        File a4 = new File("a4","01/04/2021",300);
        File a5 = new File("a5","01/05/2021",220);
        File a6 = new File("a6","01/15/2021",210);
        File a7 = new File("a7","01/07/2021",700);
        File a8 = new File("a8","01/10/2021",1000);
        File a9 = new File("a9","01/09/2021",1000);

        Directorio d1 = new Directorio("d1","01/01/2021");
        d1.addFileDirectory(a4);
        d1.addFileDirectory(a5);
        d1.addFileDirectory(a6);
        
        Directorio d2 = new Directorio("d2","01/01/2021");
        d2.addFileDirectory(a7);
        d2.addFileDirectory(a8);
        d2.addFileDirectory(a9);

        d1.addFileDirectory(d2); //agrego a d1 un directorio para mostrar la recursion

        fs.addFile(a1);
        fs.addFile(d1);
        fs.addFile(a2);
        fs.addFile(a3);

        assertEquals(a6, fs.archivoMasNuevo());
    }

    @Test
    public void testFileSystem_buscarTodos(){
        FileSystem fs = new FileSystem();
        File a1 = new File("a1","01/01/2021",100);
        File a2 = new File("a2","01/02/2021",200);
        File a3 = new File("a3","01/03/2021",140);
        File a4 = new File("a4","01/04/2021",300);
        File a5 = new File("a5","01/05/2021",220);
        File a6 = new File("a6","01/15/2021",210);
        File a7 = new File("a7","01/07/2021",700);
        File a8 = new File("a8","01/10/2021",1000);
        File a9 = new File("a4","01/09/2021",1000);

        Directorio d1 = new Directorio("d1","01/01/2021");
        d1.addFileDirectory(a4);
        d1.addFileDirectory(a5);
        d1.addFileDirectory(a6);
        
        Directorio d2 = new Directorio("d2","01/01/2021");
        d2.addFileDirectory(a7);
        d2.addFileDirectory(a8);
        d2.addFileDirectory(a9);

        d1.addFileDirectory(d2); //agrego a d1 un directorio para mostrar la recursion

        fs.addFile(a1);
        fs.addFile(d1);
        fs.addFile(a2);
        fs.addFile(a3);

        ArrayList<SystemFile> listaDeseada = new ArrayList<SystemFile>();
        listaDeseada.add(a4);
        listaDeseada.add(a9);
        assertEquals(listaDeseada, fs.buscarTodos("a4"));
     //   fs.buscarTodos("a4").stream().map(f -> f.getNombre()).forEach(System.out::println); solo para corroborar por pantalla
    }

    @Test
    public void testFileSystem_listadoDeContenido(){
        FileSystem fs = new FileSystem();
        Directorio A = new Directorio("A","01/01/2021");
        Directorio A_1 = new Directorio("A.1", null);
        Directorio A_1_1 = new Directorio("A.1.1", null);
        Directorio A_1_2 = new Directorio("A.1.2", null);
        Directorio A_2 = new Directorio("A.2", null);
        Directorio B = new Directorio("B", null);

        A.addFileDirectory(A_1);
        A_1.addFileDirectory(A_1_1);
        A_1.addFileDirectory(A_1_2);
        A.addFileDirectory(A_2);
        fs.addFile(A);
        fs.addFile(B);
        
        System.out.println(fs.listadoDeContenido());

     //   fs.buscarTodos("a4").stream().map(f -> f.getNombre()).forEach(System.out::println); solo para corroborar por pantalla
    }

    //queda por hacer el de arriba
}
 

 