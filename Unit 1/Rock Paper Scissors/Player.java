public class Player {
    private String name;
    private String choice;

    //Constructer?

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getChoice() {
        return choice;
    }
    public void setChoice(String choice) {
        this.choice = choice; //TODO - update
    }

    public String toString() {
        return "" + name + " chose " + choice;
    }

}
