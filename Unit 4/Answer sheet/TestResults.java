
import java.util.ArrayList;

public class TestResults {

    private ArrayList<String> answerKey;
    private ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("Invalid argument given.");
        }
        this.answerKey = key;
        this.submissions = submissions;
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        this.submissions.add(student);
    }

    public void gradeTests() {
        for (int i = 0; i < submissions.size(); i++) {
            if (answerKey.size() != submissions.get(i).getAnswers().size()) {
                throw new IllegalArgumentException();
            }
            submissions.get(i).setTestScore(submissions.get(i).getGrade(answerKey));
        }
    }

    public String highestScoringStudent() {
        if (submissions.isEmpty()) {
            return "";
        }
        StudentAnswerSheet highest = submissions.get(0);
        for (StudentAnswerSheet student : submissions) {
            if (student.getGrade(answerKey) > highest.getGrade(answerKey)) {
                highest = student;
            }
        }
        return highest.getName();
    }
}
