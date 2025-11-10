import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        String choice = "";
        for (int i = 0; i <= 4 || validateChoice(choice) == true; i++) {
            if (i != 4) {
                Scanner scan = new Scanner(System.in);
                choice = scan.nextLine();
            } else {
                setPlayerValues(player.getName(), generateRandomChoice());
                System.out.println("These choices are invalid."
                    + "A random choice had been auto-generated for you.");
            }

        }
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("scissors")
            || choice.equals("paper") || choice.equals("rock")) {
                return true;
            } else {
                return false;
            }
    }


}
