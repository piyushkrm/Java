public class singleElement1 {


    public static int singleEle(int[] arrays) {
        int result = 0;

        for (int val : arrays) {
            result ^= val;  // XOR operation to find the unique element
        }
        return result;
    }
    public static void main(String[] args) {
        // single element problem
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        System.out.println("Single element in the array: " + singleEle(array));
    }
}
