package greedyMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class ArjitAndApex {

	public static void Main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int NoOfTests=Integer.parseInt(br.readLine());
		for(int tests=0;tests<NoOfTests;tests++)
		{
		String line=br.readLine();
		StringTokenizer st=new StringTokenizer(line);
		int M=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		HashMap<Integer, Integer> newSkills=new HashMap<Integer, Integer>(M);
		HashMap<Integer,Integer> oldSkills=new HashMap<Integer, Integer>(N);
		for(int i=0;i<M;i++)
		{
			line=br.readLine();
			st=new StringTokenizer(line);
			int skill=Integer.parseInt(st.nextToken());
			int proficiency=Integer.parseInt(st.nextToken());
			newSkills.put(skill, proficiency);
		}
		for(int i=0;i<N;i++)
		{
			line=br.readLine();
			st=new StringTokenizer(line);
			int skill=Integer.parseInt(st.nextToken());
			int proficiency=Integer.parseInt(st.nextToken());
			oldSkills.put(skill, proficiency);
			
		}
		line=br.readLine();
		st=new StringTokenizer(line);
		int GoodPairs=Integer.parseInt(st.nextToken());
		int GreatCombi=Integer.parseInt(st.nextToken());
		int ActualGood=0,ActualGreat=0;
		
		Iterator<Entry<Integer, Integer>> newski=newSkills.entrySet().iterator();
		while(newski.hasNext())
		{
			Map.Entry<Integer, Integer> temp=newski.next();
			int skillToMatch=temp.getKey();
			if(oldSkills.containsKey(skillToMatch)){
				ActualGood++;
				int oldProf=oldSkills.get(skillToMatch);
				int newProf=newSkills.get(skillToMatch);
				if(newProf<=oldProf){
					ActualGreat++;}
			oldSkills.remove(skillToMatch);
			//newSkills.remove(skillToMatch);
			}
			
		}
		if(ActualGreat>=GreatCombi)
			System.out.println("Great");
		else if(ActualGood>=GoodPairs)
			System.out.println("Good");
		else
			System.out.println(":)");

	}
  }
}
