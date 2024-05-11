import java.util.Scanner;

public class Function {
    public static void myName(String name) {
        System.out.println("Hello, Goood morning " + name);
        return;
    }

    public static int calculateSum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int calculateSubtraction(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public static int calculateMultiplication(int x, int y) {
        int mul = x * y;
        return mul;
    }

    public static int calculateDivision(int x, int y) {
        int div = x / y;
        return div;
    }

    public static int calculateModulus(int x, int y) {
        int mod = x % y;
        return mod;
    }

    public static int factorial(int fact) {
        if (fact < 1) {
            System.out.println("Invalid Input");
            return 1;
        }
        int factorial = 1;
        for (int i = fact; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + fact + " is : " + factorial);
        return factorial;
    }

    public static void main(String[] args) {
        System.out.print("Enter Your Name : ");
        Scanner sc = new Scanner(System.in);
        String na = sc.nextLine();
        myName(na);

        System.out.println("Enter two number and operate some operation : ");
        System.out.print("Enter first Number : ");
        Scanner dc = new Scanner(System.in);
        int x = dc.nextInt();
        System.out.print("Enter second Number : ");
        int y = dc.nextInt();
        System.out.println("Sum of " + x + " and " + y + " is : " + calculateSum(x, y));
        System.out.println("Subtraction of " + x + " and " + y + " is : " + calculateSubtraction(x, y));
        System.out.println("Multiplication of " + x + " and " + y + " is : " + calculateMultiplication(x, y));
        System.out.println("Division of " + x + " and " + y + " is : " + calculateDivision(x, y));
        System.out.println("Modulus of " + x + " and " + y + " is : " + calculateModulus(x, y));

        System.out.print("Enter a number for Calculate factorial : ");
        Scanner se = new Scanner(System.in);
        int fact = se.nextInt();
        factorial(fact);
    }
}
