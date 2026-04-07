
import java.util.ArrayList;
import java.util.Scanner;

public class DecksAndChecks {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------
    // Rule: no single card may have more than 1 ability
    public static boolean checkOneAbilityPerCard(ArrayList<Card> deck) {
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).abilityCount() > 1) {
                return false;
            }
        }
        return true;
    }

    // Rule: no more than 3 total ability cards in the deck
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int count = 0;
        for (int i = 0; i < deck.size(); i++) {
            Card item = deck.get(i);
            if (item.hasBastion() || item.hasCleave() || item.hasRipple()) {
                count++;
            }
        }
        return count <= 3;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one CLEAVE)
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        int B = 0;
        int R = 0;
        int C = 0;
        for (int i = 0; i < deck.size(); i++) {
            Card item = deck.get(i);
            if (item.resolvedAbility() == AbilityLibrary.BASTION) {
                B++;
            } else if (item.resolvedAbility() == AbilityLibrary.RIPPLE) {
                R++;
            } else if (item.resolvedAbility() == AbilityLibrary.CLEAVE) {
                C++;
            }
        }
        return !(B > 1 || R > 1 || C > 1);
    }

    // Rule: strength and toughness must be 1-5, and strength+toughness <= 6
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        for (int i = 0; i < deck.size(); i++) {
            Card item = deck.get(i);
            if (item.getStrength() < 1 || item.getStrength() > 5) {
                return false;
            }
            if (item.getToughness() < 1 || item.getToughness() > 5) {
                return false;
            }
            if (item.getStrength() + item.getToughness() > 6) {
                return false;
            }
        }
        return true;
    }

    // return true only if:
    // - deck has size 5
    // - AND all checks return true
    public static boolean isValidDeck(ArrayList<Card> deck) {
        if (deck.size() != 5) {
            return false;
        } else {
            return (checkOneAbilityPerCard(deck) && checkNoMoreThanThreeAbilityCards(deck)
                    && checkNoDuplicateAbilities(deck) && checkStatsInRange(deck));
        }
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------
    // Must create 5 cards, all 3/3, no abilities
    // If the user doesn't want to input a custom deck, this method should return deck
    //   of your choice for them to play with.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> pl = new ArrayList<Card>(5);
        for (int i = 0; i < 5; i++) {
            Card a = new NamedCard("card" + i, CardType.GRANITE, 3, 3,
                    false, false, false);
            pl.add(a);
        }
        return pl;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // name, type, strength, toughness, bastion(y/n), ripple(y/n), cleave(y/n)
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        ArrayList<Card> deck = new ArrayList<Card>();

        boolean alreadyHaveB = false;
        boolean alreadyHaveR = false;
        boolean alreadyHaveC = false;

        while (!isValidDeck(deck)) {
            deck.clear();
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter name of card: ");
                String name = sc.nextLine();

                CardType type;
                System.out.println("Enter type of card: ");
                type = CardType.fromText(sc.nextLine());
                while (type == null) {
                    System.out.println("Invalid type. Enter \"g\" / \"p\" / \"b\".");
                    type = CardType.fromText(sc.nextLine());
                }

                int strength = 0;
                int toughness = 0;
                while (strength + toughness > 6 || strength + toughness == 0) {
                    System.out.println("Enter strength (1-5): ");
                    strength = Integer.parseInt(sc.nextLine());
                    while (strength < 1 || strength > 5) {
                        System.out.println("Invalid input. Strength value must be between 1-5.");
                        strength = Integer.parseInt(sc.nextLine());
                    }

                    System.out.println("Enter toughness (1-5): ");
                    toughness = Integer.parseInt(sc.nextLine());
                    while (toughness < 1 || toughness > 5) {
                        System.out.println("Invalid input. Toughness value must be between 1-5.");
                        toughness = Integer.parseInt(sc.nextLine());
                    }
                    if (strength + toughness > 6 || strength + toughness == 0) {
                        System.out.println("Sum of strength and toughness must <= 6. Try again.");
                    }
                }

                boolean B;
                boolean R = false;
                boolean C = false;

                while (true) {
                    System.out.println("Bastion(y/n): (Type \"y\" or \"yes\" for YES. Everything else will be NO.");
                    B = isYes(sc.nextLine());

                    System.out.println("Ripple(y/n): (Type \"y\" or \"yes\" for YES. Everything else will be NO.");
                    R = isYes(sc.nextLine());

                    System.out.println("Cleave(y/n): (Type \"y\" or \"yes\" for YES. Everything else will be NO.");
                    C = isYes(sc.nextLine());

                    if ((alreadyHaveB && B) || (alreadyHaveR && R) || (alreadyHaveC && C)) {
                        System.out.println("You have already used this ability on another card. Try again.");
                    } else if (B && R || B && C || R && C) {
                        System.out.println("Each card can only have one ability. Try again.");
                    } else {
                        break;
                    }

                    if (B == true) {
                        alreadyHaveB = true;
                    }
                    if (R == true) {
                        alreadyHaveR = true;
                    }
                    if (C == true) {
                        alreadyHaveC = true;
                    }
                }

                Card a = new NamedCard(name, type, strength, toughness, B, R, C);
                deck.add(a);
            }
            if (!isValidDeck(deck)) {
                System.out.println("Each card cannot have more than one ability. "
                        + "Also there cannot be duplicate ability cards or >3 ability cards in a deck. Recreate deck.");
            }
        }
        return deck;
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------
    public static boolean isYes(String s) {
        if (s == null) {
            return false;
        }
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
