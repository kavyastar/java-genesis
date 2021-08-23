package day5.program3;

import java.util.ArrayList;
import java.util.Collections;

public class Team2 {
		private String name;
		private ArrayList<Player2> playerList=new ArrayList<Player2>();
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public ArrayList<Player2> getPlayerList() {
			Collections.sort(playerList);
			return playerList;
		}
		public void setPlayerList(ArrayList<Player2> playerList) {
			this.playerList = playerList;
		}
		
		public Team2(String name) {
			super();
			this.name = name;
		}
		
		public void addPlayer(String playername)
		{
			//- Add the new player to this team object
			this.playerList.add(new Player2(playername));
			
		}

		
	}

