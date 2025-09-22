public class Student {
    private String name, id;
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

    public String generateID() {
        return(int)((Math.random()*880)+ 100)+"-"+(int)(Math.random()* 10000);
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

    public void setId() {
        id = id1;
    }

    public String toString() {
        return name + " is a " + grade + 
        "th grade student. Their id is " + id + ".";
    }

    public boolean equal(Student RM) {
        if (this.name == RM.name && this.id == RM.id && this.grade == RM.grade)
            return true;
        else
            return false;
    } 
}