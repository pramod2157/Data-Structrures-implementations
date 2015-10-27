package numberTheory1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EculidianGCD {
	int GCD(int A,int B){
		if(B==0)
			return A;
		else return GCD(B,A%B);
			
	}

	public static void Main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		StringTokenizer st=new StringTokenizer(line);
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		EculidianGCD EG=new EculidianGCD();
		int gcd=EG.GCD(Math.max(A, B), Math.min(A, B));
		System.out.println(gcd);

	}

}
