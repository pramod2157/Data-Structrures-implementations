package numberTheory1.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MagicalPotions {

	public static void Main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		long NumberOfPotions = Integer.parseInt(st.nextToken());
		long Modulo = Integer.parseInt(st.nextToken());
		line = br.readLine();
		long TotalDays = line.length(), PotionsBuyied = 0;
		long temp = NumberOfPotions;
		// int[] Potions=new int[TotalDays];
		for (int i = 0; i < TotalDays; i++) {
			if (line.charAt(i) == '1') {
				PotionsBuyied += temp;
				PotionsBuyied=PotionsBuyied%Modulo;

			}
			temp = temp * temp;
			temp=temp%Modulo;

		}
		System.out.println(PotionsBuyied);
	}

}
