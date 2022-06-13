package Database;

import java.sql.*;
import oracle.jdbc.driver.OracleDriver;


public class DB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try
		{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","abc123");
		System.out.println("connected");

		con.close();
		System.out.println("dis connected");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}

	}

}
