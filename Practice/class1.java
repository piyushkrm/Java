import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        System.out.println("Read and print an Integer value");
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Your entered number is : "+ a);
    }
}
