import java.util.Scanner;

public class Question1 {
    public static int average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("Question1");
        System.out.println("Enter 3 numbers from the user and make a function to print their average.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();
        System.out.println("Average of entered number is : " + average(num1, num2, num3));
    }
}
