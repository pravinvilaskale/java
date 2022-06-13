package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
	public class PreparedStatementExample {
		public static void main(String[] args) {

			Connection con = null;
			PreparedStatement pt = null;
			try {
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","abc123");

				pt = con.prepareStatement("insert into student values(?,?,?,?,?)");
				pt.setInt(1, 36);
				pt.setString(2,"ashish");
				pt.setInt(3,75);
				pt.setInt(4,95);
				pt.setInt(5,90);
				int i = pt.executeUpdate();
				System.out.println("No. of rows affected -" +i);
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
			finally {
				try {
					if(pt!= null) {
						pt.close();
						pt =null;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				try {
					if(con!= null) {
						con.close();
						con = null;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

}