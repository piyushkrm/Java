public class class9 {

    public static void reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - i - 1];
        }

        for (int p : reverseArray) {
            System.out.print(p + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Question : Reverse an array element : ");
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(array);
    }
}
