package sEARCHING;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TestClass {

	public static void Main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
       // int N = Integer.parseInt(line);
       // line = br.readLine();
        StringTokenizer st=new StringTokenizer(line);
        int N=Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        line=br.readLine();
        st=new StringTokenizer(line);
        //String[] arr=line.split(" ");
        ArrayList al=new ArrayList();
        while(st.hasMoreTokens())
        	al.add(st.nextToken());
        for(int i=0;i<Q;i++)
        {
        	line = br.readLine();
            int item = Integer.parseInt(line);
            if(al.contains(line))
            	System.out.println("YES");
            else
            	System.out.println("NO");
        	
        }

	}

}
