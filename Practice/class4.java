import java.util.Scanner;

public class class4 {
    public static void swapping(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    System.out.println("Swapping the number x is : "+ x);        
    System.out.println("Swapping the number y is : "+ y);        
    }
    public static void main(String[] args) {
        System.out.println("Enter two number for swapping : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number x : ");
        int x = sc.nextInt();
        System.out.print("Enter the number y : ");
        int y = sc.nextInt();
        swapping(x, y);
    
    }
}
