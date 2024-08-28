import java.util.Scanner;
public class compoundInterest7 {

    public static void compoundInterest(double amount, double rate, double time) {
        double compoundInterest = amount * (Math.pow((1+rate/ 100), time));
        System.out.println(compoundInterest);
    }
    public static void main(String[] args) {
        // calculate compound interest

        Scanner sp =  new Scanner(System.in);
        System.out.print("Enter Amout : ");
        double amount = sp.nextDouble();
        System.out.print("Enter Time : ");
        double time = sp.nextDouble();
        System.out.print("Enter Rate : ");
        double rate = sp.nextDouble();
        compoundInterest(amount, rate, time);
    }
}
