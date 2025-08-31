class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }
}

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player on");
    }

    public void off() {
        System.out.println("DVD Player off");
    }
}

class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie() {
        amplifier.on();
        dvdPlayer.on();
        System.out.println("Ready to watch the movie!");
    }

    public void endMovie() {
        amplifier.off();
        dvdPlayer.off();
        System.out.println("Movie ended.");
    }
}

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        HomeTheaterFacade facade = new HomeTheaterFacade(amp, dvd);

        facade.watchMovie();
        facade.endMovie();
    }
}
