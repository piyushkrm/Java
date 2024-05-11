import java.util.Scanner;

public class selectionSorting {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sorting(int array[]) {
        // int array[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            // swapping
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        System.out.print("After sorting array with bubble sort like : ");
        printArray(array);
    }

    public static void desorting(int array[]) {
        // int array[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] < array[j]) {
                    smallest = j;
                }
            }
            // swapping
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        System.out.print("After sorting array with selection sort like : ");
        printArray(array);
    }


// Time complexity = n^2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        int arrarElement[] = new int[size];
        System.out.println("Enter the element for sorting array with 'Selection Sorting' :");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + "th element : ");
            arrarElement[i] = sc.nextInt();
        }

        System.out.println("What you need sorting with accending order or decending order ?");
        System.out.println("If sorting with accending order then type '1' and sorting with decending order then type '0' ");
        System.out.print("Enter input 0 and 1 : ");
        int input = sc.nextInt();
        if (input == 1) {
            sorting(arrarElement);
        } else if (input == 0) {
            desorting(arrarElement);
        } else {
            System.out.println("Enter valid input!");
        }
    }
}
