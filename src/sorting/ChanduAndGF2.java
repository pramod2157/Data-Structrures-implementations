package sorting;

import java.util.Scanner;

public class ChanduAndGF2 {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int noOfTests=sc.nextInt();
		for(int i=0;i<noOfTests;i++)
		{
			int n=sc.nextInt();
			int[] arrayN=new int[n];
			int m=sc.nextInt();
			int[] arrayM=new int[m];
			int[] mn=new int[m+n];
			for(int j=0;j<n;j++)
				arrayN[j]=sc.nextInt();
			for(int j=0;j<m;j++)
				arrayM[j]=sc.nextInt();
			int j=0,k=0,l=0;
			while(j<n&&k<m)
			{
				if(arrayN[j]>arrayM[k]){
					mn[l]=arrayN[j];
					j++;}
				else{
					mn[l]=arrayM[k];
					k++;
				}
				
				l++;
			}
			if(j<n)
			{
				while(j<n)
				{
				mn[l]=arrayN[j];
				j++;
				l++;
				}
			}
			if(k<m)
			{
				while(k<m)
				{
				mn[l]=arrayM[k];
				k++;
				l++;
				}
			}
			for(j=0;j<m+n;j++)
			{
				System.out.print(mn[j]+ " ");
			}
			System.out.println();
		}
	}

}
