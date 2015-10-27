package gRAPHS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MonkAtGraphFactory {

	public static void Main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int NoOfVertices=Integer.parseInt(bf.readLine());
		String line=bf.readLine();
		StringTokenizer st=new StringTokenizer(line);
		//ArrayList al=new ArrayList<Integer>();
		int sum=0;
		while(st.hasMoreTokens())
		{
			int value=Integer.parseInt(st.nextToken());
		//	al.add(value);
			sum=sum+value;
			
		}
		int edges=sum/2;
		if(NoOfVertices-1==edges)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
