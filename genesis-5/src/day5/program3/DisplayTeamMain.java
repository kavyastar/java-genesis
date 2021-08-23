package day5.program3;

import java.util.*;
import java.util.Map.Entry;

public class DisplayTeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
        System.out.println("number of input elements");
        number= sc.nextInt();
   	    sc.nextLine();
   	 ArrayList <Team2> t=new ArrayList<Team2>();
   	TreeMap<String, Team2> teams = new TreeMap<String, Team2>();

	System.out.print("team and player information in the format teamname|playername."); 
	
   	for(int i=0;i<number;i++)
		{
						String name=sc.nextLine();
			 String[] val = name.split("\\|");
			 String team_name = val[0];
			 String player_name = val[1];
			 if(teams.containsKey(team_name)) {
					Team2 team = teams.get(team_name);
					team.addPlayer(player_name);
				}
				else {
					Team2 team = new Team2(team_name);
					team.addPlayer(player_name);
					teams.put(team_name, team);
				}
			 
			 
		}
   	Set<Map.Entry<String, Team2>> entries = teams.entrySet();
	 
	 for(Map.Entry<String, Team2> entry : entries) {
			System.out.println(entry.getKey());
			for(Player2 playerName:entry.getValue().getPlayerList()) {
				System.out.println("--"+playerName.getName());
			}
		}

	}

}
