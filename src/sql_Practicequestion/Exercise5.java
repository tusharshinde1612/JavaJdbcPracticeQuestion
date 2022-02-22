package sql_Practicequestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exercise5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sql="CREATE TABLE countries( \r\n" + 
				"COUNTRY_ID int,\r\n" + 
				"COUNTRY_NAME varchar(55),\r\n" + 
				"REGION_ID int\r\n" + 
				")";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("Table created successfully");
		
	}

}
