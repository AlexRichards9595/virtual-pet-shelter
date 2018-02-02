package petshelter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class VirtualPetTest {
	@Test
	public void shouldInstantiateAnAccountObjectWithATypeAndBalance() {
		VirtualPet underTest = new VirtualPet("",0,0,0);

		assertNotNull(underTest);
	}
}
