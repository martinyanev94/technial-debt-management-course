class MediaPlayer {
    private State playingState;
    private State pausedState;
    private State stoppedState;
    private State currentState;

    public MediaPlayer() {
        playingState = new PlayingState(this);
        pausedState = new PausedState(this);
        stoppedState = new StoppedState(this);
        currentState = stoppedState; // Initially, the media player is stopped
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getPlayingState() {
        return playingState;
    }

    public State getPausedState() {
        return pausedState;
    }

    public State getStoppedState() {
        return stoppedState;
    }

    public void play() {
        currentState.play();
    }

    public void pause() {
        currentState.pause();
    }

    public void stop() {
        currentState.stop();
    }
}
