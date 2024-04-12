package infa;

public class Pantano extends Topografia {

    public int proporcionDeAgua () {
        return 70;
    }

    public int proporcionDeTierra () {
        return 30;
    }

    public boolean igualAgua(){
        return false;
    }

    public boolean igualTierra(){
        return false;
    }
    
    public boolean igualMixta(Mixta otraTopo){
        return false;
    }

    public boolean igual(Topografia topografia){
        return topografia.igualPantano();
    }

    public boolean igualPantano(){
        return true;
    }

}
