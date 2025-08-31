class PlayingState implements State {
    private MediaPlayer mediaPlayer;

    public PlayingState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Already playing. Enjoy the music!");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the media player...");
        mediaPlayer.setState(mediaPlayer.getPausedState());
    }

    @Override
    public void stop() {
        System.out.println("Stopping the media player...");
        mediaPlayer.setState(mediaPlayer.getStoppedState());
    }
}

class PausedState implements State {
    private MediaPlayer mediaPlayer;

    public PausedState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Resuming playback...");
        mediaPlayer.setState(mediaPlayer.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("Already paused.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the media player...");
        mediaPlayer.setState(mediaPlayer.getStoppedState());
    }
}

class StoppedState implements State {
    private MediaPlayer mediaPlayer;

    public StoppedState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        System.out.println("Starting playback...");
        mediaPlayer.setState(mediaPlayer.getPlayingState());
    }

    @Override
    public void pause() {
        System.out.println("Can't pause. The media is stopped. Please play first.");
    }

    @Override
    public void stop() {
        System.out.println("Already stopped.");
    }
}
