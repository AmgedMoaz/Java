 // Write a simple class about car and use constructor

public class Car {

    // Fields
    private int model;
    private String maker;

    // Normal constructor
    public Car() {
        model = 2029;
        maker = "Kai";
    }

    // Constructor overloading
    public Car(int mo , String m) {
        model = mo;
        maker = m;
    }

    // Setter methods
     public void set_model(int mo) {
        model = mo;
     }
    public void set_maker(String m) {
        maker = m;
    }

    // Getter methods
    public int get_model() {
        return model;
    }
    public String get_maker() {
        return maker;
    }

}