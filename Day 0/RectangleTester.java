public class RectangleTester {
    public static void main(String[] agrs) {
        // Declaration: type name
        // Instantiation/initialization = new type

        Rectangle a = new Rectangle(5, 10);
        Rectangle c = new Rectangle(5, 10);

        if (a.equal(c)) {
            System.out.println("They are equal.");
        }   else {
            System.out.println("They are not equal.");
        }

        System.out.println("Testing getWidth: " + a.getWidth());
        System.out.println("Testing getLength: " + a.getLength());
        System.out.println("Testing perimiter calculator: " + a.getPerimeter());
        System.out.println("Dimensions of rectangle 1: Length = "
            + a.getLength() + "Width = " + a.getWidth());
    }


}