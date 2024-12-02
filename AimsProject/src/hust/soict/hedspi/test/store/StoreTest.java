package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle", "Adventure", "John Doe", 120, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Animation", "Jane Smith", 90, 14.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Mission Impossible", "Action", "Tom Cruise", 110, 24.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Sci-Fi", "James Cameron", 150, 29.99f);

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        store.printStore();
        
        store.removeDVD(dvd2);

        store.printStore();

        store.removeDVD(dvd4);

        store.addDVD(dvd4);

        store.printStore();
        
        store.searchByTitle("Mission");

        store.searchByTitle("Star Wars");
    }
}
