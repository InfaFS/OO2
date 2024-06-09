package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//cuando borro un elemento y estoy siguiendo los twts se pone en null en el recorrido lambda
//preguntar esa parte
class TwitterTest {
	
	Twitter twitter;
	

	Usuario usuarioAEliminar;
	Usuario user2;
	Posteo tweetOriginal;
	Posteo tweetOriginal2;
	Tweet tweet1;
	Tweet tweet2;
	Posteo tweet3;

	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		usuarioAEliminar = new Usuario ("Amy Lee");
		user2 = new Usuario("Pepe argento");
		tweet1 = new Tweet("Tweet 1");
		tweet2= new Tweet("Tweet 2");
		tweetOriginal = new Tweet ("Este es un tweet Original");
		tweetOriginal2= new Tweet ("Este es un tweet Original 2"); 


		
		usuarioAEliminar.publicartweet_2(tweet2);
		usuarioAEliminar.publicartweet("Tweet 1");
		usuarioAEliminar.publicarRetweet(tweetOriginal);

		
		user2.publicartweet("Jose");
		user2.publicarRetweet(tweet1);
		user2.publicarRetweet(tweet2);
		
		
	    //No funciona con un rt de otro rt
		//fumciona solo cuando elimino uno en un momento especifico
		
		//Posteo rt =user2.publicarRetweet(tweet2);
		//user2.publicarRetweet(rt);
	
		twitter.agregarUsuario(user2);
		twitter.agregarUsuario(usuarioAEliminar);
	}

	@Test
	void testCargarUsuario() {
		//twitter.agregarUsuario("Lana Del Rey");
	//	twitter.agregarUsuario("Taylor Swift");
	//	twitter.agregarUsuario("Taylor Swift");
	//	twitter.agregarUsuario("Lana Del Rey");
		assertEquals(2,twitter.getUsuarios().size());
		
	}
	
	@Test
	void testEliminarUsuario_1Tw() {
		assertEquals(3,usuarioAEliminar.getPosteos().size());
		assertEquals(3, user2.getPosteos().size());
		twitter.eliminarUsuario(usuarioAEliminar);
		assertEquals(2, user2.getPosteos().size());
		assertEquals(0,usuarioAEliminar.getPosteos().size());
		
		
	}


}