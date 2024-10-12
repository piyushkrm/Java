public class leetcode704 {


    public static int searchTarget(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            }

            else if (array[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;  // search in the left half of the array to find the target element.
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
