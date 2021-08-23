package day5.program1;

public class Player {

	private String name,skill;
	
	public Player(String name, String skill) {
		//super();
		this.name = name;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {

		return skill;
	}
	public String getSkilltoprint() {

		String for_ret=null;
	    if(skill.equals("1"))
	    	for_ret= "All Rounder";
	    else if (skill.equals("2"))
	    	for_ret= "Batsman";
	    else if (skill.equals("3"))
	    	for_ret= "Bowler";
	    return for_ret;

	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}

	
	
	
	

}
