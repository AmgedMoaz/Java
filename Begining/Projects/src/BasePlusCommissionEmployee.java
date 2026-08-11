// Write a derived class from derived class to illustrate Class Hierarchy

public class BasePlusCommissionEmployee extends CommissionEmployee {

    // Field
    private double base;

    // Overloading constructor
    public BasePlusCommissionEmployee(String name , String address , int SSN , double Gross_Sales , double Commission_rate) {
        super(name,address,SSN,Gross_Sales,Commission_rate);
    }

    // Setter
    public void setBase(double base) {
        this.base = base;
    }

    // Implement the method
    @Override
    public double Earning() {
        return (base + super.Earning());
    }
    @Override
    public void display_All_details() {
        super.display_All_details();
        System.out.println("Base salary : " + base);
    }
    @Override
    public void display_Earning() {
        System.out.println(Earning());
    }

}