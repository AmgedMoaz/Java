// Write a class to use all classes in main more easily

import java.util.ArrayList;
import java.util.Collection;

public class Department {

    // Fields
    int department_number;
    String department_name;
    ArrayList <Employee> employee_list;

    // Default constructor
    public Department() {}

    // Overloading constructor


    public Department(int department_number, String department_name) {
        this.department_number = department_number;
        this.department_name = department_name;
        employee_list = new ArrayList<Employee>();
    }

    // Setters
    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    // Getters
    public int getDepartment_number() {
        return department_number;
    }
    public String getDepartment_name() {
        return department_name;
    }

    // Method to add employee
    public void add_employee(Employee ob) {
        employee_list.add(ob);
    }

    // Method to remove employee
    public void remove_employee(int index) {
        employee_list.remove(index);
    }

    // Method to get number of employees
    public int number_of_employee() {
        return employee_list.size();
    }

    // Method to print basic data
    public void print_basicData() {
        for(int i = 0 ; i < employee_list.size() ; i++) {
            System.out.print(employee_list.get(i).getName() + " ");
            System.out.print(employee_list.get(i).getAddress() + " ");
            System.out.println(employee_list.get(i).getSSN());
        }
    }

    // Method to print all data
    public void print_allData() {
        System.out.println("Department name : " + department_name);
        System.out.println("Department number : " + department_number);
        for(int i = 0 ; i < employee_list.size() ; i++) {
            if(employee_list.get(i) instanceof SalariedEmployee) {
                ((SalariedEmployee) employee_list.get(i)).display_All_details();
            }else if(employee_list.get(i) instanceof HourlyEmployee) {
                ((HourlyEmployee) employee_list.get(i)).display_All_details();
            }else {
                ((CommissionEmployee) employee_list.get(i)).display_All_details();
            }
        }
    }

}