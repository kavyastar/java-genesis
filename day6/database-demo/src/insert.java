

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
/*
	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis","root","root");
        //3.
		
		Statement s =con.createStatement();
		System.out.print("Enter the player number" );
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the player name");
		String name = sc.nextLine();
		System.out.print(" Enter the player skill");
		String skill =sc.nextLine();
		System.out.print(" Enter player country");
		String country =sc.nextLine();
		System.out.print("Player mobile number");
		String mobile =sc.nextLine();
		//step 4 execute
		try {
			boolean b= s.execute("insert into player values("+no+",'"+name+"','"+skill+"','"+country+"','"+mobile+"') ");
			if (b==false)
			{  // false since we are not recieving any result set bcoz we are only inerting not using select
				System.out.println("Succesfully inserted");
			}
	
		}
		catch(Exception e)
		{
			System.out.println("Error Occured"+e);
		}
		finally {
			con.close();
		}
		
		
	}

}
