package petshelter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.mockito.Matchers;




public class VirtualPetTest {
	@Test
	public void shouldInstantiateAPetWithNameAndDescription() {
		VirtualPet underTest = new VirtualPet ("","");
		
		assertNotNull(underTest);
	}
	@Test
	public void shouldInstantiateAPetWithNameDescriptionAndDefaultVitals() {
		VirtualPet underTest = new VirtualPet("","");
		VirtualPet expected = new VirtualPet("","",20,20,20);
		

//		assertEquals(expected, underTest);
		assertThat(underTest.getHunger(), is(expected.getHunger()));
	}
	@Test
	public void shouldReturnANameAsSteve() {
		VirtualPet underTest = new VirtualPet("Steve","Description",0,0,0);
		String check = underTest.getName();
		
		assertEquals("Steve", check);
	}
	@Test
	public void shouldReturnHungerAsTen() {
		VirtualPet underTest = new VirtualPet("Steve","Description",10,0,0);
		int check = underTest.getHunger();
		
		assertEquals(10, check);
	}
	@Test
	public void shouldReturnSleepAsTen() {
		VirtualPet underTest = new VirtualPet("Steve","Description",0,10,0);
		int check = underTest.getThirst();
		
		assertEquals(10, check);
	}
	@Test
	public void shouldReturnBoredomAsTen() {
		VirtualPet underTest = new VirtualPet("Steve","Description",0,0,10);
		int check = underTest.getBoredom();
		
		assertEquals(10, check);
	}
	@Test
	public void shouldReturnDescriptionAsDescription() {
		VirtualPet underTest = new VirtualPet("Steve","Description",0,0,10);
		String check = underTest.getDescription();
		
		assertEquals("Description", check);
	}
	
	@Test 
	public void TickShouldAddToAllVitalsTestingHunger() {
		VirtualPet underTest = new VirtualPet("Steve","Description",10,10,10);
		underTest.tick();
		int check = underTest.getHunger();
		
		assertEquals(12, check);
	}
	@Test
	public void ShouldSubtractFromHunger() {
		VirtualPet underTest = new VirtualPet("Steve","Description",10,10,10);
		underTest.feed();
		int check = underTest.getHunger();
		
		assertEquals(5, check);
	}
	@Test
	public void ShouldSubtractFromThirst() {
		VirtualPet underTest = new VirtualPet("Steve","Description",10,10,10);
		underTest.water();
		int check = underTest.getThirst();
		
		assertEquals(5, check);
	}
	@Test
	public void ShouldSubtractFromBoredom() {
		VirtualPet underTest = new VirtualPet("Steve","Description",10,10,10);
		underTest.play();
		int check = underTest.getBoredom();
		
		assertEquals(0, check);
	}
	
	
	//TODO include a constructor that takes a name and description (user input)
	//TODO includ a constructor that adds default vitals to name and description
	
	
	
	
	
}

