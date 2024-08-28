import java.util.Scanner;
public class sumOfEvenFiboSeies {
    public static void sumOfEvenFibo(int n) {
        long[] fibnacciSeries = new long[n];

        fibnacciSeries[0] = 0;
        fibnacciSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibnacciSeries[i] = fibnacciSeries[i - 1] + fibnacciSeries[i - 2];
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (fibnacciSeries[i] % 2 == 0) {
                System.out.print(fibnacciSeries[i]+" ");
                sum += fibnacciSeries[i];
            }
        }
        System.out.println();
        System.out.print("Sum of even fibonacci series are : "+sum);
    }

    public static void main(String[] args) {
        // In this program i will solve the probelm ie calculate the sum of even
        // fibonacci series
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter the to calculate the sum of fibonacci series from 0 : ");
        int n = sp.nextInt();
        sumOfEvenFibo(n);
    }
}
