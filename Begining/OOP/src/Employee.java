 // Write a simple class and the default constructor and call constructor within another constructor

public class Employee {

    // fields
    private int id;
    private String name;
    private double salary;
    private float bonus;
    private boolean isActive;

    /*
     Default features
       int      // 0
       double   // 0.0
       float    // 0.0f
       boolean  // false
       **(Array or string or any reference is null)**
     */

    // Default constructor
    public Employee() {

    }

    // Overloading constructors
    public Employee(int i , String n) {
        id = i;
        name = n;
    }
    public Employee(int i , String n , double s) {
        this(i,n);
        salary = s;
    }
    public Employee(int i , String n , double s , float b , boolean a) {
        this(i,n,s);
        bonus = b;
        isActive = a;
    }

    // Display method
    public void display() {
        System.out.println("Employee name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee salary is : " + salary);
        System.out.println("Employee bonus is : " + bonus);
        System.out.println("Employee case is : " + isActive + "\n");
    }

}