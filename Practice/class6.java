import java.util.Scanner;

public class class6 {
    public static void main(String[] args) {
        System.out.println("Find largest among three number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.print(a + " is greater of all among numbers");
        } else if (b > a && b > c) {
            System.out.print(b + " is greater of all among numbers");
        } else {
            System.out.print(c + " is greater of all among numbers");
        }
    }
}
