package hust.soict.hedspi.aims.media;
import java.util.*;


public class DigitalVideoDisc extends Media {

    private String director;
    private int length;

    // Getters
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    // Method to check if the title contains the keyword (case-insensitive)
    public boolean isMatch(String keyword) {
        return this.getTitle().toLowerCase().contains(keyword.toLowerCase());
    }

    // Constructors
    public DigitalVideoDisc(String title) {
        super(title);
        this.director = "Unknown Director";  // Default value
        this.length = 0;  // Default value
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        this.director = "Unknown Director";  // Default value
        this.length = 0;  // Default value
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = 0;  // Default value
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    // Override the toString() method to display DVD details
    @Override
    public String toString() {
        return "DVD: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Director: " + (this.director.isEmpty() ? "Unknown Director" : this.director) +
                " - DVD length: " + (this.length > 0 ? this.length + " minutes" : "Not specified") +
                " - Cost: " + this.getCost() + "$";
    }
}