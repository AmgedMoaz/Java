 // Write a implementation class for interface and implement his method

public class CD implements RetaiItem {

    // fields
    private String title;
    private String artist;
    private double price;

    // Default constructor
    public CD() {}

    // Overloading constructor
    public CD(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    // Implementation method
    public double get_itemPrice() {
        return price;
    }

}