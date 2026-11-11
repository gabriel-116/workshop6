// Exercise 6 (Easy) - runs the code given in the worksheet so the output can be checked.
// a) class variables   : x (declared static)
// b) instance variables: y (no static)
public class Exercise6 {

    public static void main(String[] args) {

        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();

        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;

        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
    }
}
