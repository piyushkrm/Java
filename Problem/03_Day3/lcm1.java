public class lcm1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int ans = (a > b) ? a : b;
        System.out.println(ans);

        while (true) {
            if (ans % a == 0 && ans % b == 0) {
                break;
            }
            ans++;
        }
        System.out.println("LCM of " + a + " and " + b + " : " + ans);
    }
}
