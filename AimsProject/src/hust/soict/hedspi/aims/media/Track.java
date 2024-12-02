package hust.soict.hedspi.aims.media;

public class Track {
    private String title;
    private int length;  

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Override toString() to display track details
    @Override
    public String toString() {
        return "Track: " + title + " - " + length + " minutes";
    }
}
