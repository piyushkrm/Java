import java.util.Scanner;

public class FindLargestNo6 {

    public static void usingIfElse(int x, int y, int z) {
        try {

            if (x >= y && x >= z) {
                System.out.println(x + " is greatest of those number.");
            } else if (y >= x && y >= z) {
                System.out.println(y + " is greatest of those number.");
            } else {
                System.out.println(z + " is greatest of those number.");
            }
        } catch (Exception e) {
            System.out.println(e + "Error");
        }
    }

    public static void biggestNumber(int x, int y, int z) {
       int  result = z  > (x > y ? x : y) ? z : ((x > y) ? x : y);
       System.out.println(result+ " are largest of those number.");
    }

    public static void main(String arga[]) {
        System.out.println("In this program we will find the larget of three numbers.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = sc.nextInt();

        System.out.print("Enter second number : ");
        int y = sc.nextInt();

        System.out.print("Enter third number : ");
        int z = sc.nextInt();

        // There are many approaches to find the largest number
        // 1. Using if else statement
        // We will make a function to find the larget number
        // usingIfElse(x, y, z);

        // 2. Usinf ternary operator
        biggestNumber(x, y, z);


    }
}
