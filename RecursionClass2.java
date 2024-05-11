import java.util.HashSet;
import java.util.Scanner;

public class RecursionClass2 {
    public static void towerOfHenoi(int n, String Source, String Helper, String Destination) {
        if (n == 1) {
            System.out.println("Transfered disk " + n + " from " + Source + " to " + Destination);
            return;
        }
        towerOfHenoi(n - 1, Helper, Destination, Helper);
        System.out.println("Transfered disk " + n + " from " + Source + " to " + Destination);
        towerOfHenoi(n - 1, Helper, Source, Destination);
    }

    public static void reverseString(String str, int idx) {
        if (idx < 0) {
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx - 1);
    }

    public static void firstMiddLastChar(String st, int id) {
        if (id > st.length() + 1) {
            return;
        } else if (id == st.length() - 1) {
            System.out.println("Last character of you string is : " + st.charAt(id));
        } else if (id == st.length() / 2) {
            System.out.println("Middle character of your string : " + st.charAt(id));
        } else if (id == 0) {
            System.out.println("First character of your string is : " + st.charAt(id));
        }
        firstMiddLastChar(st, id + 1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void occurence(String stri, char element, int ind) {
        if (ind == stri.length()) {
            System.out.println("First occurence of your string at : " + first);
            System.out.println("Last occurence of your string at : " + last);
            return;
        }
        char currentChar = stri.charAt(ind);
        if (currentChar == element) {
            if (first == -1) {
                first = ind;
            } else {
                last = ind;
            }
        }
        occurence(stri, element, ind + 1);
    }

    public static boolean checkSortingArray(int array[], int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] < array[index + 1]) {
            return checkSortingArray(array, index + 1);
        } else {
            return false;
        }
    }

    public static String moveString = "";
    public static String moveString2 = "";

    public static void moveString(String sx, char ele, int ide) {
        if (ide == sx.length() - 1) {
            System.out.println(moveString2 + moveString);
            return;
        }
        if (sx.charAt(ide) == ele) {
            moveString += sx.charAt(ide);
        } else {
            moveString2 += sx.charAt(ide);
        }
        moveString(sx, ele, ide + 1);

    }

    public static void moveAllString(String sd, int idxx, int count, String newString) {
        if (idxx == sd.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar = sd.charAt(idxx);
        if (currentChar == 'x') {
            count++;
            moveAllString(sd, idxx + 1, count, newString);
        } else {
            newString += currentChar;
            moveAllString(sd, idxx + 1, count, newString);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicateChar(String stre, int ined, String NewString) {
        if (ined == stre.length()) {
            System.out.println(NewString);
            return;
        }
        char currentCharacter = stre.charAt(ined);
        if (map[currentCharacter - 'a']) {
            removeDuplicateChar(stre, ined + 1, NewString);
        } else {
            NewString += currentCharacter;
            map[currentCharacter - 'a'] = true;
            removeDuplicateChar(stre, ined + 1, NewString);
        }
    }

    public static void subSequences(String Str, int Index, String Newstring) {
        if (Index == Str.length()) {
            System.out.println(Newstring);
            return;
        }

        char Currentchar = Str.charAt(Index);

        subSequences(Str, Index + 1, Newstring + Currentchar);
        subSequences(Str, Index + 1, Newstring);
    }

    public static void subUniqueSequences(String Str, int Index, String Newstring, HashSet<String> set) {
        if (Index == Str.length()) {
            if (set.contains(Newstring)) {
                return;
            } else {
                System.out.println(Newstring);
                set.add(Newstring);
                return;
            }
        }

        char Currentchar = Str.charAt(Index);

        subUniqueSequences(Str, Index + 1, Newstring + Currentchar, set);
        subUniqueSequences(Str, Index + 1, Newstring, set);
    }

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void keypadCombination(String STRING, int IND, String combination) {
        if (IND == STRING.length()) {
            System.out.println(combination);
            return;
        }
        char curChar = STRING.charAt(IND);
        String mapping = keypad[curChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            keypadCombination(STRING, IND + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Question 1: Tower of HENOI : ");
        System.out.print("Enter the number of Disks on the Tower : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHenoi(n, "Source", "Helper", "Destination");

        System.out.println("Question 2: Print string in reverse : ");
        System.out.print("Enter string : ");
        Scanner xc = new Scanner(System.in);
        String str = xc.nextLine();
        int idx = str.length() - 1;
        System.out.print("After reversing the string : ");
        reverseString(str, idx);

        System.out.println("Question 3: Find the 1st, Middle and last character of an element in string : ");
        System.out.print("Enter string : ");
        Scanner xz = new Scanner(System.in);
        String st = xz.nextLine();
        int ix = st.length();
        int id = ix - st.length();
        firstMiddLastChar(st, id);

        System.out.println("Question 4: Find the 1st and last occurance of an element in string : ");
        Scanner zl = new Scanner(System.in);
        System.out.print("Enter string : ");
        String sti = zl.nextLine();
        System.out.print("Enter element for occurence : ");
        char element = xz.next().charAt(0);
        int ind = 0;
        occurence(sti, element, ind);

        System.out.println("Question 5: Check if an array is sorted (Sorted Increasily)");
        Scanner tx = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int sizeofarray = tx.nextInt();
        int array[] = new int[sizeofarray];
        System.out.println("Enter element : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + i + " element : ");
            array[i] = tx.nextInt();
        }
        System.out.println(checkSortingArray(array, 0));

        System.out.println("Question 6: Move a character to the end of the string : ");
        Scanner tr = new Scanner(System.in);
        System.out.print("Enter String : ");
        String sxz = tr.nextLine();
        System.out.print("Enter a character of the string for move to the end of the string : ");
        char ele = tr.nextLine().charAt(0);
        moveString(sxz, ele, 0);

        // ANOTHER METHOD FOR SAME QUESTION
        moveAllString(sxz, 0, 0, "");

        System.out.println("Question 7: Remove duplicate character in a string : ");
        Scanner pl = new Scanner(System.in);
        String dupStr = pl.nextLine();
        removeDuplicateChar(dupStr, 0, "");

        System.out.println("Question 8: Print all the subsequences of a string : ");
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String STR = sa.nextLine();
        subSequences(STR, 0, "");

        System.out.println("Question 8: Print all the subsequences of a string : ");
        Scanner saa = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String STRI = saa.nextLine();
        HashSet<String> set = new HashSet<>();
        subUniqueSequences(STRI, 0, "", set);

        System.out.println("Print the keypad combination : ");
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter String : ");
        String ST = sr.nextLine();
        keypadCombination(ST, 0, "");
    }
}
