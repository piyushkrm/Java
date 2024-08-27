import java.util.Scanner;

public class leepYear3 {
    public static boolean findLeepYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
        //  now we will check the year is leep year or not

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        System.out.println(findLeepYear(year));
    }
}
