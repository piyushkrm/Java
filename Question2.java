import java.util.Scanner;

public class Question2 {
    public static int oddNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Question2");
        System.out.println("Write a function to print the sum of all odd numbers from 1 to n.");
        System.out.print("Enter a number for print the sum of all odd numbers : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of all odd number from 1 to " + num + " is : " + oddNum(num));
    }
}
