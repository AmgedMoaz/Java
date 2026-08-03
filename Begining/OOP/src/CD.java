 // Write a implementation class for interface and implement his method

public class CD implements RetaiItem , Displayable {

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

    // Implementation method 1
    public double get_itemPrice() {
        return price;
    }

    // // Implementation method 2
    public void display() {
        System.out.println("Store : " + Store_name);
        System.out.println("Title : " + title);
        System.out.println("Artist : " + artist);
        System.out.println("Price : " + price);
    }

}