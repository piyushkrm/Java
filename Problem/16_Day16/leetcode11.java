
// Container with most water problem --> Leetcode 11

public class leetcode11 {

    public static int maxWater(int container[]) {
        int n = container.length;
        int maxAreaWater = 0;

        for (int left = 0; left < n; left++) {
            for (int right = left + 1; right < n; right++) {
                int width = right - left;
                int height = Math.min(container[left], container[right]);
                int area = width * height;
                maxAreaWater = Math.max(maxAreaWater, area);
            }
        }
        return maxAreaWater;
    }

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxWater(heights);
        System.out.println("Maximum water that can be stored: " + result);
        
    }
}
