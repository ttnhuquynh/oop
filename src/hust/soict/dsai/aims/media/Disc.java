// Tran Thi Nhu Quynh - 20205122
package hust.soict.dsai.aims.media;

public class Disc extends Media {
	// Disc has inheritance attributes from Media and its attributes
    private String director;
    private int length;

    // abstract class
    public Disc() { }

    // Constructor
    public Disc(String director, int length, String title, String category, float cost) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    // getters and setters
    public String getDirector() {return this.director;}
    public void setDirector(String director) {this.director = director;}
    public int getLength() {return this.length;}
    public void setLength(int length) { this.length = length;}

}
