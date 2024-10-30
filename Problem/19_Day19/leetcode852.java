public class leetcode852 {
    
    // Lecture 19 of DSA Series - Binary Search Part 3 - Peak Index in Mountain Array | Leet code 852
    public static int peakElementIndex(int[] array) {
        if (array == null || array.length < 3) {
            return -1; // Invalid array, no peak can exist in less than 3 elements
        }
        int st = 1;
        int end = array.length - 2;
        
        while (st <= end) {
            int mid = st + (end - st) / 2;
            
            if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
                return mid;
            } else if (array[mid] < array[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1; // No peak found
    }
    
    public static void main(String[] args) {
        int[] array = {0, 3, 8, 9, 5, 2};
        int peakIndex = peakElementIndex(array);
        System.out.println("Peak Index: " + peakIndex); // Output: 9
    }
}
