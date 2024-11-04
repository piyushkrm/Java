
// 3163. String Compression III

public class permutationInString {

    public static boolean isFrequency(int[] freq, int[] windowFrequency) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != windowFrequency[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int[] freq = new int[26];
        int[] windowFrequency = new int[26];

        // Fill the frequency array for s1
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        // Initialize the window frequency array for the first window
        for (int i = 0; i < s1.length(); i++) {
            windowFrequency[s2.charAt(i) - 'a']++;
        }

        // Slide the window over s2
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (i > 0) {
                // Update the window by removing the character going out of the window
                // and adding the new character coming into the window
                windowFrequency[s2.charAt(i - 1) - 'a']--;
                windowFrequency[s2.charAt(i + s1.length() - 1) - 'a']++;
            }

            // Check if the current window matches the frequency of s1
            if (isFrequency(freq, windowFrequency)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}