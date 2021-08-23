package day5.program2;

import java.util.Comparator;
import java.lang.Integer;
public class TeamComparator implements Comparator <Team>{

	public int compare(Team arg0, Team arg1) {
		// TODO Auto-generated method stub
		if(arg0.getNumberOfMatches()<arg1.getNumberOfMatches())
		{
			return -1;
		}
		else if(arg0.getNumberOfMatches()>arg1.getNumberOfMatches())
		{
			return 1;
			
		}
		else
		{
			return 0;
		}
	}

}
