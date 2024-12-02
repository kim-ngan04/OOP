package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    // Thêm một Media vào kho
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println(media.getTitle() + " has been added to the store.");
    }

    // Xóa một Media khỏi kho
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(media.getTitle() + " is not found in the store.");
        }
    }

    // Hiển thị danh sách các Media trong kho
    public void printStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Available Media in the Store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            Media media = itemsInStore.get(i);
            System.out.println((i + 1) + ". " + media.toString());
        }
        System.out.println("***************************************************");
    }

    // Tìm kiếm Media theo tiêu đề
    public void searchByTitle(String keyword) {
        boolean matchFound = false;
        System.out.println("Searching for Media with \"" + keyword + "\" in the title:");
        for (Media media : itemsInStore) {
            if (media.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found: " + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No Media found with \"" + keyword + "\" in the title.");
        }
    }
}
