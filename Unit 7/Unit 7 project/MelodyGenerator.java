
import java.util.ArrayList;

public class MelodyGenerator {

    private ArrayList<Melody> melodies;

    public MelodyGenerator(int num) {
        this.melodies = new ArrayList<Melody>(num);
    }

    public void addMelody(String name) {
        this.melodies.add(new Melody(name));
    }

    public void alphabeticalSort() {
        for (int i = 0; i < melodies.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < melodies.size(); j++) {
                if (melodies.get(j).getTitle().compareTo(melodies.get(min).getTitle()) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                swap(min, i);
            }
        }
    }

    public void swap(int first, int second) {
        Melody temp = melodies.get(second);
        melodies.set(second, melodies.get(first));
        melodies.set(first, temp);
    }

    public ArrayList<Melody> getMelodies() {
        return melodies;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < melodies.size(); i++) {
            str = str + melodies.get(i).toString() + "\n";
        }
        return str;
    }
}
