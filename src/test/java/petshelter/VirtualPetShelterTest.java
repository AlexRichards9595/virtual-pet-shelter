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
		underTest.addPet(new VirtualPet("Steve",10,10,10));
		int check = underTest.listSize();
		assertEquals (1, check);
	}
	@Test
	public void assertThatTwoPetsHaveBeenAdded() {
		underTest.addPet(new VirtualPet("Steve",10,10,10));
		underTest.addPet(new VirtualPet("Bob",10,10,10));
		int check = underTest.listSize();
		assertEquals (2, check);
	}
	@Test
	public void assertThatNamePullsAnimalInfo() {
		VirtualPet expected = new VirtualPet("Steve", 10,10,10);
		underTest.addPet(expected);
		VirtualPet check = underTest.getPet("Steve");
		assertEquals(expected,check);
	}
	
}
