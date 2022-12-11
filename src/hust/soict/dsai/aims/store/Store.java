// Tran Thi Nhu Quynh - 20205122
package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void print() {
        if (itemsInStore.isEmpty()) {
            System.out.println("Empty store");
        } else {
            itemsInStore.forEach((item) -> System.out.println(item.toString()));
        }
    }
    // add media funcion
    public void addMedia(Media dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("Add successfully!");
        } else {
            System.out.println("Error");
        }
    }
    // remove media function
    public void removeMedia(Media dvd) {
        if (dvd != null) {
            itemsInStore.remove(dvd);
            System.out.println("Remove successfully!");
        } else {
            System.out.println("Error");
        }
    }
}
