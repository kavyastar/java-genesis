
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.*;

public class update {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis","root","root");
		Statement s = con.createStatement();
		Statement s1 = con.createStatement();
		Statement s2 = con.createStatement();
		
		ResultSet r= s.executeQuery("select * from player");
		 while(r.next()) {
			 System.out.println(r.getInt(1)+"      " +r.getString(2)+"       " +r.getString(3)+"       " +r.getString(4)+"   " +r.getString(5));
			 
		 }
		 
		 System.out.println("Select the player number whose data needed to be updated");
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int num = Integer.parseInt(br.readLine());
		 //
		 Boolean b =s1.execute("select * from player where playernumber="+num);
		 if(b==true)
		 {
			ResultSet rs = s1.getResultSet();
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+"      " +rs.getString(2)+"       " +rs.getString(3)+"       " +rs.getString(4)+"   " +rs.getString(5));
				 
			 }
			 
			 Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter the player name");
				String name = sc.nextLine();
				System.out.print(" Enter the player skill");
				String skill =sc.nextLine();
				System.out.print(" Enter player country");
				String country =sc.nextLine();
				System.out.print("Player mobile number");
				String mobile =sc.nextLine();
			int status =s2.executeUpdate("Update player set playername ='"+name+"', country ='"+country+"', skill='"+skill+"',mobile='"+mobile+"' where playernumber="+num);
			if(status>0) {
				System.out.println("Update success");
			}
			else {
				System.out.println("Fail");
			}
		 }
		 else {
			 System.out.println("Check the player number");
		 }
		con.close();

	}

}
