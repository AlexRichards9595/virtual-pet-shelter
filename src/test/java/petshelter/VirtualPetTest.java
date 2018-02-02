package petshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;




public class VirtualPetTest {
	@Test
	public void shouldInstantiateAnAccountObjectWithATypeAndBalance() {
		VirtualPet underTest = new VirtualPet("",0,0,0);

		assertNotNull(underTest);
	}
	@Test
	public void shouldReturnANameAsSteve() {
		VirtualPet underTest = new VirtualPet("Steve",0,0,0);
		String check = underTest.getName();
		
		assertEquals("Steve", check);
	}
	
}
