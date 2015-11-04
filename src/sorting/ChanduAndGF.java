package sorting;

import java.util.Scanner;

public class ChanduAndGF {
	private static int[] temp;
	static private int[] inArr;
	void merge_sort(int lowerIndex,int higherIndex){
		if(lowerIndex<higherIndex)
		{
			int mid = lowerIndex+(higherIndex-lowerIndex)/2;
			merge_sort(lowerIndex, mid);
			merge_sort(mid+1, higherIndex);
			merge(lowerIndex, mid, higherIndex);
		}
		
		
	}
	void merge(int lowerIndex,int mid, int higherIndex){
		for(int i=lowerIndex;i<=higherIndex;i++)
			temp[i]=inArr[i];
		 int i = lowerIndex;
	     int j = mid + 1;
	     int k = lowerIndex;
	        while (i <= mid && j <= higherIndex) {
	            if (temp[i] <= temp[j]) {
	                inArr[k] = temp[i];
	                i++;
	            } else {
	                inArr[k] = temp[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= mid) {
	            inArr[k] = temp[i];
	            k++;
	            i++;
	        }
	
		
	}
	
	public static void Main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		ChanduAndGF CGF=new ChanduAndGF();
		int size,noArrays=sc.nextInt();
		for(int i=0;i<noArrays;i++)
		{
			size=sc.nextInt();
			inArr= new int[size];
			temp=new int[size];
			for(int j=0;j<size;j++)
			{
				inArr[j]=sc.nextInt();
				
			}
			 /*int temp1;
		      for(int k = 0; k< size-1; k++) {
		      
		    	  for(int l = 0; l < size-k-1; l++) {
		    		  
		    		  if(temp[ l ] < temp[ l+1] ) {
		    			  
		    			    temp1 = temp[ l ];
		                       temp[ l ] = temp[ l+1 ];
		                       temp[ l + 1] =temp1 ;
		    		  }
		    		  
		    	  }
		      
		      
		      }*/
			CGF.merge_sort(0, size-1);
			
			
		      for(int j=0;j<size;j++)
		    	  System.out.print(inArr[j]+" ");
			
			System.out.println();
		}

	}

}