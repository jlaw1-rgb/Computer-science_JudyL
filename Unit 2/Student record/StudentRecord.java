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
        String contents = "[" + scores[0];
        for (int i = 1; i < score.length; i++) {
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
        return (double) sum / (last - first + 1);
    }


    public int getTestScore(int testNumber) {
        if (testNumber > scores.length || testNumber < 0) {
            return -1;
        }
        return scores[testNumber];
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
            return (double) getAverage((int) (scores.length / 2), scores.length - 1);
        }
        return (double) getAverage(0, scores.length - 1);
    }

}