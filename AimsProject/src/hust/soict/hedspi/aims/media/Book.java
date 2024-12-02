package hust.soict.hedspi.aims.media;
import java.util.*;

public class Book {
    // Private fields
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    // Constructor
    public Book(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = new ArrayList<>();
    }

    // Getter and Setter methods for id, title, category, and cost
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

    // Add an author to the ArrayList (if not already present)
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Author " + authorName + " is already in the list.");
        }
    }

    // Remove an author from the ArrayList (if present)
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author " + authorName + " is not in the list.");
        }
    }

    // Get the list of authors (public method for reading the authors list)
    public ArrayList<String> getAuthors() {
        return authors;
    }
}

