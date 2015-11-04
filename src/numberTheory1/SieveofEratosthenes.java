package numberTheory1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SieveofEratosthenes {

	public static void Main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		boolean[] prime=new boolean[n+1];
		for(int i=0;i<=n;i++)
		{
			prime[i]=true;
		//	System.out.println(prime[i]);
			
		}
		prime[0]=false;
		prime[1]=false;
		for(int i=2;i*i<=n;i++)
		{
			if(prime[i]==true)
			{
				for(int j=i*i;j<=n;j+=i)
					prime[j]=false;
				
			}
			
		}
		for(int i=0;i<=n;i++)
		{
			if(prime[i]==true)
				System.out.println(i);
			
		}

	}

}
