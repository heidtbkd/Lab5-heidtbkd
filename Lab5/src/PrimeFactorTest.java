import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeFactorTest {
	@Test
	public void testJUnit()
	{
		assertTrue("Hope this does not Minge.", true);
	}
	
	@Test
	public void testPrimeFactorForOne()
	{
		assertNull(PrimeFactor.prime(1));
	}
	
	@Test
	public void testPrimeFactorForTwo()
	{
		assertEquals(PrimeFactor.prime(2), new ArrayList<Integer>().add(2));
	}
}
