public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits; 

    public TheaterMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count = count + 1;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int credits = countLoyaltyCredits();
        if (credits >= 6) {
            return "Gold Member";
        } else if (credits < 3) {
            return "Plus Member";
        } else {
            return "Silver Member";
        }
    }

    public String loyaltyHistory() {
        int count = countLoyaltyCredits();
        String history = "[";
        for (int i = 0; i < count; i++) {
            history = history + "X, ";
        }
        for (int i = 0; i < 10 - count; i++) {
            history = history + "-, ";
        }
        return history + "]";
    }

    public String toString() {
        return "" + name + " (" + determineMembershipStatus()
            + "), Loyalty History: " + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        return (this.name.equals(other.name)
            && this.loyaltyHistory().equals(other.loyaltyHistory()));
    }
}