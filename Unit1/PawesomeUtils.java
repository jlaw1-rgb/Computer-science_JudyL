public class PawesomeUtils {

    public static char generateDogChar(int dogId) {
        int sum = (dogId % 10 + (dogId / 10) % 10 + ((dogId / 10) % 10) / 10) % 10;
        return (char) ('F' + sum);
    }

    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.getOwnerName())) {
            dog.getStillInFacility() = false;
            return "" + dog.getName() + " has been picked up by their owner " + dog.getOwnerName() + ".";
        } else {
            return "" + dog.getName() + " can't leave! Safeft first. ";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.stillInFacility = true;
        dog.ownerName = dog.personName;
        if (dog.validateDogId(dog.getDogId()) == true) {
            System.out.println("Check in was successful! ");
        } else {
            System.out.println("Counterfeit dog! Entry denied.");
        }
    }

    public static String generateDogTag(int dogId, int dogChar) {
        return "" + dogId + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogid >= 100 && dogId <= 900) {
            return dogId;
        } else {
            return (int) (Math.random() + 100) * 10;
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int newDogId = newDogId.validateDogId(dog.getDogId());
        char newDogChar = dog.generateDogChar(newDogId); 
        String newDogTag = "" + newDogId + newDogChar;
        if (newDogTag.equals(dog.getDogId())) {
            return true; 
        } else {
            return false;
        }
    }

    public static int convertAgeToDogAge(Dog dog) {
        age = dog.getAge();
        if (age == 1) {
            return 15;
        } else if (age == 2) {
            return 24;
        } else if (age > 2) {
            return 24 + (age - 2) * 5;
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears <= 24 && humanYears > 15) {
            return 2;
        } else if (humanYears > 24) {
            return (int) ((humanYears - 24) / 5 + 2);
        }
    }
}