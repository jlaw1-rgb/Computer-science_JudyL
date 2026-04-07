
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardTester {

    public static void main(String[] args) {
        System.out.println("== LOCAL CARD TESTER ==");

        Card a = new NamedCard("Alpha", CardType.GRANITE, 3, 3, true, false, false); // Bastion
        Card b = new NamedCard("Bravo", CardType.BLADE, 3, 3, false, false, true);  // Cleave

        Scanner myObj = new Scanner(System.in);
        // ArrayList<Card> here = DecksAndChecks.buildDefaultDeck();
        // System.out.println("Is one ability per card: " + DecksAndChecks.checkOneAbilityPerCard(here));
        // System.out.println("< 3 ability cards: " + DecksAndChecks.checkNoMoreThanThreeAbilityCards(here));
        // System.out.println("No duplicate abilities: " + DecksAndChecks.checkNoDuplicateAbilities(here));
        // System.out.println("Valid strength and toughness: " + DecksAndChecks.checkStatsInRange(here));

        // ArrayList<Card> k = DecksAndChecks.buildUserDeck(myObj);
        // System.out.println("Created valid deck: " + DecksAndChecks.isValidDeck(k));
        // simulate "play" (self effects only)
        a.applySelfOnPlay(a.resolvedAbility());
        b.applySelfOnPlay(b.resolvedAbility());
        System.out.println("A played: " + a);
        System.out.println("B played: " + b);
        int dmg = a.computeDamageAgainst(b);
        System.out.println("A attacks B for " + dmg);
        b.takeDamage(dmg);
        System.out.println("B after dmg: " + b);
        // Optional: run your full game if DeckAndChecks + CardBattleGame exist
        try {
            ArrayList<Card> player = BotFactory.buildBotDeck(); // placeholder deck
            ArrayList<Card> bot = BotFactory.buildBotDeck();
            System.out.println("\n== RUNNING GAME (if implemented) ==");
            String winner = CardBattleGame.playGame(player, bot, new Random(7));
            System.out.println("Returned winner: " + winner);
        } catch (Throwable t) {
            System.out.println("\n(Game not run: CardBattleGame/DeckAndChecks may still be TODO)");
        }
    }
}
