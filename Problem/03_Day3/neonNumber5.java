import java.util.Scanner;

public class neonNumber5 {

    public static boolean checkNoIsNeonOrNot(int number) {

        int square = number * number;
        int sum = 0;

        while (square > 0) {
            int reminder = square % 10;

            sum += reminder;

            square /= 10;

        }

        if (sum == number) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        // Neon number :- > square of a number and sum of the square is equal to the
        // number is neon number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check the number is neon or not : ");
        int number = sc.nextInt();
        
        System.out.println(checkNoIsNeonOrNot(number));
    }

}