import java.util.Scanner;
public class AddBinaryWithFun4 {

    // Define function ie adding binary string
    public static String addBinaryString(String y, String z) {
        int s1 = Integer.parseInt(y, 2);
        int s2 = Integer.parseInt(z, 2);

        int sum = s1 + s2;
        return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
        // Add two binary string and also return binary string

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary string : ");
        String y = sc.nextLine();
        System.out.print("Enter second binary string : ");
        String z = sc.nextLine();
        System.out.println("Sum of two binary string are : "+addBinaryString(y, z));

    }
}
