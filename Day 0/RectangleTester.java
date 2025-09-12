public class RectangleTester {
    public static void main(String[] agrs) {
        //Declaration: type name
        //Instantiation/initialization = new type
        Rectangle a = new Rectangle(5, 8);
        System.out.println("Testing getWidth: " + a.getWidth());
        System.out.println("Testing getLength: " + a.getLength());
        System.out.println("Testing perimiter calculator: " + a.calculatePerimeter());
    }

}