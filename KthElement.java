import java.util.Arrays;

public class KthElement {

    public static void kthEle(int[] array, int k) {
        Arrays.sort(array);
        System.out.println(array[k-1]);
    }
    public static void main(String[] args) {
        System.out.println("K’th Smallest Element in Unsorted Array");
        int[] array = {12, 56, 89, 10, 45, 39, 82, 11, 5, 48, 96};
        int k = 3;
        kthEle(array, k);
    }
}
