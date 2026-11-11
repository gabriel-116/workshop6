// Exercise 5 (Medium)
// Search engine: search for a phrase inside an array of 10 paragraphs.
// If the phrase is found print the array index and the paragraph,
// otherwise print a message saying it was not found.
public class Exercise5 {

    public static void main(String[] args) {

        String[] paragraphs = new String[10];
        paragraphs[0] = "Lose all the weight you want.";
        paragraphs[1] = "I can't I must work";
        paragraphs[2] = "That would be like a keyword search.";
        paragraphs[3] = "This would be Victoria.";
        paragraphs[4] = "Join the party.";
        paragraphs[5] = "To be or not to be.";
        paragraphs[6] = "That is a question to test keyword search.";
        paragraphs[7] = "Can you find a needle in a hay stack?";
        paragraphs[8] = "This could be the last paragraph, but its not.";
        paragraphs[9] = "Ada Lovelace is the worlds first programmer as of 1860.";

        // the phrase you search for: take it from the command line, otherwise use a default
        String phrase = (args.length > 0) ? args[0] : "keyword search";

        System.out.println("Searching for: \"" + phrase + "\"");

        int found = 0;

        // go through the whole array
        for (int i = 0; i < paragraphs.length; i++) {

            // String.contains() returns true when the paragraph contains the phrase
            // toLowerCase() on both sides makes the search case insensitive
            if (paragraphs[i].toLowerCase().contains(phrase.toLowerCase())) {
                found++;
                System.out.println();
                System.out.println("Found at index: " + i);
                System.out.println("Paragraph: " + paragraphs[i]);
            }
        }

        System.out.println();
        if (found == 0) {
            System.out.println("The phrase \"" + phrase + "\" was NOT found in any paragraph.");
        } else {
            System.out.println("The phrase was found in " + found + " paragraph(s).");
        }
    }
}
