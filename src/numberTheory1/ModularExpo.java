package numberTheory1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ModularExpo {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a , b, c in order");
		String line=br.readLine();
		StringTokenizer st=new StringTokenizer(line);
		long a=Integer.parseInt(st.nextToken());
		long b=Integer.parseInt(st.nextToken());
		long c=Integer.parseInt(st.nextToken());
		long ans=1;
		while(b!=0){
			
			if(b%2==1){
				ans=ans*a;
				ans=ans%c;
								
			}
			
			a=a*a;
			a=a%c;
			b=b/2;
			
		}
		System.out.println(ans);
	}

}
