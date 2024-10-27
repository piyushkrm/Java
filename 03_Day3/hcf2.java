public class hcf2 {

    public static int findHCF(int a, int b) {
        if (a == 0)
            return b;

        if (b == 0)
            return a;

        if (a == b)
            return a;

        if (a > b)
            return findHCF(a - b, b);
        return findHCF(a, b - a);
    }

    public static int findGCD(int p, int q) {
        if (q == 0) {
            return p;
        }
        return findGCD(q, p%q);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("HCF of " + a + " and " + b + " is : " + findHCF(a, b));
        System.out.println("GCD of " + a + " and " + b + " is : " + findGCD(a, b));

    }
}
