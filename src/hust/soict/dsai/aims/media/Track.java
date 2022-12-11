// Tran Thi Nhu Quynh - 20205122
package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    // abstract class
    public Track() {}

    // constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // getter and setter
    public int getLength() { return length;}
    public String getTitle() {return title;}

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    // Tran Thi Nhu Quynh - 20205122
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            return this.getTitle().equals(((Track) obj).getTitle()) && this.getLength() == ((Track) obj).getLength();
        }
        return false;
    }
}
