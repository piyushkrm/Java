import java.util.Scanner;

public class printingarightangledtrianglestarpattern3 {
    public static void print(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //  printing a right-angled triangle star pattern
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter the value of height : ");
        int x = sp.nextInt();
        print(x);
    }
}
