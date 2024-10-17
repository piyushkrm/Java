
public class bubbleSort {


    public static void printArray(int[] array) {
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }

    // Approach 1 --> Brute Force Approach
    public static void bubbleSorting(int[] array) {
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }   
        printArray(array);
    }


    public static void main(String[] args) {
        int[] array = {4, 1, 5, 2, 3};
        bubbleSorting(array);  // call the bubbleSorting method
    }
    
}
