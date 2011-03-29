import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;



public class PrimeGeneratorTest {

	@Test
	public void testJUnit()
	{
		assertTrue("Hope this does not Minge.", true);
	}
	
	@Test
	public void testPrimeGeneratorForOne()
	{
		assertEquals(PrimeGenerator.generatePrimes(1), new ArrayList<Integer>());
	}
	
	@Test
	public void testPrimeGeneratorForTwo()
	{
		assertEquals(PrimeGenerator.generatePrimes(2), new ArrayList<Integer>());
	}
	
	@Test
	public void testPrimeGeneratorForThree()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		assertEquals(PrimeGenerator.generatePrimes(3), list);
	}
	
	@Test
	public void testPrimeGeneratorForFour()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		assertEquals(PrimeGenerator.generatePrimes(4), list);
	}
	
	@Test
	public void testPrimeGeneratorForFive()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		assertEquals(PrimeGenerator.generatePrimes(5), list);
	}
}
