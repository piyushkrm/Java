public class findPeakEleNeg {

    public static int findPeak(int[] array) {
        int length = array.length;

        if (length == 1) {
            return 0;
        }

        if (array[0] >= array[1]) {
            return 0;
        }

        if (array[length - 1] >= array[length - 2]) {
            return length - 1;
        }

        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Find a peak element of its neighbour");
        int[] array = { 10, 20, 30, 40, 90, 10 };
        int index = findPeak(array);
        System.out.println("Index of peek element is : " + index);
    }
}
