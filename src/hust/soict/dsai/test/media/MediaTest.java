// Tran Thi Nhu Quynh - 20205122
package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> media = new ArrayList<>();

        // create cd, dvd, book
        Track track = new Track("Aladin", 12);
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(track);
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "TTNQuynh", 87, 19.95f);
        CompactDisc cd = new CompactDisc("Quynhttn", 2, "Star wall", "Science Fiction", 1.2f, "Quynhttn", tracks);
        Book book = new Book("The Lion King", "Animation", 1.2f);

        media.add(dvd);
        media.add(cd);
        media.add(book);

        for (Media m : media) {
            System.out.println(m.toString());
        }
    }
}
