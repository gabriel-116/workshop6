// Exercise 7 (Medium)
// Class 2 of 2: Driver - contains main() and makes calls to the Boxes class.
public class Driver {

    public static void main(String[] args) {

        // a box of size 5
        Boxes box5 = new Boxes(5);
        System.out.println("Box size: " + box5);    // toString() is called automatically
        box5.draw();

        System.out.println();

        // a box of size 8
        Boxes box8 = new Boxes(8);
        System.out.println("Box size: " + box8);
        box8.draw();

        System.out.println();

        // the size of the box can be changed with the setter
        Boxes box10 = new Boxes(20);                // asked for 20, limited to the maximum 10
        System.out.println("Asked for 20, box size: " + box10);
        box10.draw();

        System.out.println();

        box10.setSize(3);
        System.out.println("After setSize(3), box size: " + box10);
        box10.draw();

        System.out.println();

        // extension: unicode lines
        Boxes box4 = new Boxes(4);
        System.out.println("Unicode box size: " + box4);
        box4.drawWithUnicode();
    }
}
