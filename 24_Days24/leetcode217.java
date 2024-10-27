import java.util.Arrays;

public class leetcode217 {


    // Given an integer array arr, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public static boolean containsDuplicate(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr)); // Output: true
        System.out.println(containsDuplicate2(arr)); // Output: true
    }
}
