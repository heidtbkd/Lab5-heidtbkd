import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class PrimeGeneratorTest {

	@Test
	public void testJUnit() {
		assertTrue("Hope this does not Minge.", true);
	}

	@Test
	public void testPrimeGeneratorForOne() {
		assertEquals(PrimeGenerator.generatePrimes(1), new ArrayList<Integer>());
	}

	@Test
	public void testPrimeGeneratorForTwo() {
		assertEquals(PrimeGenerator.generatePrimes(2), new ArrayList<Integer>());
	}

	@Test
	public void testPrimeGeneratorForThree() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		assertEquals(PrimeGenerator.generatePrimes(3), list);
	}

	@Test
	public void testPrimeGeneratorForFour() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		assertEquals(PrimeGenerator.generatePrimes(4), list);
	}

	@Test
	public void testPrimeGeneratorForFive() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		assertEquals(PrimeGenerator.generatePrimes(5), list);
	}

	@Test
	public void testPrimeGeneratorForSix() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		assertEquals(PrimeGenerator.generatePrimes(6), list);
	}

	@Test
	public void testPrimeGeneratorForEight() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		assertEquals(PrimeGenerator.generatePrimes(8), list);
	}

	@Test
	public void testPrimeGeneratorForTwenty() {
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

	@Test
	public void testPrimeGeneratorForFirstHundred() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int intArray[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
				47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109,
				113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179,
				181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241,
				251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313,
				317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389,
				397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461,
				463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541 };
		for (int i = 0; i < 100; i++) {
			list.add(i, intArray[i]);
		}

		assertEquals(PrimeGenerator.generatePrimes(542), list);
	}
}
