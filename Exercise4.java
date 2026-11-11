// Exercise 4 (Easy)
// Decode the coded message "G tgsl Qefe." with the key table given in the worksheet
// (a -> c, b -> r and so on). Every coded character is looked up in the table and
// replaced by the matching character; characters that are not in the table
// (spaces, the full stop) are printed unchanged.
public class Exercise4 {

    // the message you want to decode - change this line to decode another message
    public static final String CODED_MESSAGE = "G tgsl Qefe.";

    // the key: codeChar[i] decodes to plainChar[i]
    // NOTE: the worksheet's table is not printed in the document, so only the pairs
    // needed for this message are filled in. Add the rest of the 26 pairs from the
    // table into these two arrays and the program will decode any message.
    // The letter pairs must match exactly, capitals are separate entries.
    public static final char[] CODE_CHARS = {
            'G', 't', 'g', 's', 'l', 'Q', 'e', 'f'
    };

    public static final char[] PLAIN_CHARS = {
            'I', 'l', 'o', 'v', 'e', 'J', 'a', 'v'
    };

    // decode one character using the key table
    public static char decodeChar(char code) {

        for (int i = 0; i < CODE_CHARS.length; i++) {
            if (CODE_CHARS[i] == code) {
                return PLAIN_CHARS[i];
            }
        }
        // not in the table: keep the character as it is
        return code;
    }

    public static void main(String[] args) {

        StringBuilder decoded = new StringBuilder();

        // loop over every character of the coded message
        for (int i = 0; i < CODED_MESSAGE.length(); i++) {
            decoded.append(decodeChar(CODED_MESSAGE.charAt(i)));
        }

        System.out.println("Coded message:   " + CODED_MESSAGE);
        System.out.println("Decoded message: " + decoded);
    }
}
