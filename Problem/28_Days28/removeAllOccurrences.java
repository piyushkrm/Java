
// Remove All Occurrences of a Substring --> Leet code 1910

public class removeAllOccurrences {

    public static String removeOccurrence(String st, String part) {
        // Continue removing occurrences of 'part' until it no longer exists in 's'
        while (st.contains(part)) {
            st = st.replaceFirst(part, "");
        }
        return st;
    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrence(s, part)); // Output: "dabcbaabcbc"
        
    }
}
