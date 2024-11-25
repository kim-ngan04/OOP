package src;
import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            System.out.println("The disc has been added.");
            if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full.");
            }
        } else {
            System.out.println("Cannot add more items. The cart is full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("The disc is not found in the cart.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (itemsOrdered.size() + dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
        } else {
            for (DigitalVideoDisc dvd : dvdList) {
                itemsOrdered.add(dvd);
                System.out.println(dvd.getTitle() + " has been added!");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(new DigitalVideoDisc[]{dvd1, dvd2});
    }

    public float totalCost() {
        float total = 0.0f;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            DigitalVideoDisc dvd = itemsOrdered.get(i);
            System.out.println((i + 1) + ". " + dvd);
            totalCost += dvd.getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.getId() == id) {
                System.out.println("Found DVD: " + dvd);
                return;
            }
        }
        System.out.println("No DVD found with ID: " + id);
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd.isMatch(title)) {
                System.out.println("Found DVD: " + dvd);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }
}