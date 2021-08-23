package day2;
import java.util.*;
class Company {
	private String name, employees,teamlead;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployees() {
		return employees;
	}


	public void setEmployees(String employees) {
		this.employees = employees;
	}

	
	public String getTeamlead() {
		return teamlead;
	}

	
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	

}


class CompanyMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Company com = new Company();
		System.out.println("Enter the company name: ");
		com.setName(sc.nextLine());
		System.out.println("Enter the employees: ");
		com.setEmployees(sc.nextLine());
		System.out.println("Enter TeamLead: ");
		com.setTeamlead(sc.nextLine());
		
		String[] empNames = com.getEmployees().split(",");
		String teamLead = com.getTeamlead();
		boolean check = false;
		for (String a:empNames) {
			if(a.equals(teamLead)) {
				check =true;
			}
		}
		if(check) {
			System.out.println("Name: " +com.getName());
			System.out.println("Employees: "+com.getEmployees());
			System.out.println("Lead: "+com.getTeamlead());
		}
		else {
			System.out.println("Invalid Input");
			
		}
	}
}