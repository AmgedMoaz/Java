 // Write a main class for many classes

 import java.util.Scanner;

public class Main {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    /*       [ Class Rectangle ]
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
      Employee ob = new Employee();
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

      Plane Ex = new Plane();

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

      Hall ob1 = new Hall(40,30);
      Hall ob2 = new Hall(50,60);
      Hall ob3 = new Hall();
      Hall ob4 = ob3.add(ob1,ob2);
      System.out.println("The total hall width is : " + ob4.get_Width() + " m");
      System.out.println("The total hall Length is : " + ob4.get_Length() + " m");

  }

}