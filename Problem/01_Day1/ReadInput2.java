import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInput2 {
    public static void main(String[] args) throws IOException {
        
        // Ways to read input from the user
        // There are four ways to take input from the user
        // 1. Using Buffer Reader class
        System.out.print("Enter your name : ");
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String name = Reader.readLine();
        System.out.println("Good morning "+name);



        // 2. Using scanner class
        System.out.print("Enter your good name : ");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        System.out.println("Good afternoon "+name1);

        
        // 3. Using console class
        System.out.print("Enter your good name :");
        String name2 = System.console().readLine();
        System.out.println("Good evening "+name2);

        
        // 4. Using command line argument
        System.out.print("Enter your name : ");
        if (args.length > 0) {
            System.out.println("The command line arguments are : ");

            for (String val : args)
            System.out.println(val);
        }
        else
        System.out.println("No command line argument "+"arguments found.");

    }
}
