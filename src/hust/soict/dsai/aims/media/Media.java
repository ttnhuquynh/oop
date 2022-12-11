// Tran Thi Nhu Quynh - 20205122
package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
	// attributes of Media class
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    private int id;
    private String title;
    private String category;
    private float cost;
    
    // abstract class
    public Media() {}

    // Constructor
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // getters and setters
    public int getId() { return this.id;}
    public void setId(int id) { this.id = id;}
    public String getTitle() { return this.title;}
    public void setTitle(String title) { this.title = title;}
    public String getCategory() { return this.category;}
    public void setCategory(String category) { this.category = category;}
    public float getCost() { return this.cost;}
    public void setCost(float cost) { this.cost = cost;}

    // Tran Thi Nhu Quynh - 20205122
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Media) {
            return this.getTitle().equals(((Media) obj).getTitle());
        }
        return false;
    }
}
