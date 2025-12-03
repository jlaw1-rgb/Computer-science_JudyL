public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.enrolledStudents = new StudentRecord[maxEnrollment];
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
        for (int i = 0; i < enrolledStudents.length; i++) {
            list = list + (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return "== " + courseName + " ==\n" + list;
    }

    public String findBestStudent() {
        StudentRecord student = enrolledStudents[0];
        for (int i = 1; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() > student.getFinalAverage()) {
                student = enrolledStudents[i];
            }
        }
        return "" + student.getName();
    }

    public double calculateTestAverage(int number) {
        double sum = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            sum = sum + enrolledStudents[i].getTestScore(number);
        }
        return (double) sum / enrolledStudents.length;
    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                return;     //BREAK exits (current) for loop only; RETURN exists method
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                String check = enrolledStudents[i].getName();
                if (check.equals(student.getName())) {
                    enrolledStudents[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int count = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] new1 = new StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            new1[i] = enrolledStudents[i];
        }
        this.enrolledStudents = new1;
    }

}