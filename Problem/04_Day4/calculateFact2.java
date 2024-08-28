import java.util.Scanner;

public class calculateFact2 {

    // Approch1
    public static int fact1(int number) {
        int result = 1;
        if (number == 0 || number == 1) {
            return 1;

        }
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Approach 2
    public static int fact2(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * fact2(number - 1);
    }

    // Approach 3
    public static int fact3(int number) {
        return (number == 0 || number == 1) ? 1 : number * fact3(number - 1);
    }

    public static void main(String[] args) {
        // calculate factorial
        // Approach1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for calculating factorial : ");
        int number = sc.nextInt();
        System.out.println(fact1(number));
        System.out.println(fact2(number));
        System.out.println(fact3(number));
    }
}
