package sEARCHING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PolyMonk {

	 public static void main(String args[] ) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        String line = br.readLine();
		        int N = Integer.parseInt(line);
		        for(int j=0;j<N;j++){
		        line=br.readLine();
		        StringTokenizer st=new StringTokenizer(line);
		        int A =Integer.parseInt(st.nextToken());
		        int B = Integer.parseInt(st.nextToken());
				int C =Integer.parseInt(st.nextToken());
		        int K = Integer.parseInt(st.nextToken());
		        int X=K/2;
		        while((A*X*X+B*X+C)>K)
		        {
		        X=X/2;	
		        	
		        }
		        
		        for(int i=X+1;i<2*X;i++)
		        {
		        	if((A*i*i+B*i+C)>K)
		        		{
		        			X=i;
		        			break;
		        		}
		        	
		        }
		        System.out.println(X);
		    }
		    }
		}



