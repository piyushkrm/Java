
// Leet code 125 --> Is validPalindrome

public class validPalindrome {

    public static boolean isAlphaNumeric(int c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!isAlphaNumeric(left++)) {
                continue;
            }
            if (!isAlphaNumeric(right--)) {
                continue;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // IsValid Palindrome
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
