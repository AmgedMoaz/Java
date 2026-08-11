// Write a derived class from super class and interface

public class SalariedEmployee extends Employee implements Displayable {

    // Fields
    private double salary;
    private double bonus;
    private double deduction;

    // Overloading constructor
    public SalariedEmployee(String name , String address , int SSN) {
        super(name,address,SSN);
    }

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    // Implementing methods
    @Override
    public double Earning() {
        return (salary + bonus - deduction);
    }
    @Override
    public void display_All_details() {
        System.out.println("Company Name : " + companyName + "\nFax : " + fax);
        System.out.println("Name : " + getName());
        System.out.println("Address : " + getAddress());
        System.out.println("SSN : " + getSSN());
        System.out.println("Salary : " + salary);
        System.out.println("Bonus : " + bonus);
        System.out.println("Deduction : " + deduction );
    }
    @Override
    public void display_Earning() {
        System.out.println(salary+bonus-deduction);
    }

}