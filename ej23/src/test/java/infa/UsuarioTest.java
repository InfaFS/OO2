package infa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class UsuarioTest {
	
	Usuario user;
	String textoValido;
	String textoVacio;
	String textoLargo;
	Tweet tweetOriginal;

	@BeforeEach
	void setUp() throws Exception {
		user = new Usuario ("Pepito");
		textoValido = "123";
		textoVacio= "";
		textoLargo="ohr6eST8gidyLPJL6ydqKoaUpPYGg8bvXk1X4DVo2e1kSo8fAjBZlMTqvwsPCEE5hJpO5hgzbE6kWmoKpxLYSXl2VmCKyzQFM6axJ1FS7go3BWvtTVQkzd45UphkXIztS6VLFmIs2kTUkgkxBDUuh1CwnnRK8PNnLmQbGrvUhVGHiK4V6eCkYUoCNUtKAwUt01sX4ZI0kuVDJscWbgeuETRWK1NqHDNsvqsAvGij5qjqH0J4gXVYf6VmmueGSpIWeWkP6WUAtqPglqXVC5AsTrKtQ";
		tweetOriginal = new Tweet (textoValido);
	}

	@Test
	void testRealizarTweet() {
		user.publicartweet(textoVacio);
		assertEquals(0,this.user.getPosteos().size());
		user.publicartweet(textoLargo);
		assertEquals(0,this.user.getPosteos().size());
		user.publicartweet(textoValido);
		assertEquals(1,this.user.getPosteos().size());
	}
	@Test
	void testRealizarReTweet() {
		user.publicarRetweet(tweetOriginal);
		assertEquals(1,this.user.getPosteos().size());	
		user.publicarRetweet(tweetOriginal);
		assertEquals(0,this.user.getPosteos().size());
		user.publicarRetweet(tweetOriginal);
		assertEquals(1,this.user.getPosteos().size());
	}

}