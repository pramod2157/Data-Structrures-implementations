package hASHING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class MonkAndCollision {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tests=Integer.parseInt(br.readLine());
		for(int i=0;i<tests;i++)
		{
			int collisions=0;
			HashSet<Integer> monk=new HashSet<Integer>();
			int Totalnumbers=Integer.parseInt(br.readLine());
			String numbers=br.readLine();
			StringTokenizer st=new StringTokenizer(numbers);
			while(st.hasMoreTokens())
			{
				int temp=Integer.parseInt(st.nextToken());
				temp=temp%10;
				Boolean status=monk.add(temp);
				if(status==false)
					collisions++;
				
			}
			
			System.out.println(collisions);
		}
	}

}
