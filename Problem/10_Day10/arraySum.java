
public class arraySum {

    // print sum of an array
    public static int printSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // adding each element to the sum
        }
        return sum;
    }
    public static void main(String[] args) {
        // print sum of an array
        int array[] = {10, 56, 100, 78, 59, 12};
        System.out.println("Sum of an array element's are : "+printSum(array));
    }
    
}
