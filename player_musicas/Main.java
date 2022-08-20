import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TrackReader trackreader = new TrackReader();
        trackreader.readTracks("C:\\GitHub\\Java-OO\\player_musicas\\audio", ".mp3");
        MusicOrganizer organizador = new MusicOrganizer();
        organizador.listAllTracks();
        organizador.playTrack(1);
    }
}
