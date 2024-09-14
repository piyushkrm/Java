public class searchInsertPosition {

    // search insert position
    public static int insertIndex(int[] array, int target) {
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
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int target = 15;
        int index = insertIndex(array, target);
        System.out.println("Index of " + target + " is: " + index);
    }
}
