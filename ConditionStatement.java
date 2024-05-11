import java.util.Scanner;

public class ConditionStatement {
    public static void main(String[] args) {
        System.out.println("IF-ELSE\nExample 1");
        Scanner inputage = new Scanner(System.in);
        int input = inputage.nextInt();
        if (input > 18) {
            System.out.println("Age is greater than 18");
        } else {
            System.out.println("Age is less than 18");
        }
        System.out.println("Run successfully");


        
        System.out.println("ODD-EVEN\nExample 2");
        Scanner inputnum = new Scanner(System.in);
        int numb = inputnum.nextInt();
        if (numb % 2 == 0) {
            System.out.println("This number is EVEN!");
        } else {
            System.out.println("This number is ODD!");
        }
        System.out.println("Run successfully!");



        System.out.println("Equal, Greater and Less Comperision\nExample3");
        System.out.println("Enter First Number : ");
        Scanner num = new Scanner(System.in);
        int first = num.nextInt();
        System.out.println("Enter Second Number : ");
        int second = num.nextInt();
        System.out.println("Enter Third Number : ");
        int third = num.nextInt();
        if (first == second && second == third) {
            System.out.println("All numbers are equal!");
        } else if (first == second) {
            System.out.println("First and second number are equal!");
        } else if (first == third) {
            System.out.println("First and third number are equa!");
        } else if (second == third) {
            System.out.println("Second and third number are equal!");
        } else if (first > second && first > third) {
            System.out.println("First number is greater than all entered number!");
        } else if (second > first && second > third) {
            System.out.println("Second number is greater than all entered number!");
        } else {
            System.out.println("Third Number is greater than all entered number!");
        }
        System.out.println("Programm sun successfully!");



        System.out.println("Choosing Numbers\nExample 4");
        System.out.println("Enter number between 1 to 3");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Hello");
        } else if (n == 2) {
            System.out.println("Namaste");
        } else if (n == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid number enterd");
        }

        System.out.println("Switch-Case\nExample 5");
        System.out.println("Enter number!");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        switch (number) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Enter number between 1 to 3 only");
                break;
        }
    }
}
