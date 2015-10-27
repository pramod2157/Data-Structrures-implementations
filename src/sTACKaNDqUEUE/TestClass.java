package sTACKaNDqUEUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;


class TestClass {
	public static int count;
	//String[] CallingOrder,IdealOrder;
	public static LinkedList<String> llCalling;
	public static LinkedList<String> llIdeal;
public static void Order()
{
	if(llCalling.getFirst().equals(llIdeal.getFirst())){
		count++;
		llCalling.removeFirst();
		llIdeal.removeFirst();
	}
	else{
		String o=llCalling.removeFirst();
		llCalling.addLast(o);
		count++;
		
	}
	
}
    public static void Main(String args[] ) throws IOException{
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
    	Scanner sc=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String[] CallingOrder=new String[N];
        llCalling=new LinkedList<String>();
        llIdeal=new LinkedList<String>();
        for(int i=0;i<N;i++)
        {
        	CallingOrder[i]=sc.next();
        	//System.out.println(CallingOrder[i]);
        	llCalling.add(CallingOrder[i]);
        }
        String[] IdealOrder=new String[N];
        for(int i=0;i<N;i++)
        {
        	IdealOrder[i]=sc.next();
        	
        	llIdeal.add(IdealOrder[i]);
        }
/*        //line=br.readLine();
        //String[] CallingOrder=line.split("");
        line=br.readLine();
        //String[] IdealOrder=line.split("");
      	//int length=CallingOrder.length;
        for(int i=0;i<length;i++){
        	System.out.println(CallingOrder[i]);
        	//llCalling.add(CallingOrder[i]);
        }
        for(int i=0;i<length;i++){
        	
        //	llIdeal.add(IdealOrder[i]);
        }
*/
       // System.out.println(llCalling);
       // System.out.println(llIdeal);
        while(!llCalling.isEmpty())
        {
        	Order();
        }
        System.out.println(count);
    }
}

