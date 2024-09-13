
public class arraySum {

    // print sum of an array
    public static int printSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // adding each element to the sum
        }
        return sum;
    }

    // find largest element
    public static int findLargestElement(int[] array) {
        int largestElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
        }

        return largestElement;
    }


    // remove duplicates element
    public static void removeDuplicates(int array[]) {
        boolean duplicates = false;

        for (int i = 0; i < array.length; i++) {
            duplicates = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicates = true;
                    break;
                }
            }
            if (duplicates) {
                System.out.print(array[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        // print sum of an array
        int array[] = {10, 56, 56, 45, 2, 15, 499, 53, 49, 120, 78, 78, 59, 12, 2, 12};
        System.out.println("Sum of an array element's are : "+printSum(array));

        // find Largest elemet in the array
        System.out.println("Largest element in the array is : "+findLargestElement(array));

        // remove duplicates from the array
        removeDuplicates(array);
    }
    
}
