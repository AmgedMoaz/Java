 // Write a class and show the protected access modifier

public class Shape {

    // fields
    protected double Length;
    protected double Width;

    // Default constructor
    public Shape() {}

    // Overloading constructor
    public Shape(double l, double w) {
        Length = l;
        Width = w;
    }

    // Setters
    public void setLength(double length) {
        Length = length;
    }
    public void setWidth(double width) {
        Width = width;
    }

    // Getters
    public double getLength() {
        return Length;
    }
    public double getWidth() {
        return Width;
    }

}