import java.util.Scanner;

public class calculateFact2 {

    // Approch1
    public static int fact1(int number) {
        int result = 1;
        if (number == 0 || number == 1) {
            return 1;
            
        }
        for (int i = 2; i <= number; i++) {
            result*= i;
        }
        return result;
    }
    public static void main(String[] args) {
        // calculate factorial 
        // Approach1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for calculating factorial : ");
        int number = sc.nextInt();
        System.out.println(fact1(number));
    }
}
