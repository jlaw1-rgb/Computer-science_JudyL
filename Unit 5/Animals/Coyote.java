
public class Coyote extends Animal {

    private String species;
    private String methodOfMovement;
    private boolean isCarnivore;
    private boolean isHungry;
    private double height;
    private int age;

    public Coyote() {
        super("Coyote", "some habitat", 3, "Meat", false);
        this.species = "Canis latrans";
        this.methodOfMovement = "running";
        this.isCarnivore = true;
        this.height = 1.9;
    }

    public Coyote(double height, int age) {
        super("Coyote", "some other habitat", 4, "Meat", false);
        this.species = "Canis latrans";
        this.methodOfMovement = "running";
        this.isCarnivore = true;
        this.height = height;
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

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean isCarnivore) {
        this.isCarnivore = isCarnivore;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setisHungry(boolean isHungry) {
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
                + "\nIs a carnivore: " + isCarnivore + "\nIs hungry: " + isHungry
                + "\nHeight: " + height + "\nAge: " + age;
    }

    public void hunt() {
        setisHungry(false);
        System.out.println("The coyote just hunted and succeeded. Not hungry anymore.");
    }

}
