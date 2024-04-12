package infa;
import java.util.ArrayList;

public class Usuario {
    private ArrayList<Posteo> posts;
    private String screenName;

    public Usuario (String screenName){
        this.screenName= screenName;
        this.posts= new ArrayList<Posteo>();
    }
    //obtiene lista de tweets
    public ArrayList<Posteo> getPosteos(){
        return this.posts;
    }
    //publico Retweet
    public Posteo publicarRetweet(Posteo post){
        
        Posteo Retweet = new Retweet(post);
        this.posts.add(Retweet);
        return Retweet;

    }
    //publico tweet
    public void publicartweet(String texto){
        if (verificarLongitud(texto)){
            Posteo tweet = new Tweet(texto);
            this.posts.add(tweet);
        }
    }

    //fines de prueba
    public void publicartweet_2(Tweet post){
        if (verificarLongitud(post.getTexto())){
            this.posts.add(post);
        }
    }


    //retorno el screenName
    public String getScreenName(){
        return this.screenName;
    }

    //vacio la lista de tweets
    public void eliminarPosteos(){
        this.posts.clear();
    }
    
    //verifico que el string este en el rango
    private boolean verificarLongitud(String texto) {
		return (texto.length() >= 1) && (texto.length() <= 280);
	}

    public void eliminarPosteo(Posteo p){
        this.posts.remove(p);
    }
}
