import java.util.ArrayList;


public class PrimeFactor {
	
	public static ArrayList<Integer> prime (int i)
	{
		return prime(i, new ArrayList<Integer>());
	}

	public static ArrayList<Integer> prime(int i, ArrayList<Integer> list) {
		if (i > 1) {
			for (int j = 2; j <= i; j++) {
				if (isPrime(j))
					if (i % j == 0) {
						int accu = 1;
						int jtoaccupwr = j;
						while (true) {
							if (i % (j * jtoaccupwr) == 0) {
								accu++;
								jtoaccupwr *= j;
							} else
								break;
						}
						for (int k = 0; k < accu; k++)
							list.add(j);
					}
			}
			return list;
		}
		return null;
	}
	
	public static boolean isPrime(int i) {
		if (i <= 1)
			return false;
		if (i == 2)
			return true;
		for (int j = 2; i > j; j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}
}
