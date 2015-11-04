package numberTheory1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExtendedEculidian {
	static int x, y, gcd;

	void GCD(int A, int B) {

		if (B == 0) {
			gcd = A;
			x = 1;
			y = 0;

		} else {

			GCD(B, A % B);
			int temp = x;
			x = y;
			y = temp - (A / B) * y;
		}
	}

	public static void Main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		ExtendedEculidian EE = new ExtendedEculidian();
		EE.GCD(Math.max(A, B), Math.min(A, B));
		System.out.println("GCD   " + gcd);
		System.out.println("X   " + x + "   Y    " + y);

	}

}
