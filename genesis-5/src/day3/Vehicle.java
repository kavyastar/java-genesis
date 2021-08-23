package day3;

import java.util.*;

public class Vehicle {
	
private String make,vehicleNumber,fuelType;
private int cc,fuelCapacity;

	public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
	{
	  this.make=make;
	  this.cc=cc;
	  this.vehicleNumber=vehicleNumber;
	  this.fuelCapacity=fuelCapacity;
	  this.fuelType=fuelType;
	}
	public void displayMake()
	{
		System.out.print(this.make); 
	}
	public void displayBasicInfo()
	{
		System.out.println("Basic INformation");
		System.out.println("Make: "+this.make);
		System.out.println("Vehicle number: "+this.vehicleNumber);
		if(this.fuelType.equals('1'))
		System.out.println("Fueltype: petrol");
		else
		System.out.println("Fueltype: diesel");
		System.out.println("Fuelcapacity: "+this.fuelCapacity);
		System.out.println("cc: "+this.cc);
	}
	public void displayDetailInfo(){
	}
	
}
class TwoWheeler extends Vehicle{
	String kickStartAvailable;
	public TwoWheeler(String make, String vehicleNumber, String fuelType,
			Integer fuelCapacity, Integer cc,String kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
		this.kickStartAvailable= kickStartAvailable;
	}
	
	public void displayDetailInfo()
	{
		System.out.println("Detailed INformation");
		System.out.println("Kick start available: "+kickStartAvailable);
	}
}
class FourWheeler extends Vehicle{
	String audioSystem;
	int numberOfDoors;
	public FourWheeler(String make, String vehicleNumber, String fuelType,
			Integer fuelCapacity, Integer cc, String audioSystem,int numberOfDoors ) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
		this.audioSystem=audioSystem;
		this.numberOfDoors=numberOfDoors;
		
	}
	
	public void displayDetailInfo()
	{
		System.out.println("Detailed INformation");
		System.out.println("Audio:" +audioSystem +"  Doors:" +numberOfDoors);
	}
}
class Vehiclemain{
	public static void main(String [] args)
	{
		System.out.println(" 1.Four Wheeler \n 2.Two Wheeler \n Enter Vehicle Type: ");
	
	
	 String make,vehicleNumber,fuelType;
	 int cc,fuelCapacity,type;
	 Scanner in = new Scanner(System.in);
	 type=in.nextInt();
	 System.out.println(" Vehicle Make:");
	 make=in.next();
	 System.out.println(" Vehicle Number:");
		vehicleNumber=in.next();
		System.out.println(" Fuel Type:  1.Petrol  2.Diesel");
		fuelType=in.next();
		System.out.println(" Fuel Capacity:");
		fuelCapacity=in.nextInt();
		 System.out.println(" Engine CC:");
		cc=in.nextInt();
		String audioSystem;
		int numberOfDoors;
		if(type==1)
		{
			System.out.println("Audio System:");
			audioSystem=in.next();
			System.out.println("Number of doors");
			numberOfDoors=in.nextInt();
			FourWheeler ob2 = new FourWheeler( make,  vehicleNumber,  fuelType, fuelCapacity,  cc,audioSystem,numberOfDoors);
			ob2.displayBasicInfo();
			ob2.displayDetailInfo();
			
		}
		else
		{
			System.out.println("Kick Start Available  yes/no ");
			String kickStartAvailable=in.next();
			TwoWheeler ob =new TwoWheeler( make,  vehicleNumber,  fuelType, fuelCapacity,  cc, kickStartAvailable);
			ob.displayBasicInfo();
			ob.displayDetailInfo();
			
		}
		 
	}
}