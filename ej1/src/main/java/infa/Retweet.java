package infa;

public class Retweet extends Posteo {
    
    private Posteo posteoOriginal;

    public Retweet(Posteo posteoOriginal){
        this.posteoOriginal = posteoOriginal;
    }

    public Posteo getOrigen(){
        return this.posteoOriginal;
    }
}
