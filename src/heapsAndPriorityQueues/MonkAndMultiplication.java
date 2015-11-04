package heapsAndPriorityQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MonkAndMultiplication {
	static int[] tree;
	static int[] temp;
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
/*		tree[i]=tree[i]+tree[j];
		tree[j]=tree[i]-tree[j];
		tree[i]=tree[i]-tree[j];*/
		temp[i]=temp[i]+temp[j];
		temp[j]=temp[i]-temp[j];
		temp[i]=temp[i]-temp[j];
			
	}
	public static void build_maxHeap(int[] arr,int N)
	{
		for(int i=N/2;i>=1;i--)
		{
			
			heapify(tree,i,N);
		}
		
	}

	public static int heap_sort(int[] Arr,int N)
	{
		temp=new int[N+1];
		for(int i=1;i<=N;i++)
			temp[i]=Arr[i];
	    int heap_size = N;
	    build_maxHeap(Arr,N);
	    for(int i = N; i>=2 ; i-- )
	    {
	        swap(1,i);
	        heap_size = heap_size-1;
	        build_maxHeap(Arr, heap_size);
	    }
	    
	    return temp[1]*temp[2]*temp[3];
	}
	public static void main(String[] args) throws IOException{
		System.out.println("Enter the array you want to sort");
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
		int[] result=new int[N+1];
		result[1]=-1;
		result[2]=-1;
		for(i=3;i<N+1;i++)
		{
			int tempResult=heap_sort(tree, i);
			result[i]=tempResult;
			
		}
		for(i=1;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		//heap_sort(tree, N);
	}

}
