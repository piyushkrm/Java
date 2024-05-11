import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // string declaration
        String name = "piyush";
        String lastName = "Mishra";
        String gmail = "piyushkuma045@gmail.com";

        // take input string from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String Name = sc.nextLine();
        System.out.print("Your name is : " + Name +"\nYour email address is : "+gmail);

        // concatenation
        System.out.print("After Concatenation : ");
        String fullName = name + " " + lastName;
        System.out.println(fullName);
        System.out.println("Length of string is : " + fullName.length());

        // print characters in string with charAt method
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // comparision
        // s1 > s2 : +ve values
        // s1 < s2 : -ve values
        // s1 == s2 : 0
        if (name.compareTo(lastName) == 0) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }

        // with ==
        if (name == lastName) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }

        // == fail
        if (new String("piyush") == new String("piyush")) {
            System.out.println("String are equal!");
        } else {
            System.out.println("String are not equal!");
        }

        // substring
        String sen = "I am coder!";
        String coder = sen.substring(4, sen.length());
        System.out.println(coder);
    }
}
