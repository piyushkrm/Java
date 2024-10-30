
import java.util.Scanner;

public class searchInsertPosition {

    // search insert position
    public static int insertIndex(int array[], int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // return the position where target should be inserted to maintain sorted array
    }

    // input an array from an user
    
    public static int inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Enter target to print the elements
        System.out.print("Enter the target element to search: ");
        int target = scanner.nextInt();
        // function calling
        return insertIndex(array, target);
    }

    public static void main(String[] args) {
        // calling the function to input array and target element
        int index = inputArray();
        System.out.println("The index of the target element in the array is: " + index);
    }
}
