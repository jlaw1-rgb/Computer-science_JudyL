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
        String playerName = "";
        for (int i = 0; i <= 4 || validateChoice(choice) == true; i++) {
            System.out.println("Please enter your name:");
            Scanner scan1 = new Scanner(System.in);
            playerName = scan1.nextLine();
            scan1.close();
            if (i != 4) {
                if (i == 1) {
                System.out.println("Please enter your choice: ");
                } else {
                System.out.println("Invalid. Please enter your choice again: ");
                }
                Scanner scan2 = new Scanner(System.in);
                choice = scan2.nextLine();
                scan2.close();
            } else {
                setPlayerValues(playerName, generateRandomChoice());
                System.out.println("These choices are invalid."
                    + "A random choice had been auto-generated for you.");
            }
        }
        setPlayerValues(playerName, choice);
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock")) {
            if (opponent.getChoice().equals("rock")
                || opponent.getChoice().equals("paper")) {
                return false;
            } else {
                return true;
            }
        } else if (player.getChoice().equals("paper")) {
            if (opponent.getChoice().equals("paper")
                || opponent.getChoice().equals("scissors")) {
                return false;
            } else {
                return true;
            }
        } else {
            if (opponent.getChoice().equals("scissors")
                || opponent.getChoice().equals("rock")) {
                return false;
            } else {
                return true;
            } 
        }
    }

    public String toString() {
        if (didPlayerWin() == true) {
            return "" + player.getName() + " won!\nCongratulations!";
        } else {
            return "Opponent won!\nBetter luck next time!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n"
            + player.getName() + " chose " + player.getChoice()
            + "Opponent chose " + opponent.getChoice()
            + toString();
    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("scissors")
            || choice.equals("paper") || choice.equals("rock")) {
                return true;
            } else {
                return false;
            }
    }

    public static String generateRandomChoice() {
        String computerChoice = "";
        int number = (int) Math.random() * 3 + 1;
        if (number == 1) {
            computerChoice = computerChoice + "rock";
        } else if (number == 2) {
            computerChoice = computerChoice + "paper";
        } else {
            computerChoice = computerChoice + "scissors";
        }
        return computerChoice;
    }

}
