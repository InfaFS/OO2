package infa;

public class Personaje {
    private Armas arma;
    private Armadura armadura;
    private Habilidades habilidades;
    private int vida;

    public Personaje (Armas arma, Armadura armadura, Habilidades habilidades){
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
        this.vida=100;
    }

    public void atacar(Personaje enemigo){
        if (this.vida > 0) {
            enemigo.recibirAtaque(arma);
        }
        else{
            System.out.println("El personaje esta muerto");
        }
        
    }

    public void recibirAtaque(Armas arma){
        if (this.vida > 0) {
            vida-=this.armadura.proteger(arma);    
        }
        else{
            System.out.println("El personaje esta muerto");
        }
    }   

    public void usarHabilidadEspecial(){
        this.habilidades.usarHabilidad();
    }

    public int consultarVida(){
        if (this.vida > 0) {
            return this.vida;
        }
        else{
            System.out.println("El personaje esta muerto");
            return 0;
        }
    }
}
