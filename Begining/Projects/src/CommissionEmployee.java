// Write a derived class from super class and interface

public class CommissionEmployee extends Employee implements Displayable {

    // Fields
    private double Gross_Sales;
    private double Commission_rate;

    // Overloading constructor
    public CommissionEmployee(String name , String address , int SSN , double Gross_Sales , double Commission_rate) {
        super(name,address,SSN);
        this.Gross_Sales = Gross_Sales;
        this.Commission_rate = Commission_rate;
    }

    // Getters
    public double getGross_Sales() {
        return Gross_Sales;
    }
    public double getCommission_rate() {
        return Commission_rate;
    }

    // Implementing methods
    @Override
    public double Earning() {
        return (Gross_Sales * Commission_rate/100);
    }
    @Override
    public void display_All_details() {
        System.out.println("Company Name : " + companyName + "\nFax : " + fax);
        System.out.println("Name : " + getName());
        System.out.println("Address : " + getAddress());
        System.out.println("SSN : " + getSSN());
        System.out.println("Gross Sales : " + Gross_Sales);
        System.out.println("Commission rate : " + Commission_rate);
    }
    @Override
    public void display_Earning() {
        System.out.println( Gross_Sales * (Commission_rate/100) );
    }

}