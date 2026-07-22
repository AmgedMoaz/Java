// Write a program to fill ,Display ,Search for target and get sum of 2 Dimensional array items

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

        System.out.println("Enter an item to search ");
        int key = input.nextInt();
        searchArray(array, key);

        int sum = sumArray(array);
        System.out.println("The sum is : " + sum);
        
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

    static int searchArray(int[][] table, int target) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (target == table[i][j]) {
                    System.out.println("target is found in row " + (i + 1) + " and column " + (j + 1));
                    return i;
                }
            }
        }
        System.out.println("target not found");
        return -1;
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