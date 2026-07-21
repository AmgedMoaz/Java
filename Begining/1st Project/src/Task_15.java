// Write a program to fill ,display and search a target in array by methods

import java.util.Scanner;

public class Task_15 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] atgs) {

        System.out.print("Enter size of array : ");
        int size = input.nextInt();
        int[] list = new int[size];

        fillArray(list, size);

        displayArray(list);

        System.out.print("Enter the target you want to search : ");
        int target = input.nextInt();
        int index = search(list, target);
        if (index != -1) {
            System.out.println("Target is found at index " + index);
        } else {
            System.out.println("Target is not found");
        }

        input.close();

    }

    static void fillArray(int[] list, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Enter no " + (i + 1));
            list[i] = input.nextInt();
        }
    }

    static void displayArray(int[] list) {
        System.out.print("The array is : ");
        for (int i = 0; i < list.length; i++) {
            System.out.printf(" %d", list[i]);
        }
        System.out.println();
    }

    static int search(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }

}