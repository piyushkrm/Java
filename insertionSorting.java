import java.util.Scanner;

public class insertionSorting {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void inSorting(int arrarElement[]) {
        // insertion sort
        for (int i = 1; i < arrarElement.length; i++) {
            int current = arrarElement[i];
            int j = i - 1;
            while (j >= 0 && current < arrarElement[j]) {
                arrarElement[j + 1] = arrarElement[j];
                j--;
            }
            // placement
            arrarElement[j + 1] = current;
        }
        System.out.print("After sorting array with Insertion sort like : ");
        printArray(arrarElement);
    }

    public static void deSorting(int arrarElement[]) {
        // insertion sort
        for (int i = 1; i < arrarElement.length; i++) {
            int current = arrarElement[i];
            int j = i - 1;
            while (j >= 0 && current > arrarElement[j]) {
                arrarElement[j + 1] = arrarElement[j];
                j--;
            }
            // placement
            arrarElement[j + 1] = current;
        }
        printArray(arrarElement);
    }

    
// Time complexity = n^2
    public static void main(String[] args) {
        // int array[] = { 7, 8, 3, 1, 2 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        int arrarElement[] = new int[size];
        System.out.println("Enter the element for sorting array with 'Insertion Sorting' :");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + "th element : ");
            arrarElement[i] = sc.nextInt();
        }

        System.out.println("What you need sorting with accending order or decending order ?");
        System.out.println("If sorting with accending order then type '1' and sorting with decending order then type '0' ");
        System.out.print("Enter input 0 and 1 : ");
        int input = sc.nextInt();
        if (input == 1) {
            inSorting(arrarElement);
        } else if (input == 0) {
            deSorting(arrarElement);
        } else {
            System.out.println("Enter valid input!");
        }
    }
}