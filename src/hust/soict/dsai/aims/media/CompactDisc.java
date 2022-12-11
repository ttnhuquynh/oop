// Tran Thi Nhu Quynh - 20205122
package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    // abstract class
    public CompactDisc() {}

    // constructor
    public CompactDisc(String director, int length, String title, String category, float cost, String artist,
            ArrayList<Track> tracks) {
        super(director, length, title, category, cost);
        this.artist = artist;
    }

    // getter
    public String getArtist() { return artist; }

    // add track function: add only track that don't exist in list 
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            return;
        }
        System.out.println("This track is already in list");
    }

    // remove track function: remove track that exist in list 
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            return;
        }
        System.out.println("This track is present in List");
    }

    // get length of this track
    public int getLength() {
        int sum = 0;
        for (int i = 0; i < tracks.size(); ++i) {
            sum += tracks.get(i).getLength();
        }
        return sum;
    }

    public void play() {
        for (int i = 0; i < tracks.size(); ++i) {
            tracks.get(i).play();
        }
    }

    // print into stdout
    public String toString() {
        return this.getId() + ".CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector()
                + " - " + this.getLength() + " - " + this.getArtist() + ": " + this.getCost() + " $";
    }
}
