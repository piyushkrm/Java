
// 3163. String Compression III


public class permutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        int freq[] = {0};

        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();
        for(int i = 0; i < s2.length(); i++) {
            int windowIdx = 0;
            int idx = i;
            int windowFrequency[] = {0};

            while(windowIdx < windowSize && idx < s2.length()) {
                windowFrequency[s2.charAt(idx) - 'a']++;
                windowIdx++;
                idx++;

                if(isFrequency(freq, windowFrequency)) {
                    return true;
                }
                return false;
            }
        }

    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        }
    
}