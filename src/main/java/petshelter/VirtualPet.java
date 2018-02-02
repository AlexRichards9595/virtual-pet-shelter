package petshelter;

public class VirtualPet {
	
	private String name;
	private int hunger;

	public VirtualPet(String name, int hunger, int thirst, int boredom) {
		this.name = name; 
		this.hunger = hunger;
	}

	public String getName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

}
