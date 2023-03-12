import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;

    ArrayList<String> listeners = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> listeners) {
        int count = 0;
        for (String listener : listeners) {
            listener = listener.toLowerCase();
            if (!this.listeners.contains(listener)) {
                count++;
                this.listeners.add(listener);
            }
        }
        return count;
    }
}
