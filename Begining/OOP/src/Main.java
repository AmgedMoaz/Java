 // Write a main class for many classes

 import java.util.Scanner;

public class Main {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {

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
  }
}