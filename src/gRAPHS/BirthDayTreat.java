package gRAPHS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BirthDayTreat {

	public static void Main(String[] args) throws IOException {
		//HashMap<Integer,Integer> bd1=new HashMap<Integer,Integer>();
		TreeSet<Integer> t=new TreeSet<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		StringTokenizer st=new StringTokenizer(line);
		int N=Integer.parseInt(st.nextToken());
		int D=Integer.parseInt(st.nextToken());
		for(int i=0;i<D;i++)
		{
			line=br.readLine();
			st=new StringTokenizer(line);
			int key=Integer.parseInt(st.nextToken());
			int value=Integer.parseInt(st.nextToken());
			t.add(key);
			//bd1.put(key, value);
			
		}
		/*  Iterator it = bd1.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        int key=(int)pair.getKey();
		        int value=(int)pair.getValue();
		        if(bd1.containsKey(value))
		        	t.add(key);
		       // System.out.println(pair.getKey()+"   "+pair.getValue());
		    
		    }*/
		System.out.println(t.size());
	}

}
