import java.util.Scanner;

public class findFibonacci3 {

    public static void calFibo(int num) {
        long[] fibo = new long[num];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < num; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        System.out.print("Fibonacci series : ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibo[i]+" ");
        }
    }

    public static void main(String[] args) {
        // Find fibonacci series

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate fibonacci : ");
        int num = sc.nextInt();
        calFibo(num);
    }
}
