package petshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetShelterTest {

	@Test
	public void assertThatAPetHasBeenAdded() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addAccount(new VirtualPet("Steve",10,10,10));
		int check = underTest.listSize();
		assertEquals (1, check);
	}
}
