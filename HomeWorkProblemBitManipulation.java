import java.util.Scanner;

public class HomeWorkProblemBitManipulation {
    public static int BinaryToDecimal(String binaryString) {
        int decimal = 0;
        int power = 1;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            int bit = binaryString.charAt(i) - '0';
            decimal += bit * power;
            power *= 2;
        }
        return decimal;
    }

    public static String DecimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            int reminder = decimal % 2;
            binary += reminder;
            decimal /= 2;
        }
        return binary;
    }

    public static boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        } else {
            return (number & (number - 1 )) == 0 ;
        }
    }
    public static void main(String[] args) {
        System.out.println("Question 1\nConvert binary to decimal number : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number for convert to decimal : ");
        String num = sc.nextLine();
        System.out.print("After convert biary to decimal number is : " + BinaryToDecimal(num));

        System.out.println("Question 2\nConvert decimal to binary number : ");
        System.out.print("Enter decimal number for convert to binary number : ");
        int decimal = sc.nextInt();
        System.out.println("After convert decimal to binary number is : " + DecimalToBinary(decimal));

        System.out.println("Question 3\n : ");
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        boolean isPowerOfTwo = isPowerOfTwo(number);
        if (isPowerOfTwo) {
            System.out.println("The number "+number+" is a power of 2 :");
        } else {
            System.out.println("The number "+number+" is not a power of 2 :");
        }
    }
}
