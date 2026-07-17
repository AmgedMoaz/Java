// Write a program to show number is positive or negative or zero

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // Check the sign of the number
        if (number > 0) {
            System.out.print("Positive");
        } else if (number < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }
        input.close();

    }
}