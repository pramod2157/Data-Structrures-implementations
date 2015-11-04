package numberTheory1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeSqrt {

	boolean checkPrime(int number){
		boolean prime=false;
		int count=0;
		for(int i=1;i*i<=number;++i)
		{
			//System.out.println(i);
			if(number%i==0){
				if(i*i==number)
					count++;
				else
					count+=2;
				
			}
							
		}
		if(count==2)
			prime=true;
		
		
		return prime;
	}
	public static void Main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
		PrimeSqrt ps=new PrimeSqrt();
		boolean result=ps.checkPrime(number);
		System.out.println(result);
		
	}

}
