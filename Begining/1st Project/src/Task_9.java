// Write a program to print sum from 1 to number

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter positive number : ");
        int number = input.nextInt();
        int sum = 0;

        if (number > 0) {
            int i = 1;
            while (i <= number) {
                sum += i;
                i++;
            }
            System.out.printf("Sum : %d", sum);
        } else
            System.out.print("Invalid input, Sorry Enter positive number");

        input.close();

    }
}
