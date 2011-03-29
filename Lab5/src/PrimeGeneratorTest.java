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
	
	@Test
	public void testPrimeGeneratorForSix()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		assertEquals(PrimeGenerator.generatePrimes(6), list);
	}
	
	@Test
	public void testPrimeGeneratorForEight()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		assertEquals(PrimeGenerator.generatePrimes(8), list);
	}
	
	@Test
	public void testPrimeGeneratorForTwenty()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(13);
		list.add(17);
		list.add(19);
		assertEquals(PrimeGenerator.generatePrimes(20), list);
	}
}
