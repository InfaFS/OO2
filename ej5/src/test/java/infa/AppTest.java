package infa;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void audioTest()
    {
        Media audio = new Audio();
        assertEquals("Reproduciendo... Training Season - Dua Lipa", audio.play());
    }

    @Test
    public void VideoFileTest()
    {
        Media videoFile = new VideoFile();
        assertEquals("Reproduciendo... Heathers -The musical- ", videoFile.play());
    }

    @Test
    public void VideoStreamTest()
    {
        Media videoStream = new VideoStreamAdapter();
        assertEquals("Reproduciendo ElRubiusOMG", videoStream.play());
    }
}
