package sorting;

import java.util.Scanner;

public class Monk {
	static int[][] curse;
	//int length=curse.length;
	int optimal(int length)
	{
		int min=999999999;
		String type=null;
		int sum,rowNo=0,columnNo=0;
		for(int i=0;i<length;i++){
			sum=0;
			for(int j=0;j<length;j++){
				sum=sum+curse[i][j];
			}
			if(sum<min)
			{
				min=sum;
				type="Row";
				rowNo=i;
			}
					
		}
		for(int i=0;i<length;i++){
			sum=0;
			for(int j=0;j<length;j++){
				sum=sum+curse[j][i];
			}
			if(sum<min)
			{
				min=sum;
				type="Column";
				columnNo=i;
			}
					
		}
		if(type.equals("Row"))
		{
			for(int i=0;i<length;i++)
				curse[rowNo][i]+=1;
		}
		else if(type.equals("Column"))
		{
			for(int i=0;i<length;i++)
				curse[i][columnNo]+=1;
		}
		return min;

	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Monk m=new Monk();
		int noOfTest=sc.nextInt();
		for(int i=0;i<noOfTest;i++)
		{
			int n=sc.nextInt();
			curse=new int[n][n];
			int k=sc.nextInt();
			int relief=0;
			for(int j=0;j<n;j++){
				
				for(int l=0;l<n;l++)
				{
					curse[j][l]=sc.nextInt();
				}
			}
			for(int j=0;j<k;j++)
				relief=relief + m.optimal(n);
				
			System.out.println(relief);
		}

	}

}
