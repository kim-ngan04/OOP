package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.Media;
import java.util.*;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    public int qtyOrdered = 0;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

    // Add media to the cart
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The media has been added: " + media.getTitle());
            if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is now full.");
            }
        } else {
            System.out.println("Cannot add more items. The cart is full.");
        }
    }

    // Remove media from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed: " + media.getTitle());
        } else {
            System.out.println("The media is not found in the cart.");
        }
    }
    
    public void empty() {
        if (itemsOrdered.size() == 0) {
            System.out.println("Nothing to remove!");
        } else {
            qtyOrdered = 0;
            itemsOrdered.clear();
            System.out.println("Order created.");
            System.out.println("Now your current cart will be empty!");
            System.out.println();
        }
    }

    // Calculate the total cost of all items in the cart
    public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    // Print all items in the cart
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            System.out.println((i + 1) + ". " + media);
            totalCost += media.getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    // Search for media by ID
    public void searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found Media: " + media);
                return;
            }
        }
        System.out.println("No media found with ID: " + id);
    }

    // Search for media by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                System.out.println("Found Media: " + media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with title: " + title);
        }
    }
    
 // Search to remove
    public Media searchToRemove(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}
    
 // Sort media in cart
    public void sortMediaByTitle() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
    public void sortMediaByCost() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
    
    public String placeOrder() {
    	if(itemsOrdered.size()==0) {
    		return "Your cart is empty!";
    	} else {
    		qtyOrdered = 0;
    		itemsOrdered.clear();
    		return "Order created!\n" + "Now your cart will be empty!";
    	}
    }
}
