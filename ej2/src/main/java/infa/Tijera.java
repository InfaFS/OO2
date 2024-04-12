package infa;

public class Tijera implements Jugada {

    public String contraPiedra() {
		return "pierde";
	}
	public String contraPapel() {
		return "gana";
	}
	public String contraTijera() {
		return "empate";
	}
	public String contraLagarto() {
		return "gana";
	}
	public String contraSpock() {
		return "pierde";
	}
    
}
