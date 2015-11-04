package fileIOPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class FileDemo {

	public static void main(String[] args) {
		
		boolean newFile=false;
		String str="kasa vyaycha";
		File f=new File("abc.txt");
		System.out.println(f.exists());
	//	try {
		//	newFile=f.createNewFile();
			//FileWriter fw=new FileWriter(f);
			/*BufferedWriter fw=new BufferedWriter(new FileWriter(f,true));
			fw.append(str);
			fw.append("aaila");
			fw.flush();
			fw.close();
			System.out.println(f.exists());
			
			
			BufferedReader br=new BufferedReader(new FileReader(f));
			String temp=br.readLine();
			System.out.println(temp );*/
/*			PrintWriter pw=new PrintWriter(System.out);
			pw.append(str);
			pw.flush();
			pw.close();
*/			Console c=System.console();
		/*	char[] pq=new char[15];
			pq=c.readPassword();
			for(char q:pq){
				
				System.out.print(q+" ");
			}*/
String s=c.readLine("%s", "input:");
System.out.println(s);
			
			
		//	BufferedReader br=new BufferedReader(new FileReader(f));
			//String temp=br.readLine();
			//System.out.println(temp );
		//} //catch (IOException e) {
			
			//e.printStackTrace();
		//}

		
	}

}
