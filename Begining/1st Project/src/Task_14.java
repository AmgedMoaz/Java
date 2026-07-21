// Write a program to fill and display elements at array

import java.util.Scanner;

public class Task_14 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a size number of array : ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        // Fill the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter no " + (i + 1));
            numbers[i] = input.nextInt();
        }

        // Display the elements of array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}
