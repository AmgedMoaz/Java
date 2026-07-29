 // Write a class to show meaning of static in oop

public class Plane {

    // fields
    private int model;
    private String maker;
    private static int no_of_planes;

    // Default constructor
    public Plane() {
       no_of_planes++;
    }

    // Overloading constructor
    public Plane(int mo , String m) {
        model = mo;
        maker = m;
        no_of_planes++;
    }

    // Getter methods
    public int get_model() {
        return model;
    }
    public String get_maker() {
        return maker;
    }
    public static int get_no_of_planes() {
        return no_of_planes;
    }

}