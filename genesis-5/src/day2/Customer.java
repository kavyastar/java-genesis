package day2;
import java.util.*;
public class Customer{
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
class CustomerMain{
	public static void main(String [] args)
	{String dd;
	 Scanner in =new Scanner(System.in); 	
	 dd=in.nextLine();
	 String[] arrOfStr = dd.split(",");
	 Customer ob =new Customer();
		ob.setname(arrOfStr[0], arrOfStr[1], arrOfStr[2]);
		System.out.print("  Name : "+ob.getname()+" Address : "+ob.getaddress()+" Mobile : "+ob.getmobile());

	}
}