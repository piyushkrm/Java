import java.util.Arrays;

public class arrayDuplicate {

    public static int duplicate(int[] element) {
        int j = 1;
        for (int i = 1; i < element.length; i++) {
            if (element[i] != element[i-1]) {
                element[j] = element[i];
                j++;
            } else {
                continue;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] element = {1, 2, 2, 2, 3};
        int newLength = duplicate(element);
        int[] newArray = Arrays.copyOf(element, newLength);
        System.out.println(Arrays.toString(newArray));
    }
}
