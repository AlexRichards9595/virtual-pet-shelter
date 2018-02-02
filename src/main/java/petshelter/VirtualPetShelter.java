package petshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addPet(VirtualPet virtualPet) {
		pets.put(virtualPet.getName(), virtualPet);
	}

	public int listSize() {
		return pets.size();
	}

	public VirtualPet getPet(String name) {
		return pets.get(name);
	}
	public String getPetDescription(String name) {
		return pets.get(name).getDescription();
	}

	public int getPetHunger(String name) {
		return pets.get(name).getHunger();
	}
	public int getPetThirst(String name) {
		return pets.get(name).getThirst();
	}
	public int getPetBoredom(String name) {
		return pets.get(name).getBoredom();
	}

	public void feedPet(String name) {
		VirtualPet virtualPet = pets.get(name);
		virtualPet.feed();
	}

	public Collection<VirtualPet> pets() {
		return pets.values();
	}

	public void feedAllPets() {
		for (VirtualPet virtualPet: pets()) {
			feedPet(virtualPet.getName());
		}
	}
	public void waterPet(String name) {
		VirtualPet virtualPet = pets.get(name);
		virtualPet.water();
	}
	public void waterAllPets() {
		for (VirtualPet virtualPet: pets()) {
			waterPet(virtualPet.getName());
		}
	}
	public void tickPet(String name) {
		VirtualPet virtualPet = pets.get(name);
		virtualPet.tick();
	}
	public void tickAllPets() {
		for (VirtualPet virtualPet: pets()) {
			tickPet(virtualPet.getName());
		}
	}

	
	

	
	
	
	
	
}
