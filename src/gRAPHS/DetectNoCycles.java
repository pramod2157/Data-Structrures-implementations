package gRAPHS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class DetectNoCycles {
static int[][] graph;
static int[] visited;
static int NoOfVertices;
static Stack<Integer> inter ;
int NoOfCycles(){
	int NoOfCycles=0;
	
	
	return NoOfCycles;
}
void DFS(int source)
{
	int current=source;
	if(visited[current]==-1){
		visited[current]=1;
		inter.pop();
		System.out.print(current);
	for(int i=0;i<NoOfVertices;i++)
	{
		if(graph[current][i]==1)
		{
			if(visited[i]==-1)
				inter.push(i);
		}
		
	}
		
	}
	if(!inter.isEmpty()){
		System.out.print("->");
		DFS(inter.peek());}
	
}
	public static void main(String[] args) throws IOException{
		StringTokenizer st;
		System.out.println("Enter the number of vertices");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		NoOfVertices=Integer.parseInt(br.readLine());
		graph=new int[NoOfVertices][NoOfVertices];
		System.out.println("Enter the adjacency matrix");
		for(int i=0;i<NoOfVertices;i++){
			String line=br.readLine();
			st=new StringTokenizer(line);
			for(int j=0;j<NoOfVertices;j++)
				graph[i][j]=Integer.parseInt(st.nextToken());
			
		}
		visited=new int[NoOfVertices];
		for(int i=0;i<NoOfVertices;i++)
		{
			visited[i]=-1;
		}
		inter=new Stack<Integer>();
		/*System.out.println("Enter item to start DFS");
		int item=Integer.parseInt(br.readLine());
		inter.push(item);*/
		DetectNoCycles dc=new DetectNoCycles();
		for(int item=0;item<1;item++)
		{
			inter.push(item);
			dc.DFS(item);
			System.out.println();
		}
		
				

	}

}
