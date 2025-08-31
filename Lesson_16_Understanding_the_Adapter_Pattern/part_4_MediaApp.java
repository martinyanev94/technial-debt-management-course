class MediaApp {
    public void playMedia(VideoPlayer player, String fileName) {
        player.playVideo(fileName);
    }
    
    public static void main(String[] args) {
        MediaApp app = new MediaApp();
        
        SimpleAudioPlayer audioPlayer = new SimpleAudioPlayer();
        AudioPlayerAdapter audioAdapter = new AudioPlayerAdapter(audioPlayer);
        
        app.playMedia(audioAdapter, "song.mp3"); // Adapted audio playback as a video.
    }
}
