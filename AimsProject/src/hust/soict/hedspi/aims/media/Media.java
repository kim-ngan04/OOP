package hust.soict.hedspi.aims.media;

import java.util.Objects;
import java.util.Comparator;

public abstract class Media implements Comparable<Media> {
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    
    private static int nbMedia = 0;
    private int id;
    private String title;
    private String category;
    private float cost;
    
    // Getter and setter methods
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public void play() {
        System.out.println("Playing media");
    }

    // Constructor with title only
    public Media(String title) {
        this.title = title;
        this.id = ++nbMedia;
        this.category = "Uncategorized"; // Default category
        this.cost = 0.0f; // Default cost
    }
    
    // Constructor with title and category
    public Media(String title, String category) {
        this.title = title;
        this.category = category;
        this.id = ++nbMedia;
        this.cost = 0.0f; // Default cost
    }
    
    // Constructor with title, category, and cost
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbMedia;
    }
    
    public boolean isMatch(String title) {
        return this.title != null && this.title.equalsIgnoreCase(title);
    }
    
    // toString method for displaying media information
    @Override
    public String toString() {
        return "ID: " + id + " - " + title + " - " + category + " - " + cost + "$";
    }

    // Overriding equals() method to compare Media objects based on title
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Same object reference
        if (obj == null || getClass() != obj.getClass()) return false;  // Null check and class check
        Media media = (Media) obj;  // Cast the object to Media type
        return title != null && title.equalsIgnoreCase(media.title);  // Compare titles
    }

    // Overriding hashCode() method for consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(title);  // Generate hashCode based on title
    }
    
    @Override
    public int compareTo(Media other) {
        int titleComparison = this.getTitle().compareTo(other.getTitle());
        if (titleComparison != 0) {
            return titleComparison;
        } else {
            return Double.compare(this.getCost(), other.getCost());
        }
    }
    
    
}
