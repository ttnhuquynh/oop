// Tran Thi Nhu Quynh - 20205122
package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
    
	// abstract class
	public Book() {}
	 
	// Constructor 
	public Book(String title, String category, float cost) {
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
	}
 
	// add author function: add only author that don't exist in list 
	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
			return;
		}
		System.out.println(authorName + " is already in Array");
	}

	// remove author function: remove author that exist in list 
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			return;
		}
		System.out.println(authorName + " is present in Array");
	}

	public String toString() {
		return this.getId() + ".Book - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + " $";
	}

}
