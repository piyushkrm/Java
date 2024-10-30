import java.util.Scanner;
public class calculateSimpleInterest6 {

    public static void simpleInterest(int amout, int time, int rate) {
        float simpleInterest = (amout * time * rate) / 100;
        System.out.println("Simple Interest = "+simpleInterest);
    }
    public static void main(String[] args) {
        // Find simple interest
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        int amout = sp.nextInt();
        System.out.print("Enter Time : ");
        int time = sp.nextInt();
        System.out.print("Enter Rate : ");
        int rate = sp.nextInt();
        simpleInterest(amout, time, rate);
    }
}
