public class leetcode88Problem {

    // merge sort array

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
        
        while (i < m) {
            temp[k++] = nums1[i++];
        }
        
        while (j < n) {
            temp[k++] = nums2[j++];
        }
        
        for (i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }
    public static void main(String[] args) {

        
    }
}
