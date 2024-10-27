public class insertionSorting {


    public static void printArray(int[] array) {
        for  (int ele : array) {
            System.out.print(ele + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        System.out.println("Insertion sorting");
        int[] array = {4, 1, 5, 2, 3};
        insertionSort(array);
    }
}
