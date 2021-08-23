package day2;
import java.util.*;
public class Employee2 {
	private String name, address, mobile;

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}

	
	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getMobile() {
		return mobile;
	}

	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
class Employee2Main {

	
	private static void getDetails(Employee2 emp) {
		System.out.println("Name: " + emp.getName());
		System.out.println("Address: " + emp.getAddress());
		System.out.println("Mobile: " + emp.getMobile());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee2 emp = new Employee2();
		System.out.println("Enter the name: ");
		emp.setName(sc.nextLine());
		System.out.println("Enter Address: ");
		emp.setAddress(sc.nextLine());
		System.out.println("Enter mobile: ");
		emp.setMobile(sc.nextLine());
		
		System.out.println("Employee Details");
		getDetails(emp);
		System.out.println("Verify and Update the details:");
		int choice;
		
		do {
			System.out.println("Menu");
			System.out.println("1.Update Employee name");
			System.out.println("2.Update Employee Address");
			System.out.println("3.Update Employee mobile");
			System.out.println("4.All information correct/Exit");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1: {
				System.out.println("Current name is: " + emp.getName());
				System.out.println("Enter the name: ");
				emp.setName(sc.nextLine());
				break;
			}
			case 2: {
				System.out.println("Current address is: " + emp.getAddress());
				System.out.println("Enter the address: ");
				emp.setAddress(sc.nextLine());
				break;
				
			}
			case 3: {
				System.out.println("Current mobile is: " + emp.getMobile());
				System.out.println("Enter the mobile: ");
				emp.setMobile(sc.nextLine());
				break;
				
			}
			case 4: {
				break;
			}
			default: {
				System.out.println("Enter a valid choice");
				break;
			}
			}
		} while(choice!=4);
		System.out.println("The details are:");
		getDetails(emp);
		sc.close();
		
	}

	

}