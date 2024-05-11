import java.util.Scanner;

public class Question4 {
    public static void cirumference(int radius) {
        radius = 2 * radius;
        double radi = radius * 3.14;
        System.out.println("Circumference of a circle is : " + radi);
    }

    public static void main(String[] args) {
        System.out.println("Question 4");
        System.out.println(
                "Write a function that takes in the radius as input and returns the cirumference of a circle : ");
        System.out.print("Enter the radius : ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        cirumference(radius);
    }
}
