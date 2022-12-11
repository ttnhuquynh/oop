
// Tran Thi Nhu Quynh - 20205122
package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);
    
   // add media funcion: can't add of cart if full
    public void addMedia(Media input) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("Full");
            return;
        }
        itemsOrdered.add(input);
    }

    // remove media function: can't remove if this media don't exist in cart
    public void removeMedia(Media input) {
        if (itemsOrdered.contains(input)) {
            itemsOrdered.remove(input);
            return;
        }
        System.out.println("Not found");
    }

    // total cost of this cart function
    public float totalCost() {
        float ans = 0.0f;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            ans += itemsOrdered.get(i).getCost();
        }
        return ans;
    }

    public void print() {
        float total = 0;
        System.out.println("***********************CART***********************");
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            System.out.println(itemsOrdered.get(i).toString());
            total += itemsOrdered.get(i).getCost();
        }
        System.out.println("Total cost: " + total);
        System.out.println("***************************************************");
    }
    
    // search media by id 
    public Media searchById(int id) {
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            if (itemsOrdered.get(i).getId() == id) {
                return itemsOrdered.get(i);
            }
        }
        return null;
    }

    // search meida by title
    public ArrayList<DigitalVideoDisc> seachByTitle(String title) {
        ArrayList<DigitalVideoDisc> ans = new ArrayList<DigitalVideoDisc>();
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            if (itemsOrdered.get(i) instanceof DigitalVideoDisc) {
                DigitalVideoDisc curr = (DigitalVideoDisc) itemsOrdered.get(i);
                if (curr.isMatch(title))
                    ans.add(curr);
            }
        }
        if (ans.isEmpty()) {
            return null;
        }
        return ans;
    }

    // sort medias by tile
    public ArrayList<Media> sortByTitle(ArrayList<Media> list) {
        Collections.sort(list, Media.COMPARE_BY_COST_TITLE);
        return list;
    }
    
    // sort medias by cost
    public ArrayList<Media> sortByCost(ArrayList<Media> list) {
        Collections.sort(list, Media.COMPARE_BY_TITLE_COST);
        return list;
    }

}
