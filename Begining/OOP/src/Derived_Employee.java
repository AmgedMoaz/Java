// Write a Derived class from Person class and add some features

public class Derived_Employee extends Person {

    // fields
    private double salary;
    private String rank;
    private String job;

    // Default constructor
    public Derived_Employee() {}

    // Overloading constructor

    public Derived_Employee(String first_name , String second_name , int age , String address , String nation,double salary, String rank, String job) {
       super(first_name,second_name,age,address,nation);
        this.salary = salary;
        this.rank = rank;
        this.job = job;
    }

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setJob(String job) {
        this.job = job;
    }

    // Getters
    public double getSalary() {
        return salary;
    }
    public String getRank() {
        return rank;
    }
    public String getJob() {
        return job;
    }

}