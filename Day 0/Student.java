public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }
    
    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    public String generateId() {
        return "" + (int) (Math.random() * 8 + 1) + (int) (Math.random() * 8 + 1)
            + (int) (Math.random() * 8 + 1) + "-" + (int) (Math.random() * 10)
            + (int) (Math.random() * 10) + (int) (Math.random() * 10) + (int) (Math.random() * 10);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return name + " is a " + grade
            + "th grade student. Their id is " + id + ".";
    }

    public boolean equal(Student other) {
        if (name.equals(other.name) && id.equals(other.id) && grade == other.grade) {
            return true;
        } else {
            return false;
        }
    } 
}