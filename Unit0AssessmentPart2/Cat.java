public class Cat { //deleted s in "cats", lowercased P in "public"
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { //uppercased C, added parameter "String breed"
		this.name = name; //changed "name" to "this.name"
		this.breed = breed; //changed "breed" to "this.breed"
		this.isHungry = true; //changed "yes" to "true"
		livesRemaining = 9;
	}

	public String getName() { //changed void to String
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry(){ //changed void to boolean, "getishungry" to "getIsHungry"
		return isHungry;
	}

	public boolean feed() {
		this.isHungry = false;
	}

	public boolean equals(Cat other) {
		return name.equals(other.name) && this.breed.equals(other.breed) //changed "==" to equals()
			&& this.livesRemaining == other.livesRemaining; //changed "=" to "=="
	}

	public String toString() {
		System.out.println(name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
	}
}