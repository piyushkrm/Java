import java.util.Scanner;

public class Question9 {
    public static void greatestCommonDivisor(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("Gretests Common Divisor is : " + n2);
    }

    public static void main(String[] args) {
        System.out.println("Question 9");
        System.out.println("Writea function that calculates the Greatest Common Divisor of 2numbers. (BONUS)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int n2 = sc.nextInt();
        greatestCommonDivisor(n1, n2);
    }
}
