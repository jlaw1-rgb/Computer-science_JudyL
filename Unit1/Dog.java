public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "DoG";
        this.ownerName = "OwNeR";
        this.age = 5;
        this.dogId = 263;
        this.dogChar = generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = true;
    }

    public int getAge() {
        return age;
    }

    public char getDogChar() {
        return dogChar;
    }

    public int getDogId() {
        return dogId;
    }

    public String getDogTag() {
        return dogTag;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString(boolean stillInFacility) {
        if (stillInFacility = true) {
            return "" + name + "is a good dog. They are " + age + " years old and belongs to "
                + ownerName + " . They are currently not in our facility. For employee use only: DogTag is " + dogTag;
        } else {
            return "" + name + "is a good dog. They are " + age + " years old and belongs to "
                + ownerName + " . They are currently in our facility. For employee use only: DogTag is " + dogTag;
        }
        
    }

    public boolean equals(Dog other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
            && this.age == other.age && this.dogId == other.dogId && this.dogChar == other.dogChar
            && this.dogTag.equals(other.dogTag) && this.stillInFacility == other.stillInFacility) {
            return true;
        } else {
            return false;
        }
    }

}

public class PawesomeUtils {

    public static char generateDogChar(int dogId) {
        int sum = (dogId % 10 + (dogId / 10) % 10 + ((dogId / 10) % 10) / 10) % 10;
        return (char) ('F' + sum);
    }


    public static String pickup(Dog dog, String personName) {
        if (personName.equals(dog.ownerName)) {
            dog.stillInFacility = false;
            return "" + dog.name + " has been picked up by their owner " + dog.ownerName + ".";
        } else {
            return "" + dog.name + " can't leave! Safeft first. ";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.stillInFacility = true;
        dog.ownerName = personName;
    }

    public static String generateDogTag(int dogId, int dogChar) {
        return "" + this.dogId + this.dogChar;
    }

    public stactic int validateDogId(int dogId) {
        if (this.dogid >= 100 && this.dogId <= 900) {
            return this.dogId;
        } else {
            return (int) (Math.random() + 100) * 10;
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int newDogId = newDogId.validateDogId(dog.getDogId());
        char newDogChar = dog.generateDogChar(int newDogId);
        String newDogTag = "" + newDogId + newDogChar;
        if (newDogTag.equals(dog.getDogId())) {
            return true; 
        } else {
            return false;
        }
    }

}
