import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class class2 {
    public static void main(String[] args) 
        throws IOException {
        System.out.println("Read input from console : ");
        // METHOD 1\
        // System.out.print("Enter the string : ");
        // Scanner sc = new Scanner(System.in);
        // String sx = sc.nextLine();
        // System.out.println("Your entered string is : "+sx);


        // METHOD 2
        // System.out.print("Enter input : ");
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // String name = reader.readLine();

        // System.out.println("Output is : "+name);


        // METHOD 3
        String namee = System.console().readLine();
        System.out.println(namee);
    }
}
