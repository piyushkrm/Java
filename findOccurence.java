public class findOccurence {

    public static void occure(int[] array, int occur) {
        System.out.println("Index of occur element is : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == occur) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Find occurence of an element in the array");
        int[] array = { 12, 56, 89, 10, 12, 39, 82, 11, 5, 48, 12, 12, 12 };
        int element = 12;
        occure(array, element);
    }
}
