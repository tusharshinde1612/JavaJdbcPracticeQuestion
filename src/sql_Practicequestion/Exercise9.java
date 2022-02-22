package sql_Practicequestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sql="SELECT customer.cust_name, salesman.name\r\n" + 
				"FROM customer,salesman\r\n" + 
				"WHERE salesman.salesman_id = customer.salesman_id;";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("cust_name"));
			System.out.println(rs.getString("name"));
		}
	}
	}


