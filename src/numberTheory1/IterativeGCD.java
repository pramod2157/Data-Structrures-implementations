package numberTheory1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IterativeGCD {
	int GCD(int A,int B)
	{
		int gcd=0;
		for(int i=B;i>0;--i)
		{
			
			if(A%i==0&&B%i==0){
				gcd=i;
				break;
			}
			
		}
		return gcd;
	}

	public static void Main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		StringTokenizer st=new StringTokenizer(line);
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		IterativeGCD IG=new IterativeGCD();
		int gcd=IG.GCD(Math.max(A, B), Math.min(A, B));
		System.out.println(gcd);


	}

}
