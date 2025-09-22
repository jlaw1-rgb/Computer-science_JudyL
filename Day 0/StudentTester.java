public class StudentTester {
    public static void main (String[] args){
        Student a = new Student("One", 10);
        Student b = new Student("Two", 11);
        Student c = new Student("Three");
        Student d = new Student("Four)");
        a.toString();
        c.toString();
        a.equal(d);
        a.equal(b);
    }
}
