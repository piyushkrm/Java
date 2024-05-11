import java.util.Scanner;

public class Question3 {
    public static void greaterNum(int x, int y) {
        if (x == y) {
            System.out.println("Both number are equal !");
        } else if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(y + " is greater than " + x);
        }
    }

    public static void main(String[] args) {
        System.out.println("Question 3");
        System.out.println("Write a function which takes in 2 numbers and returns the greater of those two : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int number1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int number2 = sc.nextInt();
        greaterNum(number1, number2);
    }
}
