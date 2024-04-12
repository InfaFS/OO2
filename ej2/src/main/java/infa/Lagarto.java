package infa;

public class Lagarto implements Jugada{

	public String contraPiedra() {
		return "pierde";
	}
	public String contraPapel() {
		return "gana";
	}
	public String contraTijera() {
		return "pierde";
	}
	public String contraLagarto() {
		return "empate";
	}
	public String contraSpock() {
		return "gana";
	}
}
