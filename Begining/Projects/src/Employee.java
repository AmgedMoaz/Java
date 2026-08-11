// Write an abstract super class for many classes

public abstract class Employee {

    // Fields
    private String name;
    private String address;
    private int SSN;

    // Default constructor
    public Employee() {};

    // Overloading constructor
    public Employee(String name , String address , int SSN) {
        this.name = name;
        this.address = address;
        this.SSN = SSN;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getSSN() {
        return SSN;
    }

    // Method to must be implement in derived classes
    public abstract double Earning();

}