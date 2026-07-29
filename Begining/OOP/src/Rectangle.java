 // Write a simple class about rectangle and show Setter & Getter methods

public class Rectangle {
    private double width;
    private double length;

    public void set_width(double w) {
        width = w;
    }
    public void set_length(double l) {
        length = l;
    }
    public double get_width() {
        return width;
    }
    public double get_length() {
        return length;
    }
    public double Area() {
        return (width*length);
    }
}