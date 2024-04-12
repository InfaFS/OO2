package infa;
import java.util.*;
public class Mixta extends Topografia {
    private ArrayList<Topografia> partes;

    public Mixta(Topografia topografia_1,Topografia topografia_2, Topografia topografia_3, Topografia topografia_4 ) { //pasar 4 topografias
        this.partes= new ArrayList<Topografia>();
        this.partes.add(topografia_1);
        this.partes.add(topografia_2);
        this.partes.add(topografia_3);
        this.partes.add(topografia_4);
        
    }

    public int proporcionDeAgua(){
        return partes.stream().mapToInt(parte -> parte.proporcionDeAgua()).sum() / 4;
    }

    public int proporcionDeTierra(){
        return partes.stream().mapToInt(parte -> parte.proporcionDeTierra()).sum() / 4;
    }

    public boolean igual(Topografia topografia){
        return topografia.igualMixta(this);
    }

    public boolean igualAgua(){
        return false;
    }

    public boolean igualTierra(){
        return false;
    }

    public boolean igualMixta(Mixta otraTopografia){
       // if (otraTopografia.getPartes().size() != this.partes.size()){
         //   return false;
        //}
        //usar stream cuando sea lineal
        for (int i=0;i<4;i++){
            if (!this.partes.get(i).igual(otraTopografia.getPartes().get(i))){
                return false;
            }
        }
        return true;
       //return otraTopografia.getPartes().stream().allMatch(parte -> parte.igual(this.partes.get(otraTopografia.getPartes().indexOf(parte))));
    }

    public ArrayList<Topografia> getPartes(){
        return this.partes;
    }

    public boolean igualPantano(){
        return false;
    }
}
