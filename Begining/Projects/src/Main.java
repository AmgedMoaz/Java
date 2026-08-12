// Main class for implementing many classes

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Department ob = new Department(12,"IT Service");

        SalariedEmployee s1 = new SalariedEmployee("Amged","Cairo",12000);
        s1.setSalary(10000.0);
        s1.setBonus(2000.0);

        ob.add_employee(s1);

        HourlyEmployee h1 = new HourlyEmployee("Ahmed","Giza",10000);
        h1.setNo_of_hours(120);
        h1.setHour_rare(75);

        ob.add_employee(h1);

        CommissionEmployee c1 = new CommissionEmployee("Mohammed","Menoufia",9000,50000.0,0.5);

        ob.add_employee(c1);

        System.out.println(ob.number_of_employee());
        System.out.println();

        ob.print_basicData();
        System.out.println();

        ob.print_allData();

    }
}