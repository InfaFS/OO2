package infa;

public class Piedra implements Jugada {
    
    public String contraPiedra() {
		return "empate";
	}
	public String contraPapel() {
		return "pierde";
	}
	public String contraTijera() {
		return "gana";
	}
	public String contraLagarto() {
		return "gana";
	}
	public String contraSpock() {
		return "pierde";
	}
}
