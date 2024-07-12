import java.util.*;
public class class8 {

    public static void find(int[] array) {
        Arrays.sort(array);

        System.out.println("Minimum element in the array is : "+array[0]);
        System.out.println("Maximum element in the array is : "+array[array.length-1]);
    }


    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.print("Minimum element in the array is : ");
        return min;
    }


    public static int getMax(int[] array) {
        int max = array[array.length-1];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.print("Maximum element in the array is : ");
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Find minimum and maximum element of an array");
        int[] array = {10, 15, 20, 19, 115, 100};
        find(array);

        System.out.println(getMin(array));
        System.out.println(getMax(array));
    }
}
