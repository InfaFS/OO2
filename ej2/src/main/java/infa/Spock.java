package infa;

public class Spock implements Jugada{

	public String contraPiedra() {
		return "gana";
	}
	public String contraPapel() {
		return "pierde";
	}
	public String contraTijera() {
		return "gana";
	}
	public String contraLagarto() {
		return "pierde";
	}
	public String contraSpock() {
		return "empate";
	}
}