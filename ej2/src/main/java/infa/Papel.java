package infa;



public class Papel implements Jugada {
    
	public String contraPiedra() {
		return "gana";
	}
	public String contraPapel() {
		return "empate";
	}
	public String contraTijera() {
		return "pierde";
	}
	public String contraLagarto() {
		return "pierde";
	}
	public String contraSpock() {
		return "gana";
	}

    
}
