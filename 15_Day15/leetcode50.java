public class leetcode50 {

    // Implement pow(x, n) which calculates x raised to the power of n (ie xn).

    public static double pow(double x, int  n) {

        // handle negative exponents
        if (n == 0) return 1.0;
        if ( x == 0) return 0.0;
        if ( x == 1) return 1.0;
        if ( x == -1 && n % 2 == 0) return 1.0;
        if (x == -1 && n % 2 != 1) return -1.0;


        long binaryForm = n;
        double ans = 1.0;

        while (binaryForm > 0) {
            if (binaryForm % 2 == 1) {
                ans *= x;
            }
            x *= x;
            binaryForm /= 2;
        }


        return ans;
    }
    public static void main(String[] args) {
        // calling function
        System.out.println(pow(2, 10)); // returns 1024.0
        System.out.println(pow(2, -2)); // returns 0.25
        System.out.println(pow(0, 10)); // returns 0.0
        System.out.println(pow(2, 0)); // returns 1.0
        System.out.println(pow(-2, 3)); // returns -8.0
        System.out.println(pow(-2, -3)); // returns 0.125
    }
}
