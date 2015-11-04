package competetions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SuperProfJavaPalinParis {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int NoOfStrings=Integer.parseInt(br.readLine());
		//String[] input=new String[NoOfStrings];
		StringBuilder input;//=new StringBuilder();
		ArrayList<StringBuilder> al=new ArrayList<StringBuilder>(NoOfStrings);
		
		for(int i=0;i<NoOfStrings;i++)
		{
			input=new StringBuilder(br.readLine());
			al.add(input);
			}
		int count=0;
		for(int i=0;i<NoOfStrings-1;i++)
		{
			for(int j=i;j<NoOfStrings;j++){
				
				StringBuilder temp=al.get(j);
				if(al.get(i).equals(temp.reverse()))
				{
					count++;
					
				}
			}
		
			
		}
		System.out.println(count);
	}

}
