package sql_Practicequestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise11 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String sql="SELECT customer.cust_name AS \"Customer\",\r\n" + 
				"customer.grade AS \"Grade\",orders.ord_no AS \"Order No.\"\r\n" + 
				"FROM orders, salesman, customer\r\n" + 
				"WHERE orders.customer_id = customer.customer_id\r\n" + 
				"AND orders.salesman_id = salesman.salesman_id\r\n" + 
				"AND salesman.city IS NOT NULL\r\n" + 
				"AND customer.grade IS NOT NULL";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			
			System.out.println(rs.getString("cust_name"));
			System.out.println(rs.getInt("grade"));
			System.out.println(rs.getInt("ord_no"));
		}
	}

}
