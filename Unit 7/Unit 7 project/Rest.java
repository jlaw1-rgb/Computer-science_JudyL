
public class Rest extends MusicalElement {

    String name;

    public Rest(double duration) {
        super(duration);
        this.name = "R";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printMusicElementDetails() {
        System.out.println("This is a rest worth " + this.getBeats() + "beat(s)");
    }
}
