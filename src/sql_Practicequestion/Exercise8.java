package sql_Practicequestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sql="SELECT customer.cust_name,\r\n" + 
				"salesman.name, salesman.city\r\n" + 
				"FROM salesman, customer\r\n" + 
				"WHERE salesman.city = customer.city";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("cust_name"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("city"));
		}
	}

}
