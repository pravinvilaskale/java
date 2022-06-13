package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


public class StatementInsertExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","abc123");

		Statement st = con.createStatement();
		String query = "INSERT INTO student VALUES(37,'Pravin',90,85,86)";
		int rs = st.executeUpdate(query);
		
		System.out.print(rs);
		

	}

}
