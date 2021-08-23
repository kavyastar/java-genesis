import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {

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
		 
		 System.out.println("Select the player number whose data needed to be deleted");
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int num = Integer.parseInt(br.readLine());
		 //
		 Boolean b =s1.execute("select * from player where playernumber="+num);
		 if(b==true)
		 {
			ResultSet rs = s1.getResultSet();
			
			 
			
			int status =s2.executeUpdate("Delete from player  where playernumber="+num);
			if(status>0) {
				System.out.println("Delete success");
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
