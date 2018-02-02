package petshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	
	private VirtualPetShelter underTest;
	
	@Before
	public void setup() {
		underTest = new VirtualPetShelter();
	}

	@Test
	public void assertThatAPetHasBeenAdded() {
		underTest.addPet(new VirtualPet("Steve","Description"));
		int check = underTest.listSize();
		assertEquals (1, check);
	}
	@Test
	public void assertThatTwoPetsHaveBeenAdded() {
		underTest.addPet(new VirtualPet("Steve","Description"));
		underTest.addPet(new VirtualPet("Bob","Description"));
		int check = underTest.listSize();
		assertEquals (2, check);
	}
	@Test
	public void assertThatNamePullsAnimalInfo() {
		VirtualPet expected = new VirtualPet("Steve","Description");
		underTest.addPet(expected);
		VirtualPet check = underTest.getPet("Steve");
		assertEquals(expected,check);
	}
	@Test
	public void assertThatNamePullsHungerFromCorrectAnimal() {
		underTest.addPet(new VirtualPet("Steve","Description"));
		underTest.addPet(new VirtualPet("Bob","Description"));
		int check = underTest.getPetHunger("Bob");
		assertEquals(20, check);
	}
	@Test
	public void shouldFeedAPet () {
		underTest.addPet(new VirtualPet("Steve", "Description"));
		underTest.feedPet("Steve");
		int check = underTest.getPetHunger("Steve");
		assertEquals(15, check);
	}
	@Test
	public void shouldFeedAllPets() {
		underTest.addPet(new VirtualPet("Steve", "Description"));
		underTest.addPet(new VirtualPet("Bob", "Description"));
		underTest.feedAllPets();
		
		for(VirtualPet virtualPet: underTest.pets()) {
			int check = underTest.getPetHunger(virtualPet.getName());
			assertEquals(15, check);
		}
	}
	
	//TODO adopt a pet
	//TODO feed all pets
	//TODO water all pets
	//TODO play with a specific pet
	//TODO tick for all pets
	
	
	
	
	
	
	
}
