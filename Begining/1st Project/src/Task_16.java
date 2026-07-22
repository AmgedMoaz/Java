// Write a program to fill ,display and get sum of 2 Dimensional array items

import java.util.Scanner;

public class Task_16 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int rows, columns;
        System.out.print("Enter number of rows : ");
        rows = input.nextInt();
        System.out.print("Enter number of columns : ");
        columns = input.nextInt();
        int[][] array = new int[rows][columns];
        fillArray(array, rows, columns);
        displayArray(array);
        int sum = sumArray(array);
        System.out.print("The sum is : " + sum);

    }

    static void fillArray(int[][] table, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter item of row " + (i + 1) + " and column " + (j + 1));
                table[i][j] = input.nextInt();
            }
        }
    }

    static void displayArray(int[][] table) {
        System.out.println("The array table is ");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumArray(int[][] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
            }
        }
        return sum;
    }

}