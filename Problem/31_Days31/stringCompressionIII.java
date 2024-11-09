
// 3163. String Compression III
// Given a string word, compress it using the following algorithm:

// Begin with an empty string comp. While word is not empty, use the following operation:
// Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
// Append the length of the prefix followed by c to comp.
// Return the string comp.

public class stringCompressionIII {

    public static String compressString(String word) {
        StringBuilder compare = new StringBuilder();    // Use StringBuilder for efficient string manipulation
        int n = word.length();
        if (n == 0) return "";     // Return empty string if input is empty

        for (int  i = 0; i < n;) {
            char ch = word.charAt(i);
            int count = 0;

            // Count the maximum prefix of `ch` up to 9
            while (i < n && word.charAt(i) == ch && count < 9) {
                i++;
                count++;
            }

            // Append compressed result to `compare`
            compare.append(count).append(ch);
        }

        return compare.toString();      // Convert StringBuilder to String before returning
    }

    public static void main(String[] args) {
        // Test cases
        String word1 = "abcde";
        String word2 = "aaaaaaaaaaaaaabb";

        // Call the function
        System.out.println("The compress string are : "+ compressString(word1));
        System.out.println("The compress string are : "+ compressString(word2));
        
    }
}
