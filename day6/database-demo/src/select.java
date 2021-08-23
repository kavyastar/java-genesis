

import java.sql.*;

public class select {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis","root","root");
        //3.
		
		PreparedStatement s = con.prepareStatement("select * from player");
		ResultSet r = s.executeQuery();
		System.out.println("PLayer number  |  player name   |   skill   | country  |    mobile ");
		 while(r.next()) {
			 System.out.println(r.getInt(1)+"      " +r.getString(2)+"       " +r.getString(3)+"       " +r.getString(4)+"   " +r.getString(5));
			 
		 }
		con.close();
	}

}
