package Database;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class StatementDataRetriveExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		try {
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","abc123");

			Statement st = con.createStatement();
			String query = "select EID,ENAME from employee";
			ResultSet rs = st.executeQuery(query);
			ResultSetMetaData rsmt = rs.getMetaData();
			System.out.println(rsmt);
			int cols = rsmt.getColumnCount();
			while(rs.next()) {
				for(int i= 1; i<=cols;i++) {
					System.out.println(rs.getString(i)+ "\t");
				}
				System.out.println("");
			}
			st.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
