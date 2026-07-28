 // Write a main class for many classes

 import java.util.Scanner;

public class Main {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    /*
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

  }

}