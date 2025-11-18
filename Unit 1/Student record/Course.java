public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String list = "";
        for (int i = 0; i <= enrolledStudents.length; i++)
            list = list + i + ".) " + enrolledStudents[i].toString();
        return "== Computer Science ==\n" + list;
    }

    public String findBestStudent() {
        StudentRecord student = enrolledStudents[0];
        double best = student.getFinalAverage();
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() > best) {
                student = enrolledStudents[i];
            }
        }
        return "" + student.getName();
    }

    public double calculateTestAverage(int number) {
        double sum = 0;
        for (int i = 0; i <= enrolledStudents.length; i++) {
            sum = sum + enrolledStudents[i].getTestScore(number);
        }
        return (double) sum / enrolledStudents.length;
    }

}