package infa;

public class Retweet implements Posteo{
	private Posteo origen;
	
	public Retweet(Posteo origen) {
		this.origen = origen;
	}
	
	public Posteo getOrigen() {
		return this.origen;
	}
}