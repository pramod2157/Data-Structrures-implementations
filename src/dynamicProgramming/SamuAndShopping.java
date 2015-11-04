package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SamuAndShopping {
static int[][] shopCosts;
static int[][] idealCost;
int minCost(int i,int current){
	int next1=(current+1)%3;
	int next2=(current+2)%3;
	if(shopCosts.length-i==1)
		return Math.min(shopCosts[i][next1], shopCosts[i][next2]);
	else{
		if(idealCost[i][current]!=-1)
			return idealCost[i][current];
		else 
			return idealCost[i][current]=Math.min(minCost(i+1, next1)+shopCosts[i][next2], minCost(i+1, next2)+shopCosts[i][next1]);
	}
}
	
	public static void main(String[] args) throws IOException{
		int shirt,pant,shoe;
		StringTokenizer st;
		SamuAndShopping sas=new SamuAndShopping();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int NoOfTests=Integer.parseInt(br.readLine());
		for(int test=0;test<NoOfTests;test++)
		{
			int NoOfShops=Integer.parseInt(br.readLine());
			shopCosts = new int[NoOfShops][3];
			idealCost = new int[NoOfShops][3];
			for(int i=0;i<NoOfShops;i++){
				String line=br.readLine();
				st=new StringTokenizer(line);
				shirt=Integer.parseInt(st.nextToken());
				pant=Integer.parseInt(st.nextToken());
				shoe=Integer.parseInt(st.nextToken());
				shopCosts[i][0]=shirt;
				shopCosts[i][1]=pant;
				shopCosts[i][2]=shoe;
				idealCost[i][0]=-1;
				idealCost[i][1]=-1;
				idealCost[i][2]=-1;
			}
			int min1=sas.minCost(0, 0);
			int min2=sas.minCost(0, 1);
			int min3=sas.minCost(0, 2);
			int min=Math.min(min2, Math.min(min1, min3));
			System.out.print(min);
			if(test!=NoOfTests-1) System.out.println();
		}
	}

}
