 // Write a simple class and show Setter & Getter & comparing  methods

public class Rectangle {

    // fields
    private double width;
    private double length;

    // Copy constructor
    public Rectangle(Rectangle source) {
        length = source.length;
        width = source.width;
    }

    // Setter
    public void set_width(double w) {
        width = w;
    }
    public void set_length(double l) {
        length = l;
    }

    // Add isEqual method to compare between objects
    public boolean isEqual(Rectangle ob) {
        if(this.length == ob.length && this.width == ob.width) {
            return true;
        }else {
            return false;
        }
    }

    // Getter
    public double get_width() {
        return width;
    }
    public double get_length() {
        return length;
    }

    // Calculator the area of rectangle
    public double Area() {
        return (width*length);
    }

}