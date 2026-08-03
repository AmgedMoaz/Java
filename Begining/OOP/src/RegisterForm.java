 // Write a class and show meaning Definition ,Declaration and Assignment of enum

// Definition enums
enum Gender {Male,Female};
enum Course {Database,AI,Web,Mobile};
enum Semester {Summer,Winter,Spring,Autumn};

public class RegisterForm {

    // Foe;ds
    private String student_name;
    private Gender student_gender;
    private Course student_course;
    private Semester student_semester;

    // Primary Constructor
    public RegisterForm() {
        student_name = "No name";
        student_gender = Gender.Male;
        student_course = Course.Web;
        student_semester = Semester.Autumn;
    }

    // Display method
    public void display() {
        System.out.println("Nane : " + student_name);
        System.out.println("Gender : " + student_gender);
        System.out.println("Course : " + student_course);
        System.out.println("Semester : " + student_semester);
    }

}