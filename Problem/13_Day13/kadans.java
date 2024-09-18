

public class kadans {


    public static void maxSubArray(int array[]) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for  (int val : array) {
            currentSum += val;
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("Maximum contiguous sum is " + maxSum);
    }

    public static void main(String[] args) {

        int[] array = {3, -4, 5, 4, -1, 7, -8};
        maxSubArray(array);
        
    }
}