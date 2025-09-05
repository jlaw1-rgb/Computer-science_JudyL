public class RectangleTester {
    public static void main(String[] agrs){
        //Declaration: type name
        //Instantiation/initialization = new type
        Rectangle A = new Rectangle(5, 8);
        System.out.println("Testing getWidth: " + A.getWidth());
        System.out.println("Testing getLength: " + A.getLength());
        System.out.println("Testing perimiter calculator: " + A.calculatePerimeter());
    }

}