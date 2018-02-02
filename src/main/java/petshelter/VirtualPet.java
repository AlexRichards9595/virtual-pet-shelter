package petshelter;

public class VirtualPet {
	
	private String name;
	private int hunger;
	private int thirst;

	public VirtualPet(String name, int hunger, int thirst, int boredom) {
		this.name = name; 
		this.hunger = hunger;
		this.thirst = thirst;
	}

	public String getName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

}
