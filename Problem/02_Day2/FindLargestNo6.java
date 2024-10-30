import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FindLargestNo6 {

    // Approach 1
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

    // Approach 2
    public static void biggestNumber(int x, int y, int z) {
        int result = z > (x > y ? x : y) ? z : ((x > y) ? x : y);
        System.out.println(result + " is largest of those number.");
    }

    // Approach 3
    public static void usingMath(int x, int y, int z) {
        int result = Math.max(x, Math.max(y, z));
        System.out.println(result + " is biggest number.");
    }

    // Approach 4
    public static void usingCollection(int x, int y, int z) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(x);
        arr.add(y);
        arr.add(z);

        int result = Collections.max(arr);
        System.out.println(result + " is biggest number.");

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
        usingIfElse(x, y, z);

        // 2. Using ternary operator
        biggestNumber(x, y, z);

        // 3. Using math function
        usingMath(x, y, z);

        // 4. Usinf collection.max function
        usingCollection(x, y, z);

    }
}
