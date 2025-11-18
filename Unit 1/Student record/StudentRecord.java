public class StudentRecord {
    private String name;
    private int[] scores;

    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    // to-do: implement getTestScore

    public int[] getScores() {
        return scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String toString() {
        return name + "'s scores: " + convert(scores);
    }


    public String convert(int [] score) {
        if (score == null || score.length == 0) {
            return "[]";
        }
        String contents = "[" + scores[0];
        for (int i = 0; i < score.length; i++) {
            contents = contents + ", " + score[i];
        }
        System.out.println(contents + "]");
        return contents + "]"; 
    }

    public boolean equals(StudentRecord other) {
        return (this.name.equals(other.name)
            && convert(this.scores).equals(convert(other.scores)));
    }


    public double getAverage(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum = sum + scores[i];
        }
        return (double) sum / (last - first);
    }


    public int getTestScore(int testNumber) {
        if (testNumber > scores.length) {
            return -1;
        }
        return scores[testNumber - 1];
    }


    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }


    public double getFinalAverage() {
        if (hasImproved() == true) {
            return (double) getAverage((int) scores.length / 2, scores.length);
        }
        return (double) getAverage(0, scores.length);
    }
}