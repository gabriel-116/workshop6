// Exercise 3 (Medium)
// Reverse the sequence of letters in each word of a sentence.
// "To be or not to be."  ->  "oT eb ro ton ot eb."
// Only the letters are reversed; spaces and punctuation stay where they are,
// which is why the full stop stays at the end of the last word.
public class Exercise3 {

    // return a new String with the letters of one word reversed
    public static String reverseWord(String word) {

        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            // skip anything that is not a letter (e.g. the full stop)
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }

            // swap the two letters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {

        String[] sentences = {
                "To be or not to be.",
                "Hello Java World",
                "Never gonna give you up"
        };

        for (String sentence : sentences) {

            // split the sentence into words on every single space
            String[] words = sentence.split(" ");

            StringBuilder result = new StringBuilder();

            // loop over the array of words and reverse each one
            for (int i = 0; i < words.length; i++) {
                result.append(reverseWord(words[i]));
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }

            System.out.println("Original: " + sentence);
            System.out.println("Reversed: " + result);
            System.out.println();
        }
    }
}
