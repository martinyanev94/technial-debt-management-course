public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.play(); // Starts playback
        mediaPlayer.pause(); // Pauses playback
        mediaPlayer.play(); // Resumes playback
        mediaPlayer.stop(); // Stops playback
        mediaPlayer.pause(); // Trying to pause the stopped media player
    }
}
