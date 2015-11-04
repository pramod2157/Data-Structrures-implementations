package careerCup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class SentenceReversal {

	public static void Main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sentence=br.readLine();
		StringTokenizer st=new StringTokenizer(sentence," ");
		ArrayList<String> al=new ArrayList<String>();
		while(st.hasMoreTokens())
		{
			al.add(st.nextToken());
		}
		int last=al.size()-1;
		char last1=al.get(last).charAt(al.get(last).length()-1);
		
		if(last1=='.'){
		//	System.out.println("YES");
			String finalLast=al.get(last).substring(0, al.get(last).length()-1);
			al.add(last, finalLast);
			for(int i=last;i>=0;i--)
				System.out.print(" "+al.get(i));
			System.out.println(".");
//			System.out.println(finalLast);
		}
		else{
			
			for(int i=last;i>=0;i--)
				System.out.print(" "+al.get(i));
		}
		
		
		//System.out.println(al);

	}

}
