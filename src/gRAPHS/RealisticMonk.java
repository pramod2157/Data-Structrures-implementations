package gRAPHS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

class RealisticMonk {
	public static void Main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		String line = br.readLine();
		int NoOfTests = Integer.parseInt(line);
		for (int i = 0; i < NoOfTests; i++) {

			TreeSet<Integer> ts1 = new TreeSet<Integer>();
			line = br.readLine();
			int NoOfEdges = Integer.parseInt(line);
			for (int j = 0; j < NoOfEdges; j++) {

				line = br.readLine();

				st = new StringTokenizer(line);

				ts1.add(Integer.parseInt(st.nextToken()));
				ts1.add(Integer.parseInt(st.nextToken()));

			}

			System.out.println(ts1.size());
			;
		}

	}
}
