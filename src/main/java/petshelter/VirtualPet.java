package petshelter;

public class VirtualPet {
	
	private String name;
	private int hunger;
	private int thirst;
	private int boredom;

	public VirtualPet(String name, int hunger, int thirst, int boredom) {
		this.name = name; 
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
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

	public int getBoredom() {
		return boredom;
	}
	

}
