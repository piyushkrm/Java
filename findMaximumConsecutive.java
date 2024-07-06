public class findMaximumConsecutive {
        public static int maximumConsecutive(int[] nums) {
            int n = 1;
            int max = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    n++;
                } else {
                    n = 1;
                }
                max = Math.max(max, n);
            }
            if (n > 0) {
                max = Math.max(max, n);
            }
            return max;
        }
    
        public static void main(String[] args) {
            int[] nums = { 1, 0, 1, 1, 1, 1, 0, 0, 0, 1 };
            int a = maximumConsecutive(nums);
            System.out.println(a);
        }
    }
    