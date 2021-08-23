package day2;
import java.util.*;
public class Innings{
private	String teamname,	inningsname;
private int runs;

	public void setname(String teamname, String inningsname,int runs)
	{
		this.inningsname=inningsname;
		this.runs=runs;
		this.teamname=teamname;
	}
	public String getteamname()
	{
		return this.teamname;
	}
	public String getinningsname()
	{
		return this.inningsname;
	}
	public int getruns()
	{
		return this.runs;
	}
	public void displayInningsDetails()
	{
		System.out.print(this.teamname+" "+this.inningsname+" "+this.runs);
	}
}
class InningsMain{
	
	public static void main(String [] args)
	{
		String teamname,inningsname;
		int runs;
		System.out.println(" Enter the team name: ");
        Scanner in =new Scanner(System.in);
			teamname=in.nextLine();
			System.out.print(" Enter session:");
			inningsname=in.nextLine();
			System.out.print("Enter runs:" );
			runs=in.nextInt();
			Innings ob1 = new Innings();
			ob1.setname(teamname, inningsname, runs);
			ob1.displayInningsDetails();
			
			
	}
}
