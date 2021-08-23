package day5.program1;

import java.util.Comparator;

public class PlayerComparator implements Comparator <Player> {
	
	public int compare(Player player1, Player player2){
		if(player1.getSkill().compareTo(player2.getSkill())==0)
		{
			return player1.getName().compareTo(player2.getName());
		}
		else{
			return player1.getSkill().compareTo(player2.getSkill());
		}
	}

	

}
