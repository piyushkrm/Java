import java.util.Scanner;

public class BitManipulationClearBit {
    public static void main(String[] args) {
        System.out.println("Bit Manipulation 'Clear Bit'");
        System.out.print("Enter number in Decimal : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter position for changing the bit : ");
        int position = sc.nextInt();

        int bitMask = 1 << position;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println("After changing the bit, value is : " + newNumber);
    }
}
