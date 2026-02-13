
public class Kangaroo extends Animal {

    private String species;
    private String methodOfMovement;
    private boolean hasBabyInPouch;
    private boolean isHungry;
    private double height;
    private int age;

    public Kangaroo() {
        this.species = "Kangaroo";
        this.methodOfMovement = "Hopping";
        this.hasBabyInPouch = false;
        this.isHungry = true;
        this.height = 5.4;
        this.age = 4;
    }

    public Kangaroo(boolean hasBabyInPouch, boolean isHungry, double height, int age) {
        this.species = "Kangaroo";
        this.methodOfMovement = "Hopping";
        this.hasBabyInPouch = hasBabyInPouch;
        this.isHungry = isHungry;
        this.height = height;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getMethodOfMovement() {
        return methodOfMovement;
    }

    public void setMethodOfMovement(String methodOfMovement) {
        this.methodOfMovement = methodOfMovement;
    }

    public boolean isHasBabyInPouch() {
        return hasBabyInPouch;
    }

    public void setHasBabyInPouch(boolean hasBabyInPouch) {
        this.hasBabyInPouch = hasBabyInPouch;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Species: " + this.species + "\nMethod of Movement: " + methodOfMovement
                + "\nHas a baby in their pouch: " + hasBabyInPouch + "\nIs hungry: " + isHungry
                + "\nHeight: " + height + "\nAge: " + age;
    }
}
