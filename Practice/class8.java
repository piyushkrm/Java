import java.util.*;
public class class8 {

    public static void find(int[] array) {
        Arrays.sort(array);

        System.out.println("Minimum element in the array is : "+array[0]);
        System.out.println("Maximum element in the array is : "+array[array.length-1]);
    }
    public static void main(String[] args) {
        System.out.println("Find minimum and maximum element of an array");
        int[] array = {10, 15, 20, 19, 115, 100};
        find(array);
    }
}
