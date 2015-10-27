package hASHING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class LandOfPokemons {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tests=Integer.parseInt(br.readLine());
		for(int i=0;i<tests;i++)
		{
			TreeSet ts=new TreeSet<Integer>();
			int ItemsToCarry=0;
			
			int NoOfPonds=Integer.parseInt(br.readLine());
			for(int j=0;j<NoOfPonds;j++)
			{
				String line=br.readLine();
				StringTokenizer st=new StringTokenizer(line);
				int foodType=Integer.parseInt(st.nextToken());
				ts.add(foodType);
				int pondType=Integer.parseInt(st.nextToken());
				//if(foodType<pondType&&foodType>=j-1)
					//ItemsToCarry++;
				if(!ts.contains(pondType)){
					ItemsToCarry++;
					ts.remove(pondType);
				}
			}
			System.out.println(ItemsToCarry);
		
		
		}

	}

}
