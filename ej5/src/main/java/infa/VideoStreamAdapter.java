package infa;

public class VideoStreamAdapter extends Media {
    private VideoStream video;

    public VideoStreamAdapter(){
       this.video = new VideoStream();
    }

    public String play(){
        return this.video.reproduce();
    }
}
