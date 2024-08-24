import java.util.Scanner;

public class CheckEvenOdd5 {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("The number is even");

        } else {
            System.out.println("Number is odd");
        }
    }
}
