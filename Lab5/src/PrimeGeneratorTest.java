import static org.junit.Assert.assertTrue;

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
}
