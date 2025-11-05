public class Pool {
    private String name;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsChemicalCheck;

    public Pool(String name, String ownerName, int cleanlinessLevel) {
        this.name = PoolUtils.fixName(name);
        this.ownerName = PoolUtils.fixName(ownerName);
        this.username = PoolUtils.generateUsername(username);
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsChemicalCheck = false;
    }

    public Pool() {
        this.name = "name1";
        this.ownerName = "Judy Law";
        this.username = PoolUtils.generateUsername(username);
        this.cleanlinessLevel = 5;
        this.needsChemicalCheck = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = PoolUtils.fixName(name);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsChemicalCheck() {
        return needsChemicalCheck;
    }

    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    public String toString() {
        return "== ABOUT POOL ==\nName: " + name + "\nOwner: " + ownerName
            + "\nUsername: " + username + "\nCleanliness Level: " + cleanlinessLevel
            + "\nDoes pool need chemical check? " + needsChemicalCheck;
    }

    public boolean equals(Pool other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
            && this.username.equals(other.username) && this.cleanlinessLevel == other.cleanlinessLevel
            && this.needsChemicalCheck == other.needsChemicalCheck) {
            return true;
        } else {
            return false;
        }
    }

}
