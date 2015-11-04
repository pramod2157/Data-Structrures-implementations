package heapsAndPriorityQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxHeap {
	static int[] tree;
	public static void heapify(int[] arr,int i,int N)
	{
		int largest;
		int left=2*i;
		int right=2*i+1;
		if(left<=N && arr[i]<arr[left])
			largest=left;
		else
			largest=i;
		if(right<=N && arr[largest]<arr[right])
			largest=right;
		if(i!=largest)
		{
			swap(i,largest);
			heapify(arr,largest,N);
			
		}
		
		
	}
	public static void swap(int i,int j)
	{
		tree[i]=tree[i]+tree[j];
		tree[j]=tree[i]-tree[j];
		tree[i]=tree[i]-tree[j];
			
	}

	public static void Main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		StringTokenizer st=new StringTokenizer(line);
		int N=st.countTokens();
		tree=new int[N+1];
		int i=1,item;
		while(st.hasMoreTokens())
		{
			item=Integer.parseInt(st.nextToken());
			tree[i]=item;
			i++;
			
		}
		for(i=N/2;i>=1;i--)
		{
			
			heapify(tree,i,N);
		}
		for(i=1;i<tree.length;i++)
		{
			System.out.println(tree[i]);
		}
		
		

	}

}
