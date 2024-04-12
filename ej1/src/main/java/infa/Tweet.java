package infa;

public class Tweet extends Posteo{
	private String texto;

	public Tweet(String texto) {
		this.texto = texto;
	}

	public Posteo getOrigen(){
		return null;
	}

	public String getTexto() {
		return this.texto;
	}
	
}