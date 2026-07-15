// Write a program to get two no from user and print their sum
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.printf("Sum : %d%n", sum);
        input.close();

    }
}