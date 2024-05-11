import java.util.ArrayList;
import java.util.Scanner;

public class RecursionClass3 {
    public static void stringPermutations(String str, String permutations) {
        if (str.length() == 0) {
            System.out.println(permutations);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            stringPermutations(newString, permutations + currentChar);
        }
    }

    public static int countMazePath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == n - 1) {
            return 1;
        }
        // move downpath
        int downPath = countMazePath(i + 1, j, n, m);
        // move right
        int rightPath = countMazePath(i, j + 1, n, m);
        return downPath + rightPath;
    }

    public static int tilesPlacement(int N, int M) {
        if (N == M) {
            return 2;
        }
        if (N < M) {
            return 1;
        }
        // Vertical placement
        int verticalPlacement = tilesPlacement(N - M, M);
        // Horizontal placement
        int horizontalPlacement = tilesPlacement(N - 1, M);
        return verticalPlacement + horizontalPlacement;
    }

    public static int invitePeopleInParty(int peope) {
        if (peope <= 1) {
            return 1;
        }
        // single
        int SingleWay = invitePeopleInParty(peope - 1);
        // pair way
        int PairWay = (peope - 1) * invitePeopleInParty(peope - 2);
        // total ways
        return SingleWay + PairWay;
    }

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = -0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int natNumb, ArrayList<Integer> subset) {
        if (natNumb == 0) {
            printSubset(subset);
            return;
        }
        // add hoga to
        subset.add(natNumb);
        findSubset(natNumb - 1, subset);

        // add nhi hona to
        subset.remove(subset.size() - 1);
        findSubset(natNumb - 1, subset);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1: Print all Permutations of a string");
        System.out.print("Enter the word : ");
        String string = sc.nextLine();
        stringPermutations(string, "");

        System.out.println("Question 2: Count total paths in a maze to move from (0,0) to (n,m.)");
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m : ");
        int m = sc.nextInt();
        int totalPath = countMazePath(0, 0, n, m);
        System.out.println(totalPath);

        System.out.println("Question 3: Place Tiles of size 1 * m in a floor of size n * m");
        System.out.print("Enter n : ");
        int N = sc.nextInt();
        System.out.print("Enter m : ");
        int M = sc.nextInt();
        System.out.println(tilesPlacement(N, M) + " : Tiles required");

        System.out.println(
                "Question 4: Find the number of ways in which you can invite 'n' people to your party.('Single' and '2-Pair' Only)");
        System.out.print("Enter people numbers : ");
        int peope = sc.nextInt();
        System.out.println("Total number of ways are : " + invitePeopleInParty(peope));

        System.out.println("Print all the subset of a first 'n' natural numbers.");
        System.out.print("Enter 'n' natural number : ");
        int natNumb = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(natNumb, subset);
    }
}