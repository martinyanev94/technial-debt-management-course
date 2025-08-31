class SimpleAudioPlayer implements AudioPlayer {
    public void playAudio(String fileName) {
        System.out.println("Playing audio: " + fileName);
    }
}
class AudioPlayerAdapter implements VideoPlayer {
    private AudioPlayer audioPlayer;

    public AudioPlayerAdapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public void playVideo(String fileName) {
        System.out.println("Adapting audio file to video format.");
        audioPlayer.playAudio(fileName);
    }
}
