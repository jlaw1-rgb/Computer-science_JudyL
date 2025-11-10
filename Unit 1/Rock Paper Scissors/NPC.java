public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        choice = choice.toLowerCase();
        this.choice = RPSGame.generateRandomChoice();  //TODO
    }

    public String toString() {
        return "Opponent chose " + choice;
    }
}
