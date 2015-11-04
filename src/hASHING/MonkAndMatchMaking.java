package hASHING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MonkAndMatchMaking {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		int NoOfQueries = Integer.parseInt(br.readLine());
		for(int i=0;i<NoOfQueries;i++){
			
			String indexes=br.readLine();
			StringTokenizer st=new StringTokenizer(indexes);
			int L1=Integer.parseInt(st.nextToken());
			int R1=Integer.parseInt(st.nextToken());
			int L2=Integer.parseInt(st.nextToken());
			int R2=Integer.parseInt(st.nextToken());
			String first=line.substring(L1-1, R1);
			String second=line.substring(L2-1, R2);
			//System.out.println("first"+first);
			//System.out.println("second"+second);
			if(first.equals(second))
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
