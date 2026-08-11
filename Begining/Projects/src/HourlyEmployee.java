// Write a derived class from super class and interface

public class HourlyEmployee extends Employee implements Displayable {

    // Fields
    private int No_of_hours;
    private double Hour_rate;

    // Overloading constructor
    public HourlyEmployee(String name , String address , int SSN) {
        super(name,address,SSN);
    }

    // Setters
    public void setNo_of_hours(int no_of_hours) {
        No_of_hours = no_of_hours;
    }
    public void setHour_rare(double hour_rare) {
        Hour_rate = hour_rare;
    }

    // Implementing methods
    @Override
    public double Earning() {
        return (No_of_hours*Hour_rate);
    }
    @Override
    public void display_All_details() {
        System.out.println("Company Name : " + companyName + "\nFax : " + fax);
        System.out.println("Number of hours : " + No_of_hours);
        System.out.println("Hour Rate : " + Hour_rate);
    }
    @Override
    public void display_Earning() {
        System.out.println( No_of_hours * (Hour_rate/100) );
    }

}