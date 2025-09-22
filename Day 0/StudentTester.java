public class StudentTester {
    public static void main(String[] args) {
        Student a = new Student("One", 10);
        Student b = new Student("Two", 11);
        Student c = new Student("Three");
        Student d = new Student("Four)");
        System.out.println(c.toString());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(d.toString());
        System.out.println(c.equals(d));
        System.out.println(a.equal(b));
    }
}
