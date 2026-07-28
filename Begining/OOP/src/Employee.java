 // Write a simple Employee class and the default constructor and call constructor within another constructor

public class Employee {

    private int id;
    private String name;
    private double salary;
    private float bonus;
    private boolean isActive;

    /*
     default constructor
       public Employee() {
       id = 0;
       name = null;
       salary = 0.0;
       bonus = 0.0f;
       isActive = false;
       **(Array or string or any reference is NULL)**
       }
     */

    public Employee() {

    }

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
    public void display() {
        System.out.println("Employee name is : " + name);
        System.out.println("Employee id is : " + id);
        System.out.println("Employee salary is : " + salary);
        System.out.println("Employee bonus is : " + bonus);
        System.out.println("Employee case is : " + isActive + "\n");
    }

}