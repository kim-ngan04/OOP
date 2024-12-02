package hust.soict.hedspi.aims.media;

import java.util.*;

public class Book extends Media {

    private List<String> authors;

    // Constructor
    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }

    public Book(String title, String category) {
        super(title, category);
        this.authors = new ArrayList<>();
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
        this.authors = new ArrayList<>();
    }
    
    public Book(String title, String category, float cost, String author) {
        super(title, category, cost);
        this.authors = new ArrayList<>();
        this.authors.add(author);
    }

    // Getter and Setter for authors
    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    // Method to add an author to the book
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author '" + authorName + "' added successfully!");
        } else {
            System.out.println("The author '" + authorName + "' is already in the list.");
        }
    }

    // Method to remove an author from the book
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            System.out.println("Author '" + authorName + "' removed successfully!");
        } else {
            System.out.println("No author named '" + authorName + "' found to remove.");
        }
    }

    // Override the toString method to display book details
    @Override
    public String toString() {
        return "Book [ID: " + getId() + ", Title: " + getTitle() + ", Category: " + getCategory() + ", Cost: $" + getCost() +
               ", Authors: " + String.join(", ", authors) + "]";
    }
}
