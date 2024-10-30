public class selectionSorting {


    public static void printArray(int[] array) {
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    
    public static void main(String[] args) {
        System.out.println("Selection sorting algorithm");
        int[] array = {4, 1, 5, 2, 3};
        selectionSort(array);
    }
}
