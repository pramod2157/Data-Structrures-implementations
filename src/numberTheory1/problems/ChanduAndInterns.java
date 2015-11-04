package numberTheory1.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanduAndInterns extends Object {
	int divisors(int x) {
	    int limit = x;
	    int numberOfDivisors = 0;

	    if (x == 1) return 1;

	    for (int i = 1; i < limit; ++i) {
	        if (x % i == 0) {
	            limit = x / i;
	            if (limit != i) {
	                numberOfDivisors++;
	            }
	            numberOfDivisors++;
	        }
	    }

	    return numberOfDivisors;
	}

	public static void main(String[] args) throws IOException {
		ChanduAndInterns ci=new ChanduAndInterns();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int NoOfBottles = Integer.parseInt(line);

		for (int i = 0; i < NoOfBottles; i++) {
			line = br.readLine();
			int bottle = Integer.parseInt(line);

	/*		int divisors = 0;
			for (int j = 1; j <= bottle; j++) {
				if (bottle % j == 0)
					divisors++;

			}
*/			
			int divisors=ci.divisors(bottle);
			if (divisors < 4)
				System.out.println("NO");
			else
				System.out.println("YES");

		}

	}

}
