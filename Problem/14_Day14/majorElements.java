public class majorElements {

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
        return 0;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 1};
        System.out.println("The majority element is: " + findMajorElements(array));
    }
}
