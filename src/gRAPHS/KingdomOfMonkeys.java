package gRAPHS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class KingdomOfMonkeys {
	private static HashMap<Integer, ArrayList<Integer>> adjLists_dict;
	private static int[] al;
	private static TreeSet<Integer> t=new TreeSet<Integer>();
	static boolean[] visited;
	
	static void DFSimp(int s){
		int sum=0;
		Stack<Integer> dfsstack = new Stack<Integer>();
		visited[s]=true;
		dfsstack.add(s);
		while(!dfsstack.empty()){
			s=dfsstack.pop();
			sum=s;
		//	System.out.print(s+" ");
			 Iterator<Integer> i = adjLists_dict.get(s).iterator();
			  while (i.hasNext())
	            {
	                int n = i.next();
	                if (!visited[n])
	                {
	                //	System.out.print("item Value is"+ al[n]);
	                //	System.out.println();
	                	sum=sum+al[n];
	                //	System.out.print("Sum is"+ sum + " ");
	                    visited[n] = true;
	                    dfsstack.push(n);
	                }
	            }
              t.add(sum);   

		}
	//	System.out.println(t);
		
		//System.out.println(t);
		
	}
	
	public static void Main(String[] args) throws IOException {
		  adjLists_dict = new HashMap<Integer, ArrayList<Integer>>();
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
			String line=br.readLine();
			int NoOfTests=Integer.parseInt(line);
			for(int j=0;j<NoOfTests;j++){
			int connectedComponents=0;
		//	System.out.println("Enter number of vertices");
			line=br.readLine();
			st=new StringTokenizer(line);
			int NoOfNodes=Integer.parseInt(st.nextToken());
			//int NoOfNodes=Integer.parseInt(line);
			visited=new boolean[NoOfNodes]; 
			al=new int[NoOfNodes];
	      for(int v=0; v<NoOfNodes; v++){
	            adjLists_dict.put(v, new ArrayList<Integer>());
	        }
	      //System.out.println("Enter number of Edges");
	      //line=br.readLine();
	      int NoOfEdges=Integer.parseInt(st.nextToken());
	      for(int i=0;i<NoOfEdges;i++)
	      {
	    	  line=br.readLine();
	    	  st=new StringTokenizer(line);
	    	  int v1=Integer.parseInt(st.nextToken());
	    	  int v2=Integer.parseInt(st.nextToken());
	    	  adjLists_dict.get(v1).add(v2);
	    	  adjLists_dict.get(v2).add(v1);
	      
	      }
	      line=br.readLine();
	      st=new StringTokenizer(line);
	      for(int i = 1;i < NoOfNodes;++i) {
	      	 int v1=Integer.parseInt(st.nextToken());
	      	 al[i]=v1;
	      	
	      }
	      for(int i = 1;i < NoOfNodes;++i) {
	    	     if(visited[i] == false)     {
	    	    	 DFSimp(i);
	    	         connectedComponents++;
	    	     }
	    	    }
	      //DFSimp(0);
	         System.out.println("Max Element" + t.last());
			}
	}

}
