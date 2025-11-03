public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
        this.isHungry = true;
    }

    public Cat() {
        this.name = "kitty";
        this.ownerName = "owner1";
        this.moodLevel = 5;
        this.catId = "2863";
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
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
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(this.catId);
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        return "" + this.catId + this.catChar;
    }

    public String toString() {
        return "== ABOUT " + name + " ==\n" + name + " is a cat.\nTheir tag is " + generateCatTag()
            + ".\nCurrently, " + name + "is in a good mood.";
    }

    public boolean equals(Cat other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
            && this.moodLevel == other.moodLevel && this.generateCatTag().equals(other.generateCatTag())) {
            return true;
        } else {
            return false;
        }
    }

}