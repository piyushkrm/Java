

public class printSubArray1 {
    // Function to print subarray of array

    public static void printSubArray(int[] array) {

        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Print sub array of array

        int[] array = {10, 15, 20};
        printSubArray(array);
    }
}
