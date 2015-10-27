package gRAPHS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class BFSAdjListMap {
	private static HashMap<Integer, ArrayList<Integer>> adjLists_dict;
	static boolean[] visited;
	 static void BFS(int s)
	    {
	       
	        LinkedList<Integer> queue = new LinkedList<Integer>();
	 
	        visited[s]=true;
	        queue.add(s);
	 
	        while (queue.size() != 0)
	        {
	            s = queue.poll();
	            System.out.print(s+" ");
	 
	            Iterator<Integer> i = adjLists_dict.get(s).iterator();
	            while (i.hasNext())
	            {
	                int n = i.next();
	                if (!visited[n])
	                {
	                    visited[n] = true;
	                    queue.add(n);
	                }
	            }
	        }
	    }
	public static void Main(String[] args) throws IOException {
	
	        adjLists_dict = new HashMap<Integer, ArrayList<Integer>>();
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
			System.out.println("Enter number of vertices");
			String line=br.readLine();
			int NoOfNodes=Integer.parseInt(line);
			visited=new boolean[NoOfNodes]; 
	      for(int v=0; v<NoOfNodes; v++){
	            adjLists_dict.put(v, new ArrayList<Integer>());
	        }
	      System.out.println("Enter number of Edges");
	      line=br.readLine();
	      int NoOfEdges=Integer.parseInt(line);
	      for(int i=0;i<NoOfEdges;i++)
	      {
	    	  line=br.readLine();
	    	  st=new StringTokenizer(line);
	    	  int v1=Integer.parseInt(st.nextToken());
	    	  int v2=Integer.parseInt(st.nextToken());
	    	  adjLists_dict.get(v1).add(v2);
	    	  adjLists_dict.get(v2).add(v1);
	      
	      }
	      BFS(0);
	   
	         
	       
	       
	         
	        System.out.println("\nPrint all adjacency lists with corresponding vertex:");
	        for(int v=0; v<NoOfNodes; v++){
	            System.out.println(v + ": " + adjLists_dict.get(v));
	        }
	         
	    }
	 

	}


