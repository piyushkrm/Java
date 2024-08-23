import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput2 {
    public static void main(String[] args) throws IOException {
        
        // Ways to read input from the user
        // There are four ways to take input from the user
        // 1. Using Buffer Reader class
        System.out.print("Enter your name : ");
        BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        String name = Reader.readLine();
        System.out.println("Your name is : "+name);



        // 2. Using scanner class
        // 3. Using console class
        // 4. Using command line argument

    }
}
