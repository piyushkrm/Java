import java.util.Scanner;

public class StringHomeWork {
    public static void main(String[] args) {
        String strr = "12345";
        System.out.println(strr);
        System.out.println(strr.length());
        int number = Integer.parseInt(strr);
        System.out.println(number);
        int numberr = 123456;

        String st = Integer.toString(numberr);
        System.out.println(st);
        System.out.println(st.length());

        System.out.println("HomeWork");
        System.out.println("Question 1");
        System.out.println("Take an array of strings input from the user and find the cumulative (combined length of all those strings.)");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        String names[] = new String[size];
        int totalLength = 0;
        System.out.print("Enter names : ");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
            totalLength += names[i].length();
        }
        System.out.println("Total length of array string is : " + totalLength);

        System.out.println("Question 2");
        System.out.println("Input a string from the user. Create a new string called 'result' in which you will replace the 'e' in the original string with letter 'i'.");
        System.out.print("Enter string : ");
        Scanner scc = new Scanner(System.in);
        String str = scc.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);

        System.out.println("Question 3");
        System.out.println("Input an emaol from the user. You have to create a username from the email by deleting the part that comes after '@'. Display that username to the user.");
        Scanner se = new Scanner(System.in);
        System.out.print("Enter Email Address : ");
        String email = se.next();
        String username = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.println("Your username is : " + username);
    }
}
