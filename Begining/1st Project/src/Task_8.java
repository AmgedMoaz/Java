// Write a program to print Multiplication Table

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            int multiplication = number * i;
            System.out.printf("%d * %d = %d%n", number, i, multiplication);
        }
        input.close();

    }
}