package src;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
        System.out.println("DVD \"" + dvd.getTitle() + "\" has been added to the store.");
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("DVD \"" + dvd.getTitle() + "\" is not found in the store.");
        }
    }

    public void printStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Available DVDs in the Store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            DigitalVideoDisc dvd = itemsInStore.get(i);
            System.out.println((i + 1) + ". " + dvd);
        }
        System.out.println("***************************************************");
    }

    public void searchByTitle(String keyword) {
        boolean matchFound = false;
        System.out.println("Searching for DVDs with \"" + keyword + "\" in the title:");
        for (DigitalVideoDisc dvd : itemsInStore) {
            if (dvd.isMatch(keyword)) {
                System.out.println("Found: " + dvd);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No DVDs found with \"" + keyword + "\" in the title.");
        }
    }
}
