package day2;
import java.util.*;
public class Employee{
	private String name,address,mobile;
	public void setname(String name,String address, String mobile)
	{
		this.name=name;
		this.address=address;
		this.mobile=mobile;
		
	}
	public String getname()
	{
		return this.name=name;
		
	}
	public String getaddress()
	{
		return this.address=address;
		
	}
	
	public String getmobile()
	{
		return this.mobile=mobile;
	}
	
}
class EmployeeMain
{
	public static void main(String [] args)
	{
		String name,address,mobile;
		Scanner in =new Scanner(System.in);
		name=in.nextLine();
		address=in.nextLine();
		mobile=in.nextLine();
		Employee ob =new Employee();
		ob.setname(name, address, mobile);
		System.out.print(" Employee Details\n Name : "+ob.getname()+" Address : "+ob.getaddress()+" Mobile : "+ob.getmobile());
	}
}