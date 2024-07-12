public class SortingBubble {

    public static void bubbleSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
        }

        for (int arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Bubble sorting technique");
        int array[] = { 12, 56, 89, 10, 45, 39, 82, 11, 5, 48, 96 };
        bubbleSorting(array);
    }
}
