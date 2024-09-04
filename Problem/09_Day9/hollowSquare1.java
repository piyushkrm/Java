
public class hollowSquare1 {

    public static void print(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Hollow square with streaks
        int n = 10;
        print(n);
    }
}
