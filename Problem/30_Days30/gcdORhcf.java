
// GCD and HCF

public class gcdORhcf {

    // Function to find GCD
    public static int gcd(int x, int y) {
        if (x == 0)
            return y;
        if (y == 0)
            return x;
        if (x == y)
            return x;

        int gcd = 1;
        for (int i = 1; i < Math.min(x, y); i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Optimal approach to find the HCF and GCD values using Euclidean Algorithm
    public static int gcdOptimalApproach(int x, int y) {
        while (x > 0 && y > 0) {
            if (x > y) {
                // x -= y;
                x %= y;
            } else {
                // y -= x;
                y %= x;
            }
        }
        return x + y;
    }

    // Euclidean Algorithm using recursion
    public static int gcdRecursive(int x, int y) {
        if (y == 0)
            return x;
        return gcdRecursive(y, x % y);
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 28;
        System.out.println("GCD of " + x + " and " + y + " is: " + gcd(x, y));
        System.out.println("HCF of " + x + " and " + y + " is: " + gcdOptimalApproach(x, y));
        System.out.println("GCD of " + x + " and " + y + " using recursion is: " + gcdRecursive(x, y));
    }

}