 // Write a Derived class from Person class and add some features

public class Student extends Person {

    // fields
    private int level;
    private double gpa;
    private String specialization;

    // Default constructor
    public Student() {
        System.out.println("I'm the derived class");
    }

    // Overloading constructor
    public Student(String first_name , String second_name , int age , String address , String nation , int level , double gpa , String specialization) {
        super(first_name,second_name,age,address,nation);
        this.level = level;
        this.gpa = gpa;
        this.specialization = specialization;
    }

    // Setters
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    // Getters
    public int getLevel() {
        return level;
    }
    public double getGpa() {
        return gpa;
    }
    public String getSpecialization() {
        return specialization;
    }

}