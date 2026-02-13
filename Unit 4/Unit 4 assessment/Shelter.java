
import java.util.ArrayList;

public class Shelter {

    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Arguments have to be positive.");
        }
        this.kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel
     is occupied, or 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Argument cannot be null. ");
        }
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c] == null) {
                    kennels[r][c] = animal;
                    return;
                }
            }
        }
        System.out.println("No empty kennels.");
    }

    public void add(Dog animal, int row, int col) {
        if (animal == null || row > kennels.length || col > kennels[row].length
                || row < 0 || col < 0) {
            throw new IllegalArgumentException("Argument(s) invalid. ");
        }
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }
    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Argument cannot be null. ");
        }
        for (int i = 0; i < animals.size(); i++) {
            add(animals.get(i));
        }
    }

    public Dog adopt(int row, int col) {
        if (row > kennels.length || col > kennels[row].length || row < 0 || col < 0) {
            throw new IllegalArgumentException("Argument invalid. ");
        }
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("There is no dog here.");
        }
        Dog adopted = kennels[row][col];
        kennels[row][col] = null;
        return adopted;
    }

    public ArrayList<Dog> search(String name) {
        if (name == null) {
            throw new IllegalArgumentException("There is no dog here.");
        }
        ArrayList<Dog> the = new ArrayList<Dog>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c].getName().equals(name)) {
                    the.add(kennels[r][c]);
                }
            }
        }
        return the;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age.");
        }
        ArrayList<Dog> the = new ArrayList<Dog>();
        for (int r = 0; r < kennels.length; r++) {
            for (int c = 0; c < kennels[r].length; c++) {
                if (kennels[r][c].getAge() == age) {
                    the.add(kennels[r][c]);
                }
            }
        }
        return the;
    }
}
