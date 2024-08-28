import java.util.Scanner;
public class perimeterOfRectangle {
    public static void calculatePerimeter(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of a rectangle are : "+perimeter);
    }
    public static void main(String[] args) {
        // Find the Perimeter of a Rectangle
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length = sp.nextInt();
        System.out.print("Enter breadth : ");
        int breadth = sp.nextInt();
        calculatePerimeter(length, breadth);
    }
}
