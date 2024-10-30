import java.util.Arrays;

public class leetcode75 {
    // Sort an array of 0's, 1's and 2's

    // print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Approach 2 
    public static void sortColorsBruteForce(int[] colors) {
        Arrays.sort(colors);
        printArray(colors);
    }

    // Approach 3: Optimal approach
    public static void sortColorsOptimized(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index++] = 0;
        }

        for (int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }

        for (int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }
        printArray(arr);
    }

    // Approach 1: Dutch National Flag Problem
    public static void sortColors(int[] arr) {
        int low = 0; 
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortColors(arr);
        sortColorsBruteForce(arr);
        sortColorsOptimized(arr);

    }
}
