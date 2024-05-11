import java.util.Scanner;

public class bubbleSorting {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sorting(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swaping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("After sorting array with bubble sort like : ");
        printArray(array);
    }

    public static void decendingSorting(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // swaping
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("After sorting array with bubble sort like : ");
        printArray(array);
    }


// Time complexity = n^2
    public static void main(String[] args) {
        // int array[] = { 7, 8, 3, 1, 2 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an element : ");
        int size = sc.nextInt();
        int arrarElement[] = new int[size];
        System.out.println("Enter the element for sorting with 'Bubble Sort' : ");

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
            decendingSorting(arrarElement);
        } else {
            System.out.println("Enter valid input!");
        }
    }
}
