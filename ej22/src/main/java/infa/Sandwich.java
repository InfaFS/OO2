package infa;

import infa.Aderezo.Aderezo;
import infa.Adicional.Adicional;
import infa.Pan.Pan;
import infa.Principal.Principal;

public class Sandwich {

    private Pan pan;
    private Aderezo aderezo;
    private Principal principal;
    private Adicional adicional;
    
    public void setPan(Pan pan){
        this.pan=pan;
    }

    public void setAderezo(Aderezo aderezo){
        this.aderezo=aderezo;
    }

    public void setPrincipal(Principal principal){
        this.principal=principal;
    }

    public void setAdicional(Adicional adicional){
        this.adicional=adicional;
    }


    public int getValorSandwich() {
        return (this.pan.getValor() + this.aderezo.getValor() + this.principal.getValor() + this.adicional.getValor());
    }

    public String getListado(){
        return this.pan.getTipo() + " " + this.aderezo.getTipo() + " " + this.principal.getTipo() + " " + this.adicional.getTipo();
    }
}
