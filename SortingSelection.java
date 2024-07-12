public class SortingSelection {

    public static void selectionSorting(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minId]) {
                    minId = j;
                }
            }
            int temp = array[minId];
            array[minId] = array[i];
            array[i] = temp;
        }

        for (int t : array) {
            System.out.print(t + " ");
        }

        // swaping
    }

    public static void main(String[] args) {
        System.out.println("Selection sorting techinque");
        int[] array = { 12, 56, 89, 10, 45, 39, 82, 11, 5, 48, 96 };
        selectionSorting(array);
    }
}
