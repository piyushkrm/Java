import java.util.Scanner;

public class checkVovelorConst1 {

    public static void checkChar(char character) {
        character = Character.toLowerCase(character);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.print(character + " is vovel");
        } else {
            System.out.print(character + " is consonant");
        }
    }

    public static void main(String[] args) {
        // Check wheter the character id vovel or consonant
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char character = sc.nextLine().charAt(0);
        checkChar(character);

    }
}
