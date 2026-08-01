 // Write a Derived class from Derived class (Derived_Employee) amd show meaning of overriding methods

public class Salaried_Employee extends Derived_Employee {

    // fields
    private double bonus;
    private double deduction;

    // Default constructor
    public Salaried_Employee() {}

    // Overloading constructor
    public Salaried_Employee(String first_name , String second_name , int age , String address , String nation , double salary , String rank , String job , double bonus , double deduction) {
       super(first_name,second_name,age,address,nation,salary,rank,job);
        this.bonus = bonus;
        this.deduction = deduction;
    }

    // Setters
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    // Getters
    public double getBonus() {
        return bonus;
    }
    public double getDeduction() {
        return deduction;
    }

}