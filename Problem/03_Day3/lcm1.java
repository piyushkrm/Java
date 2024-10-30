import java.util.Scanner;

public class lcm1 {

    public static int findLCM(int a, int b) {
        int ans = (a > b) ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0) 
                break;
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();
        System.out.println("LCM of " + a + " and " + b + " : " + findLCM(a, b));
    }
}
