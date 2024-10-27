import java.util.Scanner;

public class sumofFibo4 {
    public static void sumofFibo(int num) {
        long[] fibo = new long[num];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < num; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        long sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print(fibo[i] + " ");
            sum += fibo[i];
        }
        System.out.println();
        System.out.println("Sum of fibonacci series are : " + sum);
    }

    public static void main(String[] args) {
        // sum of fibnacci series
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate fibonacci from 0 : ");
        int num = sc.nextInt();
        sumofFibo(num);
    }
}
