package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {

    private String artist;
    private ArrayList<Track> tracks;  // List of tracks on the compact disc

    // Constructor
    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, "Unknown Director", 0, cost);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    // Getter method for artist
    public String getArtist() {
        return artist;
    }

    // Method to add a track to the CD
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added successfully!");
        } else {
            System.out.println("This track is already in the list.");
        }
    }

    // Method to remove a track from the CD
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed successfully!");
        } else {
            System.out.println("This track is not in the list.");
        }
    }

    // Method to get the total length of the CD (sum of all track lengths)
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    // Override toString() to display CD details
    @Override
    public String toString() {
        return "CompactDisc: " + this.getTitle() +
                " - Artist: " + this.artist +
                " - Category: " + this.getCategory() +
                " - Total Length: " + this.getLength() + " minutes" +
                " - Cost: " + this.getCost() + "$";
    }
}
