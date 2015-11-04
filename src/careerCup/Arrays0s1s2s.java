package careerCup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Arrays0s1s2s {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		String[] arr=line.split(",");
		//StringTokenizer st=new StringTokenizer(line);
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+",");
		
		
	}

}
