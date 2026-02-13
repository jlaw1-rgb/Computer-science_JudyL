
import java.util.ArrayList;

public class StudentAnswerSheet {

    private String name;
    private double testScore;
    private ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null || answers == null) {
            throw new IllegalArgumentException("Invalid argument.");
        }
        this.name = name;
        this.answers = answers;
        this.testScore = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null || answers == null) {
            throw new IllegalArgumentException("Invalid argument");
        }
        if (key.size() != answers.size()) {
            throw new IllegalArgumentException("Length of key does not match");
        }
        double score = 0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i).equals(key.get(i))) {
                score = score + 1;
            } else if (answers.get(i).equals("?")) {
                score = score + 0;
            } else {
                score = score - 0.25;
            }
        }
        return score;
    }

}
