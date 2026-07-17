// Write a program to read the degree of the student

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your degree : ");
        double degree = input.nextDouble();

        // Show the rate of the student
        if (degree < 0 || degree > 100)
            System.out.println("Invalid input");
        else {
            if (degree < 60)
                System.out.println("F");
            else if (degree >= 60 && degree < 70)
                System.out.println("D");
            else if (degree >= 70 && degree < 80)
                System.out.println("C");
            else if (degree >= 80 && degree < 90)
                System.out.println("B");
            else if (degree >= 90 && degree <= 100)
                System.out.println("A");
        }
        input.close();

    }
}