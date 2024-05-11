import java.util.Scanner;

public class BitManipulationSetBit {
    public static void main(String[] args) {
        System.out.println("Bit Manipulation 'Set Bit'");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal number for set the bit : ");
        int n = sc.nextInt();
        System.out.print("Enter position for set the bit : ");
        int position = sc.nextInt();
        int bitMask = 1 << position;
        int newNumber = bitMask | n;
        System.out.println("Set the number to : "+newNumber);
    }
}
