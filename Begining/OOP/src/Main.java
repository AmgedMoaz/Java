 // Write a main class for many classes

 import java.util.ArrayList;
 import java.util.InputMismatchException;
 import java.util.Scanner;

public class Main {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

      /*    [ Class Rectangle ]
     Rectangle ob = new Rectangle();
      System.out.print("Enter double width : ");
      double Width = input.nextDouble();
      ob.set_width(Width);
      System.out.print("Enter double length : ");
      double length = input.nextDouble();
      ob.set_length(length);


      double rectWidth =  ob.get_width();
      double rectLength = ob.get_length();
      System.out.println("Rectangle Width is : " + rectWidth);
      System.out.println("Rectangle Length is : " + rectLength);

      double rectArea = ob.Area();
      System.out.println("Rectangle Area is : " + rectArea);

      Rectangle copyObjrct = new Rectangle(ob);
      System.out.println("The area of copyConstructor is : " + copyObjrct.Area());
      */

      /*    [ Class Car ]
      System.out.print("Enter car model : ");
      int model = input.nextInt();
      System.out.print("Enter car maker : ");
      String maker = input.next();

      Car ob1 , ob2 = new Car(model,maker);
      ob1 = new Car();
      int mo = ob1.get_model();
      String m = ob1.get_maker();

      System.out.println("The maker is : " + m);
      System.out.println("The model is : " + mo);
      System.out.println();

       mo = ob2.get_model();
       m = ob2.get_maker();

      System.out.println("The maker is : " + m);
      System.out.println("The model is : " + mo);

      int edit_model = 2030;
      ob1.set_model(edit_model);
      mo = ob1.get_model();
      m = ob1.get_maker();
      System.out.println("The car maker of object 1 is : " + m);
      System.out.print("The model of ob1 after modified : " + mo);
      */

      /*      [ Class Employee ]
      Employee ob = new Employee();  // Default features
      ob.display();

      ob = new Employee(152300032,"Amged");
      ob.display();

      ob = new Employee(152300032,"Amged",12000.4);
      ob.display();

      ob = new Employee(152300032,"Amged",12000.4,0.40f,true);
      ob.display();
       */

      /*    [Class Plane ]
      int no = Plane.get_no_of_planes();

      Plane Ex = new Plane();  // Default features except (no_of_planes)

      System.out.print("Enter plane maker 1 : ");
      String ma = input.next();
      System.out.print("Enter plane model 1 : ");
      int mo = input.nextInt();
      Plane ob = new Plane(mo,ma);

      System.out.print("Enter plane maker " + Plane.get_no_of_planes() + " : ");
       ma = input.next();
      System.out.print("Enter plane model " + Plane.get_no_of_planes() + " : ");
       mo = input.nextInt();
      Plane ob1 = new Plane(mo,ma);

      System.out.print("Enter plane maker " + Plane.get_no_of_planes() + " : ");
      ma = input.next();
      System.out.print("Enter plane model " + Plane.get_no_of_planes() + " : ");
      mo = input.nextInt();
      Plane ob2 = new Plane(mo,ma);

      System.out.print("Enter plane maker " + Plane.get_no_of_planes() + " : ");
      ma = input.next();
      System.out.print("Enter plane model " + Plane.get_no_of_planes() + " : ");
      mo = input.nextInt();
      Plane ob3 = new Plane(mo,ma);

          System.out.println("The Plane 1 maker is : " + ob.get_maker() );
          System.out.println("The Plane 1 model is : " + ob.get_model() );
          System.out.println();
          System.out.println("The Plane 2 maker is : " + ob1.get_maker() );
          System.out.println("The Plane 2 model is : " + ob1.get_model() );
          System.out.println();
          System.out.println("The Plane 3 maker is : " + ob2.get_maker() );
          System.out.println("The Plane 3 model is : " + ob2.get_model() );
          System.out.println();
          System.out.println("The Plane 4 maker is : " + ob3.get_maker() );
          System.out.println("The Plane 4 model is : " + ob3.get_model() );
          System.out.println();
       */

      /*     [ Class Calculator ]
      System.out.print("Emter a number 1 : ");
      double num1 = input.nextDouble();
      System.out.print("Emter a number 2 : ");
      double num2 = input.nextDouble();

      System.out.println("After addition is : " + Calculator.add(num1,num2));
      System.out.println("After subtraction is : " + Calculator.subtraction(num1,num2));
      System.out.println("After multiplication is : " + Calculator.multiply(num1,num2));
      System.out.println("After division is : " + Calculator.division(num1,num2));
      System.out.println("After modlus is : " + Calculator.modlus(num1,num2));
       */

      /*    [ Class Room ]
      Room ob = new Room(5,4);
      System.out.printf("The room width is : %d m%n", ob.get_Width());
      System.out.printf("The room length is : %d m%n", ob.get_Length());
      System.out.println();

      ob.room_modified(ob);
      System.out.printf("The room width is : %d m%n", ob.get_Width());
      System.out.printf("The room length is : %d m%n", ob.get_Length());
      System.out.println();
       */

      /*    [ Class Hall ]
      // Shape 1
      Hall ob1 = new Hall(40,30);
      Hall ob2 = new Hall(50,60);
      Hall ob3 = new Hall();  // Default features
      Hall ob4 = ob3.add(ob1,ob2);
      System.out.println("Shape 1");
      System.out.println("The total hall width is : " + ob4.get_Width() + " m");
      System.out.println("The total hall Length is : " + ob4.get_Length() + " m");
      System.out.println("\n");

      // Shape 2
      ob1 = new Hall(20,30);
      ob2 = new Hall(40,50);
      ob3 = ob1.add(ob2);
      System.out.println("Shape 2");
      System.out.println("The total hall width is : " + ob3.get_Width() + " m");
      System.out.println("The total hall Length is : " + ob3.get_Length() + " m");

      // also true
      // System.out.println("The total hall width is : " + ob1.add(ob2).get_Width() + " m");
      // System.out.println("The total hall Length is : " + ob1.add(ob2).get_Length() + " m");

      System.out.println("\n");


      // Shape 3
      ob1 = new Hall(100,110);
      ob2 = new Hall(110,120);
      ob2 = ob1.Add(ob2);
      System.out.println("Shape 3");
      System.out.println("The total hall width is : " + ob2.get_Width() + " m");
      System.out.println("The total hall Length is : " + ob2.get_Length() + " m");
      System.out.println("\n");
      */

      //  Inheritance
      /*     [ Class Person ]
      Person ob1 = new Person(); // Default features
      Person ob2 = new Person("Amged","Moaz",21,"Menofia","Egypt");

      System.out.println( "This object is of " + ob1.getClass());
      System.out.println( "First name is : " + ob1.getFirst_name());
      System.out.println( "Last name is : " + ob1.getSecond_name());
      System.out.println( "Age is : " + ob1.getAge());
      System.out.println( "Address is : " + ob1.getAddress());
      System.out.println( "Nationality  is : " + ob1.getNationality());
      System.out.println();

      System.out.println( "This object is of " + ob2.getClass());
      System.out.println( "First name is : " + ob2.getFirst_name());
      System.out.println( "Last name is : " + ob2.getSecond_name());
      System.out.println( "Age is : " + ob2.getAge());
      System.out.println( "Address is : " + ob2.getAddress());
      System.out.println( "Nationality  is : " + ob2.getNationality());
      System.out.println();
       */

      /*   [ Class Student ]
      Student ob1 = new Student();  // Default features
      Student ob2 = new Student("Amged","Moaz",21,"Menofia","Egypt",3,3.2,"software");

      System.out.println( "This object is of " + ob1.getClass());
      System.out.println( "First name is : " + ob1.getFirst_name());
      System.out.println( "Last name is : " + ob1.getSecond_name());
      System.out.println( "Age is : " + ob1.getAge());
      System.out.println( "Address is : " + ob1.getAddress());
      System.out.println( "Nationality  is : " + ob1.getNationality());
      System.out.println( "Level is : " + ob1.getLevel());
      System.out.println( "GPA is : " + ob1.getGpa());
      System.out.println( "Specialization is : " + ob1.getSpecialization());
      System.out.println();

      System.out.println( "This object is of " + ob2.getClass());
      System.out.println( "First name is : " + ob2.getFirst_name());
      System.out.println( "Last name is : " + ob2.getSecond_name());
      System.out.println( "Age is : " + ob2.getAge());
      System.out.println( "Address is : " + ob2.getAddress());
      System.out.println( "Nationality  is : " + ob2.getNationality());
      System.out.println( "Level is : " + ob2.getLevel());
      System.out.println( "GPA is : " + ob2.getGpa());
      System.out.println( "Specialization is : " + ob2.getSpecialization());
      System.out.println();

      ob2.setGpa(2.45);
      System.out.println( "GPA after modified is : " + ob2.getGpa());
      ob2.setAge(22);
      System.out.println( "Age after modified is : " + ob2.getAge());
      */

      /*  [ Class Derived_Employee ]
      Derived_Employee ob1 = new Derived_Employee();
      Derived_Employee ob2 = new Derived_Employee("Amged","Moaz",21,"Menofia","Egypt",12.400,"Excellent","Software_Engineer");

      System.out.println( "This object is of " + ob1.getClass());
      System.out.println( "First name is : " + ob1.getFirst_name());
      System.out.println( "Last name is : " + ob1.getSecond_name());
      System.out.println( "Age is : " + ob1.getAge());
      System.out.println( "Address is : " + ob1.getAddress());
      System.out.println( "Nationality  is : " + ob1.getNationality());
      System.out.println( "Salary is : " + ob1.getSalary());
      System.out.println( "Rank is : " + ob1.getRank());
      System.out.println( "Jop is : " + ob1.getJob());
      System.out.println();

      System.out.println( "This object is of " + ob2.getClass());
      System.out.println( "First name is : " + ob2.getFirst_name());
      System.out.println( "Last name is : " + ob2.getSecond_name());
      System.out.println( "Age is : " + ob2.getAge());
      System.out.println( "Address is : " + ob2.getAddress());
      System.out.println( "Nationality  is : " + ob2.getNationality());
      System.out.println( "Salary is : " + ob2.getSalary());
      System.out.println( "Rank is : " + ob2.getRank());
      System.out.println( "Job is : " + ob2.getJob());
      System.out.println();
       */

      /*    [ Class Salaried_Employee ]
      Salaried_Employee ob1 = new Salaried_Employee();
      Salaried_Employee ob2 = new Salaried_Employee("Amged","Moaz",21,"Menofia","Egypt",12400.0,"Excellent","Software_Engineer",2400.0,0.0);

      System.out.println( "This object is of " + ob1.getClass());
      System.out.println( "First name is : " + ob1.getFirst_name());
      System.out.println( "Last name is : " + ob1.getSecond_name());
      System.out.println( "Age is : " + ob1.getAge());
      System.out.println( "Address is : " + ob1.getAddress());
      System.out.println( "Nationality  is : " + ob1.getNationality());
      System.out.println( "Salary is : " + ob1.getSalary());
      System.out.println( "Rank is : " + ob1.getRank());
      System.out.println( "Jop is : " + ob1.getJob());
      System.out.println( "Bonus is : " + ob1.getBonus());
      System.out.println( "Deduction is : " + ob1.getDeduction());
      System.out.println();

      System.out.println( "This object is of " + ob2.getClass());
      System.out.println( "First name is : " + ob2.getFirst_name());
      System.out.println( "Last name is : " + ob2.getSecond_name());
      System.out.println( "Age is : " + ob2.getAge());
      System.out.println( "Address is : " + ob2.getAddress());
      System.out.println( "Nationality  is : " + ob2.getNationality());
      System.out.println( "Salary is : " + ob2.getSalary());
      System.out.println( "Rank is : " + ob2.getRank());
      System.out.println( "Jop is : " + ob2.getJob());
      System.out.println( "Bonus is : " + ob2.getBonus());
      System.out.println( "Deduction is : " + ob2.getDeduction());
      System.out.println();
       */

      /*   [ Derived_Rectangle class ]
      Derived_Rectangle ob2 = new Derived_Rectangle();
      ob2.setLength(12.4);
      ob2.setWidth(7.2);
      System.out.println(ob2.getArea());
       */

      /*    [ Class Circle ]
      Circle ob = new Circle();
      ob.set_Edge(7.4);
      System.out.println("The area is : " + ob.getArea());
      System.out.println("The Perimeter is : " + ob.getPerimeter());
       */

      /*    [ Class CD ]
      // (X) RetaiItem ob = new RetaiItem();   because that is interface
      RetaiItem ob1 = new CD("Modern Football","Johan Cruff",700.0);
      //   الكلام اللي مكتوب فوق صحيح لأن ال ob نوعه RetaiItem اه بس بيشاور علي CD Class
      System.out.println(ob1.get_itemPrice());
      System.out.println();

      CD ob2 = new CD("Modern Football","Johan Cruff",400.0);
      // كان ممكن اخلي ob2 نوعه Displayable زي معملت مع ob1 و خليت نوعه RetaiItem
      ob2.display();
      System.out.println();
       */

      /*     [ Class RegisterForm ]
      RegisterForm ob = new RegisterForm();
      ob.display();
      System.out.println();

      Course ob1 = Course.Mobile;
      Course ob2 = Course.AI;
      System.out.println(ob1.equals(ob2));
      System.out.println(ob2.compareTo(ob1));
      System.out.println(ob1.compareTo(ob2));
       */

      // Exception
      /*
      int x = 10;
      int y = 0;
      // System.out.println(x/y);   Exception will found in run_time and crash the program

      try {
          int x;
          int y;
          System.out.print("Enter value of number 1 : ");
          x = input.nextInt();
          System.out.print("Enter value of number 2 : ");
          y = input.nextInt();
          System.out.println(x/y);
      }
      catch (ArithmeticException e) {
          System.out.println("Sorry ,Division by zero not allowed");
      }
      catch (InputMismatchException e) {
          System.out.println("Sorry ,Enter only numeric data");
      }
       // General handling exception
      catch(Exception s) {
          System.out.println(s.getMessage());
      }
      System.out.println("You're continued");
      */

  }

}