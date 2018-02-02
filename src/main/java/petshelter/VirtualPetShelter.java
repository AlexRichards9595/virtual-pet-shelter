package petshelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public void addAccount(VirtualPet virtualPet) {
		pets.put(virtualPet.getName(), virtualPet);
	}

	public int listSize() {
		return pets.size();
	}

}
