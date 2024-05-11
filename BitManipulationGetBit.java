import java.util.Scanner;

public class BitManipulationGetBit {
    public static void main(String[] args) {
        System.out.println("Bit Manipulation 'Get Bit'");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number for Getting bit : ");
        int n = sc.nextInt();
        System.out.print("Enter the position for getting bit : ");
        int position = sc.nextInt();
        int bitMask = 1 << position;
        if ((bitMask & n) == 1) {
            System.out.println("At the position " + position + " bit is : One");
        } else {
            System.out.println("At the position " + position + " bit is : Zero");
        }
    }
}
