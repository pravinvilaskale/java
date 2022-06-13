package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StatementExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","abc123");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Properties p= new Properties();
		p.put("user", "system");
		p.put("password", "abc123");
		Connection con = DriverManager.getConnection(url, p);
		Statement st = con.createStatement();
		String query1 = "create table employee1(id int primary key, name varchar(20), age int)";

		int i = st.executeUpdate(query1);
		int j = st.executeUpdate("create table employee2(id int primary key, name varchar(20), age int)");

		System.out.println("No of rows affected: " +i);
		System.out.println("No of rows affected: " +j);
		System.out.println("Table created Sucessfully");
		st.close();
		con.close();
	}

}
