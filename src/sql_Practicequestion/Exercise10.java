package sql_Practicequestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sql="SELECT orders.ord_no, customer.cust_name\r\n" + 
				"FROM orders, customer\r\n" + 
				"WHERE orders.customer_id = customer.customer_id";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt("ord_no"));
			System.out.println(rs.getString("cust_name"));
		}
	}

}
