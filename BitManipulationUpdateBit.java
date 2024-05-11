import java.util.Scanner;

public class BitManipulationUpdateBit {
    public static void main(String[] args) {
        System.out.println("Bit Manipulation 'Update Bit'");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in decimal : ");
        int n = sc.nextInt();
        System.out.print("Enter position for update the bit : ");
        int position = sc.nextInt();

        int bitMask = 1 << position;
        System.out.print("Enter number for updating(Enter only 0 and 1) : ");
        int operation = sc.nextInt();
        if (operation == 1) {
            int newNumber = bitMask | n;
            System.out.print("After updating the bit : " + newNumber);
        } else {
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.print("After updating the bit : " + newNumber);
        }
    }
}
