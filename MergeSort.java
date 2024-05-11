import java.util.Scanner;

public class MergeSort {

    public static void divide(int array[], int statingIndex, int endingIndex) {
        if (statingIndex >= endingIndex) {
            return;
        }
        int middle = statingIndex + (endingIndex - statingIndex) / 2;
        divide(array, statingIndex, middle);
        divide(array, middle + 1, endingIndex);

        conquer(array, statingIndex, middle, endingIndex);

    }

    public static void conquer(int array[], int statingIndex, int middle, int endingIndex) {
        int merged[] = new int[endingIndex - statingIndex + 1];
        int index1 = statingIndex;
        int index2 = middle + 1;
        int x = 0;

        while (index1 <= middle && index2 <= endingIndex) {
            if (array[index1] <= array[index2]) {
                merged[x++] = array[index1++];
            } else {
                merged[x++] = array[index2++];
            }
        }

        while (index1 <= middle) {
            merged[x++] = array[index1++];
        }

        while (index2 <= endingIndex) {
            merged[x++] = array[index2++];
        }

        for (int i = 0, j = statingIndex; i < merged.length; i++, j++) {
            array[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + i + " th element of an array : ");
            array[i] = sc.nextInt();
        }
        divide(array, 0, size - 1);
        System.out.print("After sorting the array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
