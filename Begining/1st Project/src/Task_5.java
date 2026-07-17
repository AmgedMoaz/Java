// Write a program to check number is even or odd

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
        input.close();

    }
}