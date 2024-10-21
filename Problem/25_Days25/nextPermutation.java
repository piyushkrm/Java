import java.util.Arrays;

public class nextPermutation {
    // leet code 31 problem

    public static void reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverseArray(nums);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        reverseArray(nums);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next Permutation: " + Arrays.toString(nums));

        int[] nums2 = {3, 2, 1};
        nextPermutation(nums2);
        System.out.println("Next Permutation: " + Arrays.toString(nums2));

        int[] nums3 = {1, 1, 5};
        nextPermutation(nums3);
        System.out.println("Next Permutation: " + Arrays.toString(nums3));
    }
}
