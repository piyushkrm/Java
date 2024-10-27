
// Container with most water problem --> Leetcode 11

public class leetcode11 {

    // Brute force approach

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

    // Optimal solution with two pointer approach
    public static int maxWaterOptimized(int container[]) {
        int n = container.length;
        int maxAreaWater = 0;
        int leftPointer = 0;
        int rightPointer = n - 1;

        while(leftPointer < rightPointer) {
            int containerWidth = rightPointer - leftPointer;
            int containerHeight = Math.min(container[leftPointer], container[rightPointer]);
            int area = containerWidth * containerHeight;
            maxAreaWater = Math.max(maxAreaWater, area);
            // Move the pointer associated with the smaller height
            if (container[leftPointer] < container[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxAreaWater;
    }

    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxWater(heights);
        System.out.println("Maximum water that can be stored: " + result);
        
        // Test the optimized solution
        int ans = maxWaterOptimized(heights);
        System.out.println("Maximum water that can be stored (optimized): " + ans);
    }
}
