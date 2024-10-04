public class leetcode33 {

    // leet code problem33 ---> Search target in the reverse sorted array

    public static int search(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == array[mid]) {
                return mid;
            }

            // left sorted
            if (array[start] <= array[mid]) {
                if (array[start] <= target && target <= array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } // right sorted
            else {
                if (array[mid] <= target && target <= array[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = search(array, target);
        System.out.println("Index of target: " + result);
    }
}
