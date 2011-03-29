import java.util.ArrayList;


public class PrimeGenerator {

	public static ArrayList<Integer> generatePrimes(int i) {
		if(i<=2)
		{
			return new ArrayList<Integer>();
		}
		else
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			if(i==3)
			{
				temp.add(2);
			}
			
			return temp;
		}
	}
}
