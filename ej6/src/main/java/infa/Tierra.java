package infa;

public class Tierra extends Topografia{
    public int proporcionDeAgua(){
        return 0;
    }

    public int proporcionDeTierra(){
        return 100;
    }

    public boolean igual(Topografia topografia){
        return topografia.igualTierra();

    }

    public boolean igualAgua(){
        return false;

    }

    public boolean igualTierra(){
        return true;
    }

    public boolean igualMixta(Mixta otrMixta){
        return false;
    }

    public boolean igualPantano(){
        return false;
    }
    
}
