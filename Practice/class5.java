import java.util.Scanner;

public class class5 {
    public static void main(String[] args) {
        System.out.println("Program to check Even or Odd Integers");
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
