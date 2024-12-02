package hust.soict.hedspi.aims.media;

public class Disc extends Media {

    private String director;
    private int length;

    // Getter and setter for director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // Getter and setter for length
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Constructor with only title
    public Disc(String title) {
        super(title, "Unknown", 0.0f);  // Set default category and cost
    }

    // Constructor with title and category
    public Disc(String title, String category) {
        super(title, category, 0.0f);  // Set default cost
    }

    // Constructor with title, category, and cost
    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    // Constructor with title, category, director, and cost
    public Disc(String title, String category, String director, float cost) {
        super(title, category, cost);
        this.director = director;
    }

    // Constructor with all fields
    public Disc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    // Override toString() to display Disc details
    @Override
    public String toString() {
        return "Disc: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Director: " + this.director +
                " - Length: " + this.length + " minutes" +
                " - Cost: " + this.getCost() + "$";
    }
}
