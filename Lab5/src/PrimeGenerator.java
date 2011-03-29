import java.util.ArrayList;

public class PrimeGenerator {

	public static ArrayList<Integer> generatePrimes(int i) {
		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int j = 2; j < i; j++) {
			boolean isPrime = true;
			for (int k = 2; k < j; k++) {
				if (j % k == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				temp.add(j);
			}
		}

		return temp;
	}
}