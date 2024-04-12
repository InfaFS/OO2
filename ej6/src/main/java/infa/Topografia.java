package infa;

public abstract class Topografia {

    public abstract int proporcionDeAgua();

    public abstract int proporcionDeTierra();

    public abstract boolean igual(Topografia topografia);

    public abstract boolean igualAgua();

    public abstract boolean igualTierra();

    public abstract boolean igualPantano();

    public abstract boolean igualMixta(Mixta otraTopo);

  
}
