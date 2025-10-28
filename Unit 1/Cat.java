public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    //to do: update constructer with validate moodlevel & catId
    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.moodLevel = validateMoodLevel(moodLevel);
        this.catId = validateCatId(catId);
        this.catChar = generateCatChar();
        this.isHungry = true;

    }

    public Cat() {
        this.moodLevel = 2;
        this.catId = 286; //?
        this.catChar = generateCatChar();
        this.isHungry = true;
    }

    
    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public String getCatId() {
        return catId;
    }

    public char getCatChar() {
        return catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setMoodLevel(int moodLevel) {
        if (moodLevel < 1) {
            this.moodLevel = 0;
        } else if (moodLevel > 10) {
            this.moodLevel = 10;
        }   //To earn full credit, utilize the method implemented in PurrfectUtils for this validation
    }

    public void setCatId(String catId) {
        if (catId.compareTo("1000") == -1
        || catId.compareTo("9999") == 1) {
            catId = "" + Math.random() * 1000;
        }
        this.catId = catId;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        return this.catId + this.catChar;
    }

    public String toString() { //For full credit, use methods that have been
                            //already written in the Cat and PurrfectUtils classes whenever possible.
        return "== ABOUT " + name + " ==\n" + name + " is a cat.\nTheir tag is " + generateCatTag()
            + ".\nCurrently, " + name + "is in a good mood.";
    }

}
