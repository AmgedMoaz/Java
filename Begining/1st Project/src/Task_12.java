// Write a method to print the sum & average

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int x = input.nextInt();
        System.out.print("Enter number 2 : ");
        int y = input.nextInt();
        System.out.print("Enter number 3 : ");
        int z = input.nextInt();
        int total = sum(x, y, z);
        System.out.println("The Sum : " + total);
        double avg = average(x, y, z);
        System.out.println("The Average : " + avg);

    }

    public static int sum(int i, int j, int k) {
        return i + j + k;
    }

    public static double average(int i, int j, int k) {
        return (i + j + k) / 3.0;
    }
}