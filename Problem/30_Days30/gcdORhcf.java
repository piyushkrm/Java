
// GCD and HCF

public class gcdORhcf {

    // Function to find GCD
    public static int gcd(int x, int y) {
        if (x == 0) return y;
        if (y == 0) return x;
        if (x == y) return x;

        int gcd = 1;
        for (int i = 1; i < Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 28;
        System.out.println("GCD of " + x + " and " + y + " is: " + gcd(x, y));
    }

}