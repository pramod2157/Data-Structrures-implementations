package gRAPHS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {//not complete solution
	
	static ArrayList<LinkedList<Integer>> AdjList;
	static Queue<Integer> Q=new LinkedList<Integer>();
	static boolean[] visited;
	public static void BreadFirstSearch(Queue<Integer> q)
	{
		int item=q.poll();
		int size = AdjList.get(item).size();
		for(int i=0;i<size;i++)
		{
		Q.add(AdjList.get(item).get(i));
		}
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String line=br.readLine();
		int NoOfNodes=Integer.parseInt(line);
		visited=new boolean[NoOfNodes];
		AdjList=new ArrayList<LinkedList<Integer>>(NoOfNodes);//Graph nodes start from number 0;
		for(int i=0;i<NoOfNodes;i++)
			AdjList.add(new LinkedList<Integer>());
		System.out.println("Enter number of edges");
		line=br.readLine();
		int edges=Integer.parseInt(line);
		for(int i=0;i<edges;i++)
		{
			line=br.readLine();
			st=new StringTokenizer(line);
			int v1=Integer.parseInt(st.nextToken());
			int v2=Integer.parseInt(st.nextToken());
			AdjList.get(v1).addLast(v2);
			AdjList.get(v2).addLast(v1);
			
		}
		System.out.println(AdjList);
		for(int i=0;i<NoOfNodes;i++){
			if(visited[i]==false)
				visited[i]=true;
				System.out.println(i);
				if(!AdjList.get(i).isEmpty()){
				Q.add(AdjList.get(i).getFirst());
			BreadFirstSearch(Q);}
				}
		
	}

}
