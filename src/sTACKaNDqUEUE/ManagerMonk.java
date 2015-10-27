package sTACKaNDqUEUE;

import java.util.Scanner;
import java.util.Stack;

public class ManagerMonk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<Integer>();
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			int type=sc.nextInt();
			if(type==2){
				int price=sc.nextInt();
				s.push(price);
			}
			else if(type==1)
			{	if(s.empty())
					System.out.println("No Food");
				else	
				System.out.println(s.pop());
			}
				
			
		}
	}

}
