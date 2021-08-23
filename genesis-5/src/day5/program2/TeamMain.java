package day5.program2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import day5.program1.Player;
import day5.program1.PlayerComparator;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of teams:");
        number= sc.nextInt();
   	    sc.nextLine();
   	 ArrayList <Team> t=new ArrayList<Team>();
		for(int i=0;i<number;i++)
		{
			
			System.out.print("Enter team" +(i+1) +" detail \nEnter Name"); 
			String name=sc.nextLine();
			System.out.println("Enter number of matches");
			long val=sc.nextInt();
		    sc.nextLine();
		
			t.add(new Team(name,val));
		}
		//Collections.sort(play);  not able to use this for custom list. so player implements comparable
		Collections.sort(t,new TeamComparator());
		System.out.println("Team list after sort by number of matches");
		for (Team p: t)
		{
			System.out.println(p.getName()+" : "+p.getNumberOfMatches());
		}

	}

}
