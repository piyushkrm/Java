
// LCM  

public class lcm {
    // find hcf
    public static int hcf(int a, int b) {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }

    // lcm find out
    public static int lcmOfTwoNumber(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static void main(String[] args) {
        int a = 15, b = 20;
        System.out.println("LCM of " + a + " and " + b + " is " + lcmOfTwoNumber(a, b));
    }
}
