package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {
        Cart anOrder = new Cart();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd3);
        
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
        
        anOrder.removeMedia(dvd2);
        System.out.println("Removed: " + dvd2.getTitle());

        System.out.println("Total Cost after removal is: ");
        System.out.println(anOrder.totalCost());
    }
}
