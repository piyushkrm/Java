import java.util.Scanner;

public class QuickSort {

    public static int partition(int array[], int low, int high) {
        // last elemet of an array is pivot
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                // swaping------>empty space to current sammmler pivot
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i; // pivot index
    }

    public static void quickSort(int array[], int low, int high) {
        if (low < high) {
            int pivotidx = partition(array, low, high);

            quickSort(array, low, pivotidx - 1);
            quickSort(array, pivotidx + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        System.out.println("Enter an array :");
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the " + i + "th element of an array : ");
            array[i] = sc.nextInt();
        }

        quickSort(array, 0, size - 1);
        // print
        System.out.println("After sorting array is like : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
