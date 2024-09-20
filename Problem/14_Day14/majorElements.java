import java.util.Arrays;

public class majorElements {

    // brute force approach
    public static int findMajorElements(int[] nums) {
        int n = nums.length;

        for (int val : nums) {
            int freq = 0;
            for (int ele : nums) {
                if (ele == val) {
                    freq++;
                }
                if (freq > n / 2) {
                    return val;
                }
            }
        }
        return -1;
    }

    // optimized way to find the major element
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;
        int freq = 1;
        int ans = nums[0];

        // sort the array
        Arrays.sort(nums);

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i-1]) {
                freq++;
            } else {
                freq = 1;
                ans = nums[i];
            }
            if (freq > n / 2) {
                return ans;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 1, 2, 2, 2};
        // System.out.println("The majority element is: " + findMajorElements(array));
        System.out.println("The majority element is: " + findMajorityElement(array));
    }
}
