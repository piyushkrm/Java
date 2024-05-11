import java.util.Scanner;

public class Question8 {

    public static void raisedToThePower(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        System.out.println("x to the power n is : " + result);

    }

    public static void main(String[] args) {
        System.out.println("Question 8");
        System.out.println("Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x**n.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        raisedToThePower(x, n);
    }
}
