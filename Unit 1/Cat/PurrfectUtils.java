public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7 && cat.getMoodLevel() <= 10) {
            return "Currently, " + cat.getName() + " is in a good mood.\nPetting is appreciated.";
        } else if (cat.getMoodLevel() > 3 && cat.getMoodLevel() <=7) {
            return "Currently, " + cat.getName() + " is reminiscing of a past life.\nPetting is acceptable.";
        } else {
            return "Currently, " + cat.getName() + " is plotting revengeance.\nPetting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            sum = sum + catId.charAt(i) - '0';
        }
        sum = sum % 26;
        return (char) ('A' + sum); 
    }

    public static int generateRandomNumber(int low, int high) {
        if (high < low) {
            int store = high;
            low = high;
            high = store;
        }
        return (int) (Math.random() * (high - low + 1) + low);
    }

    public static String validateCatId(String catId) {
        if (catId.length() != 4) {
            catId = "" + generateRandomNumber(1000,9999);
        }
        return catId;
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 1) {
            moodLevel = 0;
        } else if (moodLevel > 10) {
            moodLevel = 10;
        }
        return moodLevel;
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        int petMood = cat.getMoodLevel();
        if (petMood >= 2) {
            cat.setMoodLevel(petMood + 1);
        } else {
            if (cat.isHungry() == true) {
                cat.setMoodLevel(petMood - 1);
            } else {
                cat.setMoodLevel(petMood + 1);
            }
        }
        if (cat.getMoodLevel() > petMood) {
            System.out.println("Petting successful!");
        } else {
            System.out.println("Petting failed...");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int trimMood = cat.getMoodLevel();
        cat.setMoodLevel(trimMood - generateRandomNumber(1, 2));
        if (cat.getMoodLevel() - trimMood == 1) {
            System.out.println(cat.getName() + " did not like that...");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box...\nDone! \n" + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up " + cat.getName() + "'s bowl...\nDone!\n"
            + cat.getName() + " is eating...\n" + cat.getName() + " is full!");
    }

}
