
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardBattleGame {

    // TODO: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        // Generate a random integer (full range)
        int randomInt = (int) (Math.random() * 2);
        System.out.println("Random int: " + randomInt);
        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);

        String winner;
        System.out.println("== CARD CLASH ==");
        if (randomInt == 0) {
            System.out.println("Starting: player");
            winner = game(player, bot);
            System.out.println("Winner: " + winner);
            return winner;
        } else {
            System.out.println("Starting: bot");
            winner = game(bot, player);
            System.out.println("Winner: " + winner);
            return winner;
        }
    }

    public static String game(PlayerState self, PlayerState other) {
        drawAndPlayIfNeeded(self, other);
        drawAndPlayIfNeeded(other, self);
        int round = 0;
        while (!self.hasNothingLeft() && !other.hasNothingLeft()) {
            if (round % 2 == 0) {
                drawAndPlayIfNeeded(self, other);
                attackOnce(self, other);
                if (other.active.isDefeated()) {
                    other.active = null;
                }
                round++;
            } else {
                drawAndPlayIfNeeded(other, self);
                attackOnce(other, self);
                if (self.active.isDefeated()) {
                    self.deck.remove(self.active);
                }
                round++;
            }
        }
        if (self.hasNothingLeft()) {
            return other.name;
        } else {
            return self.name;
        }
    }

    // ----- helpers you may implement or use -----
    // Draw top card if no active, apply on-play effects
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        if (self.active == null && self.deck.size() > 0) {
            self.active = self.deck.remove(0);
            self.active.applySelfOnPlay(self.active.resolvedAbility());
        }
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        if (attacker.active == null || defender.active == null) {
            return;
        }
        defender.active.takeDamage(attacker.active.computeDamageAgainst(defender.active));
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DecksAndChecks.buildDefaultDeck();
        ArrayList<Card> bot = BotFactory.buildBotDeck();

        if (!DecksAndChecks.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
