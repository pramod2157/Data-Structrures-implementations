package hASHING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class MonkAndTasks {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int NoOfTests=Integer.parseInt(br.readLine());
		for(int i=0;i<NoOfTests;i++){
		//	System.out.println("input No"+i);
		int NoOfDays=Integer.parseInt(br.readLine());
		String line=br.readLine();
	//	System.out.println(line);
		StringTokenizer st=new StringTokenizer(line);
		int[] Array=new int[st.countTokens()];
		//System.out.println(Array.length);
		int j=0;
		while(st.hasMoreTokens()){
			
		Array[j]=Integer.parseInt(st.nextToken());
	//	System.out.println(Array[j]);
		j++;
			}
		//System.out.println("Out Of loop");
		TreeMap<Integer,LinkedList<Integer>> hm=new TreeMap<Integer,LinkedList<Integer>>();
		for(j=0;j<Array.length;j++)
		{
			int key=Array[j];
			//System.out.println(key);
			int count=0;
			while(key!=0)
			{
				if(key%2==1)
					count++;
				key/=2;
			}
			if(!hm.containsKey(count))
				hm.put(count, new LinkedList<Integer>());
			//System.out.println(Array[j]+"="+count);
			LinkedList<Integer> al=hm.get(count);
			//System.out.println("adding"+ Array[j]);
			al.addLast(Array[j]);
			//System.out.println(al);
		}
		for(Map.Entry<Integer,LinkedList<Integer>> entry : hm.entrySet()) {
			  Integer key = entry.getKey();
			//  System.out.println(key);
			  LinkedList<Integer> value = entry.getValue();
			  Iterator itr=value.iterator();
			  for(Integer obj: value){
			  System.out.println(obj);}
			}

		
		
		
		
		}
	}

}
