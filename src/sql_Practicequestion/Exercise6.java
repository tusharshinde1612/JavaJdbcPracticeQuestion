package sql_Practicequestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exercise6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sql="ALTER TABLE countries  ADD regionId2 varchar(40)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("column added successfully");
	}

}
