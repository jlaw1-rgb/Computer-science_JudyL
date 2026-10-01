
import java.util.ArrayList;

public class Melody {

    private ArrayList<MusicalElement> elements;
    private ArrayList<Double> rhythm;
    private String title;

    public Melody(String name) {    //creates a melogy object with two measures of identical rhythm
        title = name;
        elements = new ArrayList<>();
        int numElementsPerMeasure = (int) (3 + Math.random() * 3);
        double total = 4;
        rhythm = new ArrayList<Double>(numElementsPerMeasure);
        while (total > 0) {
            for (int i = 0; i < numElementsPerMeasure; i++) {
                rhythm.add(i, 0.5);
                total = total - 0.5;
            }
            int index = (int) (Math.random() * numElementsPerMeasure);
            rhythm.set(index, rhythm.get(index) + 0.5);
            total = total - 0.5;
        }
        ArrayList<Double> r = new ArrayList<Double>(numElementsPerMeasure);
        r = rhythm;
        rhythm.addAll(r);

        for (int i = 0; i < rhythm.size(); i++) {
            int decide = (int) (Math.random() * 3);
            if (decide == 0) {
                elements.add(new Rest(rhythm.get(i)));
            } else {
                int pitch = (int) (1 + Math.random() * 7);
                elements.add(new Note(pitch, rhythm.get(i)));
            }
        }
    }

    public String toString() {
        String ele = "[";
        for (int i = 0; i < elements.size(); i++) {
            ele = ele + elements.get(i).getName() + ",   ";
        }
        ele = ele + "]";
        return "Title of melody:" + title + "\n" + ele + "\n" + rhythm;
    }

    public ArrayList<MusicalElement> getElements() {
        return elements;
    }

    public String getTitle() {
        return title;
    }

}
