// Write a program to show the meaning of overloading in methods

import java.util.Scanner;

public class Task_13 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Display();
        System.out.println("Display the integer numbers");
        int x = 0, y = 0;
        Display(x, y);
        System.out.println("Display the float numbers");
        float a = 0, b = 0;
        Display(a, b);
        System.out.println("Display a characters");
        char n = ' ', m = ' ';
        Display(n, m);

    }

    public static void Display() {
        System.out.println("Overloading Methods");
    }

    public static void Display(int i, int j) {
        System.out.print("Enter integer number 1 : ");
        i = input.nextInt();
        System.out.print("Enter integer number 2 : ");
        j = input.nextInt();
        System.out.printf("Number 1 : %d%nNumber 2 : %d%n", i, j);
    }

    public static void Display(float i, float j) {
        System.out.print("Enter number 1 : ");
        i = input.nextFloat();
        System.out.print("Enter number 2 : ");
        j = input.nextFloat();
        System.out.printf("Number 1 : %.1f%nNumber 2 : %.1f%n", i, j);
    }

    public static void Display(char i, char j) {
        System.out.print("Enter first character : ");
        i = input.next().charAt(0);
        System.out.print("Enter second character : ");
        j = input.next().charAt(0);
        System.out.printf("First character is %c%nSecond character is %c%n", i, j);
    }
}