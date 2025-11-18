public class CourseTester {
    public static void main(String[] args) {
        int [] scores = {75, 80, 85};
        int [] scores1 = {90, 85, 80};
        int [] scores2 = {95, 90, 85};
        StudentRecord stu1 = new StudentRecord("Frank Black", scores);
        StudentRecord stu2 = new StudentRecord("Grace Hall", scores1);
        StudentRecord stu3 = new StudentRecord("Hellen King", scores2);
        StudentRecord [] enrolled = {stu1, stu2, stu3};
        Course english = new Course("English", enrolled);
        System.out.println("\n\n" + english.calculateTestAverage(1));

        int [] newScore = {80, 90, 100, 95};
        StudentRecord stu = new StudentRecord("John Doe", newScore);
        System.out.println(stu.getTestScore(3));
    }
}
