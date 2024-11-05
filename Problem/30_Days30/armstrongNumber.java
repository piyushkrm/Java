
// Armstrong number

public class armstrongNumber {

    public static boolean isArmstrong(int number) {
        int copyOriginal = number;
        int sumOfCubes = 0;

        while (number != 0) {
            int digit = number % 10;
            sumOfCubes += Math.pow(digit, 3);
            // sumOfCubes = (digit * digit * digit);
            number /= 10;
        }
        return sumOfCubes == copyOriginal;
    }
    public static void main(String[] args) {
        int number  = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
