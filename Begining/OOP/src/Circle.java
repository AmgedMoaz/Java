 // Write a derived class and implement abstract methods by overriding

public class Circle extends Structure {

    // Setter
    public void set_Edge(double e) {
        edge = e;
    }

    // Getter
    public double get_Edge() {
        return edge;
    }

    // Implementation by overriding to calculate area
    @Override
    public double getArea() {
        return (3.12 * edge * edge);
    }

    // Implementation by overriding to calculate perimeter
    @Override
    public double getPerimeter() {
        return (2 * 3.12 * edge);
    }

}