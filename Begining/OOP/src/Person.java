 // Write a Super class for many Sub_Classes

public class Person {

    // fields
    private String first_name;
    private String second_name;
    private int age;
    private String address;
    private String nationality;

    // Default constructor
    public Person() {
        System.out.println("Hi ,I'm default constructor of parent class\n");
    }

    // Overloading constructor
    public Person(String nation, String address, int age, String second_name, String first_name) {
        nationality = nation;
        this.address = address;
        this.age = age;
        this.second_name = second_name;
        this.first_name = first_name;
    }

    //Setters
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Getters
    public String getFirst_name() {
        return first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return nationality;
    }

}