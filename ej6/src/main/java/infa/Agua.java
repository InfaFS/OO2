package infa;

public class Agua extends Topografia {
    public int proporcionDeAgua(){
        return 100;
    }

    public int proporcionDeTierra(){
        return 0;
    }

    public boolean igual(Topografia topografia){
        return topografia.igualAgua();
    }

    public boolean igualAgua(){
        return true;
    }

    public boolean igualTierra(){
        return false;
    }

    public boolean igualMixta(Mixta otraMixta){
        return false;
    }

    public boolean igualPantano(){
        return false;
    }
}
