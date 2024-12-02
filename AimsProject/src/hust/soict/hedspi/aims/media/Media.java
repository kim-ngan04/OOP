package hust.soict.hedspi.aims.media;

public abstract class Media {
    
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
    
    // toString method for displaying media information
    @Override
    public String toString() {
        return "ID: " + id + " - " + title + " - " + category + " - " + cost + "$";
    }
}
