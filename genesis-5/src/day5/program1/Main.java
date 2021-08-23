package day5.program1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
        System.out.println("Please provide the number of players to be registered");
        number= sc.nextInt();
   	    sc.nextLine();
		ArrayList <Player> play=new ArrayList<Player>();
		for(int i=0;i<number;i++)
		{
			System.out.println("Please enter player name :");
			String name=sc.nextLine();
			System.out.print("Please select the skill of the player \n1.All Rounder\n2.Batsman\n3.Bowler\n1/2/3?"); 
		    int val=sc.nextInt();
		    sc.nextLine();
		/*    String skill = null;
		    if(val==1)
		    	skill="All Rounder";
		    else if (val==2)
		    	skill="Batsman";
		    else if (val==3)
		    	skill="Bowler";
		    	*/
			play.add(new Player(name,Integer.toString(val)));
		}
		//Collections.sort(play);  not able to use this for custom list. so player implements comparable
		Collections.sort(play,new PlayerComparator());
		for (Player p: play)
		{
			System.out.println("Player : "+p.getName()+" : "+p.getSkilltoprint());
		}
	}

}
