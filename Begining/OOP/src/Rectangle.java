 // Write a simple class and show Setter & Getter methods

public class Rectangle {
    private double width;
    private double length;

    public void set_width(double w) {
        width = w;
    }
    public void set_length(double l) {
        length = l;
    }

    public boolean isEqual(Rectangle ob) {
        if(this.length == ob.length && this.width == ob.width) {
            return true;
        }else {
            return false;
        }

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