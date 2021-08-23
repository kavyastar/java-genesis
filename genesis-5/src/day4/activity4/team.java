package day4.activity4;
import java.util.*;
public class team {

	public static void main(String[] args) throws TeamNameNotFound{
		// TODO Auto-generated method stub
		String runner,winner;
		
		String [] teams = {"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kings XI Punjab","Kolkata Knight Riders", "Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
        Scanner sc =new Scanner(System.in);
        int check=0;
        System.out.print("Enter the expected winner team of IPL Season 13");
        winner = sc.nextLine();
        //System.out.print(winner);
        
        for(int i=0;i<8;i++)
        {
        	
        	if(teams[i].equals(winner))
        		{
        		check=1;
        		break;
        		}
        }
        if(check==0)
        {
        	throw new TeamNameNotFound();
        }
        else
        {
        	System.out.print("Enter the expected runner Team of IPL Season 13");
            runner = sc.nextLine();
            check=0;
            for(String a: teams)
            {
            	if(a.equals(winner))
            		{
            		check=1;
            		break;
            		}
            }
            if(check==0)
            {
            	throw new TeamNameNotFound();
            }
            else{
           System.out.print("Expected IPL Season 13 winner: "+winner+"\nExpected IPL Season 13 runner: "+runner);
            }
        }
        
        

	}

}
