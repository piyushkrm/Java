public class RecursionClass1 {
    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    public static void printNumber(int m) {
        if (m > 10) {
            return;
        }
        System.out.println(m);
        printNumber(m + 1);
    }

    public static void printNaturalSum(int k, int l, int sum) {
        if (k == l) {
            sum += k;
            System.out.println("Sum of n natural number is : " + sum);
            return;
        }

        sum += k;
        printNaturalSum(k + 1, l, sum);
        System.out.println("Now value of k is : " + k);
    }

    public static int calFact(int f) {
        if (f == 0 || f == 1) {
            return 1;
        }
        int n_m1 = calFact(f - 1);
        int fact_f = f * n_m1;
        return fact_f;
    }

    public static void fibbo(int a, int b, int q) {
        if (q == 0) {
            return;
        }
        int x = a + b;
        System.out.println(x);
        fibbo(b, x, q - 1);
    }

    public static int power(int t, int p) {
        if (t == 1) {
            return 0;
        } else if (p == 0) {
            return 1;
        }
        int xPower = power(t, p-1);
        int total = t * xPower;
        return total;
    }

    public static void main(String[] args) {
        // System.out.println("Question 1: Print the number form 5 to 1 : ");
        // int n = 10;
        // printNum(n);
        // System.out.println("Question 2: Print the number from 1 to 5 : ");
        // int m = 1;
        // printNumber(m);
        // System.out.println("Question 3: Print the sum of first n natural numbers :
        // ");
        // printNaturalSum(0, 10, 0);
        // System.out.println("Question 4: Print the factorial of a number n : ");
        // int o = 5;
        // System.out.println("Factorial of a number 5 is : " + calFact(o) );
        // System.out.println("Question 5: Print the fibonacci sequence till nth term : ");
        // int a = 0, b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // int q = 10;
        // fibbo(a, b, q);

        System.out.println("Question 6: Print the x ^ n (stack height = n)");
        System.out.println(power(5, 4));
    }
}
