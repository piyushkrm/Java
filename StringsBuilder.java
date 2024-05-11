import java.util.Scanner;

public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Piyush");
        System.out.println(sb.append(" mishra"));

        System.out.println(sb.charAt(5));

        sb.setCharAt(5, 'u');
        System.out.println(sb);

        sb.insert(0, "Mr.");
        System.out.println(sb);

        sb.delete(0, 3);
        System.out.println(sb);

        System.out.println(sb.length());

        System.out.println("QUESTION 1");
        System.out.println("Reverse string problem");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String reverse = sc.nextLine();
        String newString = "";

        for (int i = reverse.length() - 1; i >= 0; i--) {
            newString += reverse.charAt(i);
        }
        System.out.println(newString);

        // SAME QUESTION BUT ANOTHER METHOD FOR SOLVE THIS QUESTION
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter string : ");
        StringBuilder reversee = new StringBuilder(sr.nextLine());
        for (int i = 0; i < reversee.length() / 2; i++) {
            int front = i;
            int back = reversee.length() - 1 - i;

            char frontChar = reversee.charAt(front);
            char backChar = reversee.charAt(back);

            reversee.setCharAt(front, backChar);
            reversee.setCharAt(back, frontChar);
        }
        System.out.println(reversee);
    }
}
