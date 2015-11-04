package sorting;

import java.util.Scanner;

public class Puchi {

	public static void Main(String[] args) {
	int count;
		Scanner sc =new Scanner(System.in);
	int noOfTest=sc.nextInt();
	for(int i=0;i<noOfTest;i++)
	{
		int noOfFriends=sc.nextInt();
		int[] weight=new int[noOfFriends];
		int[] future=new int[noOfFriends];
		for(int j=0;j<noOfFriends;j++)
			weight[j]=sc.nextInt();
		for(int j=0;j<noOfFriends;j++){
			count=0;
			for(int k=j+1;k<noOfFriends;k++)
			{
				if(weight[j]>weight[k])
					count++;
			}
			future[j]=count;
		}
		for(int item: future)
			System.out.print(item+ " ");
			
		
	}
	}

}
