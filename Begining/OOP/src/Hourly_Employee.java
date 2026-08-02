 // Write a derived class and show is it possible to override the final method ?

public class Hourly_Employee extends Derived_Employee {

    // fields
    private int hours;
    private int hour_rate;

    // Default constructor
    public Hourly_Employee() {}

    // Overloading constructor
    public Hourly_Employee(String first_name , String second_name , int age , String address , String nation , double salary , String rank , String job , int hours , int hour_rate) {
       super(first_name,second_name,age,address,nation,salary,rank,job);
        this.hours = hours;
        this.hour_rate = hour_rate;
    }

    // Setters
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setHour_rate(int hour_rate) {
        this.hour_rate = hour_rate;
    }

    // Getters
    public int getHours() {
        return hours;
    }
    public int getHour_rate() {
        return hour_rate;
    }

    // Check if override of not
    /*
    @Override
    public double get_Salary(){
        return (hours * hour_rate );
    }
     */

}