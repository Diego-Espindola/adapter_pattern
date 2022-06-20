import com.adapter.AudioPlayer;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("vlc", "Darandandan.vlc");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("mp3", "musica para os meus ouvidos.mp3");
        audioPlayer.play("gsm", "mind me.gsm");

    }
}
