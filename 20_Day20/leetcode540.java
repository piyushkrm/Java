public class leetcode540 {

    // Lecture 20 of DSA Series - Binary Search Part 4 - Single Element in Sorted
    // Array | Leet code 540
    public static int singleNonDuplicate(int[] num) {
        int n = num.length;
        int start = 0;
        int end = n - 1;

        if (n == 1)
            return num[0];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((mid == 0 || num[mid - 1] != num[mid] )&& (mid == n - 1 || num[mid] != num[mid + 1])) {
                return num[mid];
            }  

            if (mid % 2 == 0) { // for even numbers of array element
                if (num[mid] == num[mid + 1]) { // right side searching
                    start = mid + 2;
                } else { // left side searching
                    end = mid - 1;
                }

            } else { // for odd numbers of array element
                if (num[mid] == num[mid - 1]) { // right side searching
                    start = mid + 1;

                } else { // left side searching
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println("Single non duplicate element are : "+singleNonDuplicate(num)); // Output: 2
        int[] num1 = {3, 3, 7, 7, 10, 11, 11};
        System.out.println("Single non duplicate element are : "+singleNonDuplicate(num1)); // Output: 10
    }
}
