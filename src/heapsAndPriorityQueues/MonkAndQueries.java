package heapsAndPriorityQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MonkAndQueries {
	static int[] tree;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int item;
		int NoOfQueries=Integer.parseInt(br.readLine());
		for(int query=0;query<NoOfQueries;query++){
		int QueryNumber=br.read();
		if(QueryNumber==1||QueryNumber==2)
			 	item=br.read();
		
		
		System.out.println(QueryNumber);
		}
		
	}

}
