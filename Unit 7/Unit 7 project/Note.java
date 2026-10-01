
public class Note extends MusicalElement {

    String name;

    public Note(int pitch, double duration) {
        super(duration);
        if (pitch >= 1 && pitch <= 7) {
            this.name = "" + (char) (pitch + 64);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printMusicElementDetails() {
        System.out.println("This is a note worth " + this.getBeats() + "beat(s), and pitch" + name + ".");
    }

}
