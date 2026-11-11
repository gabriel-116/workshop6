// Exercise 7 (Medium)
// Class 1 of 2: Boxes - displays a square box of a given size on the console.
// Maximum size is 10, minimum is 1.
public class Boxes {

    // constant for the biggest box that can be drawn
    public static final int MAX_SIZE = 10;
    public static final int MIN_SIZE = 1;

    // the size of this box, only this class may change it
    private int size;

    // constructor: accepts the size of the box
    public Boxes(int size) {
        setSize(size);      // go through the setter so the size is checked
    }

    // setter: sets the size of the box, keeps it between 1 and 10
    public void setSize(int size) {
        if (size > MAX_SIZE) {
            this.size = MAX_SIZE;
        } else if (size < MIN_SIZE) {
            this.size = MIN_SIZE;
        } else {
            this.size = size;
        }
    }

    // getter, used when the size is needed outside the class
    public int getSize() {
        return size;
    }

    // toString(): returns the size of the box as a String, for example "10 x 10"
    @Override
    public String toString() {
        return size + " x " + size;
    }

    // draw the box on the console
    public void draw() {

        // '-' for the top and the bottom, '|' for the left and the right side
        String line = "-".repeat(size);

        // top edge
        System.out.println(line);

        // middle rows: '|' + spaces + '|'
        for (int row = 0; row < size - 2; row++) {
            System.out.println("|" + " ".repeat(size - 2) + "|");
        }

        // bottom edge (a box of size 1 has only one line)
        if (size > 1) {
            System.out.println(line);
        }
    }

    // Extension version: use the unicode character \u2500 for a longer looking line
    public void drawWithUnicode() {

        String line = "\u2500".repeat(size * 2);

        System.out.println(line);
        for (int row = 0; row < size - 2; row++) {
            System.out.println("\u2502" + " ".repeat(size * 2 - 2) + "\u2502");
        }
        if (size > 1) {
            System.out.println(line);
        }
    }
}
