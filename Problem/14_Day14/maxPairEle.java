
public class maxPairEle {

    // Brute force approach
    public static int[] maxPair(int[] array, int target) {
        int n = array.length;
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == target) {
                    ans[0] = array[i];
                    ans[1] = array[j];
                    return ans;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = { 1, 4, 2, 9, 5, 7, 3 };
        int target = 10;
        int[] result = maxPair(array, target);
        if (result != null) {
            System.out.println("Maximum pair sum: " + result[0] + " + " + result[1] + " = " + target);
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}