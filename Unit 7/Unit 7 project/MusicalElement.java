
public abstract class MusicalElement {

    private double beats;

    public MusicalElement(double duration) {
        this.beats = duration;
    }

    public double getBeats() {
        return beats;
    }

    public abstract void printMusicElementDetails();

    public abstract String getName();
}
