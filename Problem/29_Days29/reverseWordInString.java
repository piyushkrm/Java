
// Reverse word in the string 151

public class reverseWordInString {

    public static String reverseWord(String string) {

        // Split the string into words
        String[] words = string.split("\\s+");
        StringBuilder answer = new StringBuilder();

        // Traverse the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            answer.append(words[i]);
            if (i != 0) {
                answer.append(" ");
            }
        }

        // Convert StringBuilder to String and return
        return answer.toString();
    }

    public static void main(String[] args) {
        String str = "The sky is blue";
        System.out.println(reverseWord(str));
    }
}