// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster.getAttack() + monster.getDefense() + monster.getHealth() + monster.getSpeed() > 250) {
            System.out.println("Combined stats > 250. ");
            return false;
        } else if (monster.getAttack() < 0 || monster.getDefense() < 0 || monster.getHealth() < 0 || monster.getSpeed() < 0) {
            System.out.println("Individual stats cannot be negative.");
            return false;
        }
        return true;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        String type = monster.getElement().getDisplayName();
        if (!type.equals("Fire") && !type.equals("Water") && !type.equals("Earth") && !type.equals("Air")) {
            System.out.println("Element type invalid. The monster is assigned to be FIRE.");
            monster.setElement(ElementType.FIRE);
            return false;
        }
        return true;
    }

    // to-do: correctStats
    // checks if stats are invalid 
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (validateStats(monster) == true) {
            System.out.println("No need correction.");
        } else if (monster.getAttack() < 0) {
            monster.setAttack(0);
            System.out.println("Attack value is reset to 0 because it was negative. ");
        } else if (monster.getDefense() < 0) {
            monster.setDefense(0);
            System.out.println("Defense value is reset to 0 because it was negative. ");
        } else if (monster.getHealth() < 0) {
            monster.setHealth(0);
            System.out.println("Health value is reset to 0 because it was negative. ");
        } else if (monster.getSpeed() < 0) {
            monster.setSpeed(0);
            System.out.println("Speed value is reset to 0 because it was negative. ");
        } else if (monster.getAttack() + monster.getDefense() + monster.getHealth() + monster.getSpeed() > 250) {
            monster.setAttack(50);
            monster.setDefense(50);
            monster.setHealth(50);
            monster.setSpeed(50);
            System.out.println("The monster's stats were invalid because their sum > 250. They were re-setted to be 50 each.");
        }
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0. It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        if (validateStats(monster1) == false && validateStats(monster2) == false) {
            return null;
        } else if (validateStats(monster1) == false) {
            return monster2;
        } else if (validateStats(monster2) == false) {
            return monster1;
        }

        if (monster1.getSpeed() > monster2.getSpeed()) {
            return game(monster1, monster2);
        } else {
            return game(monster2, monster1);

        }

    }

    public static Monster game(Monster self, Monster other) {
        while (self.getHealth() > 0 && other.getHealth() > 0) {
            int round = 0;
            if (round % 2 == 0) {
                self.attack(other);
                displayStatus(self, other);
                if (other.getHealth() <= 0) {
                    break;
                }
                round++;
            } else {
                other.attack(self);
                displayStatus(other, self);
                if (self.getHealth() <= 0) {
                    break;
                }
            }
        }
        if (self.getHealth() <= 0) {
            System.out.println(other.victoryNoise());
            return other;
        } else {
            System.out.println(self.victoryNoise());
            return self;
        }
    }

    // to-do: battleEveryone
    // method battles monsters found in an ArrayList.
    public static Monster battleEveryone(ArrayList<Monster> monsters) {
        Monster winner = monsters.get(0);
        for (int i = 1; i < monsters.size(); i++) {
            int originalHealth = winner.getHealth();
            int originalHealth2 = monsters.get(i).getHealth();
            if (startBattle(winner, monsters.get(i)) == winner) {
                winner.setHealth(originalHealth);
            } else {
                monsters.get(i).setHealth(originalHealth2);
                winner = monsters.get(i);
            }

        }
        return winner;
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        System.out.println(monster.getName() + "'s current health: " + monster.getHealth()
                + "\n" + opponent.getName() + "'s current health: " + opponent.getHealth());
    }

}
