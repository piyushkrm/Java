public class leetcode238 {

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        // Initialize the result array to 1 as the starting product value
        result[0] = 1;

        // First pass: Calculate the prefix product for each element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Initialize suffix to 1
        int suffix = 1;

        // Second pass: Calculate the suffix product for each element and multiply it
        // with the current result
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] result = productExceptSelf(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
