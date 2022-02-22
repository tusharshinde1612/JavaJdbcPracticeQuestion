package sql_Practicequestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery("SELECT AccountNo, AccountBal" + "FROM BankDB");
		while(rs.next()) {
	         if(rs.getInt("AccountNo")==101) {
	           
	            rs.updateInt("AccountNo", 101);
	          
	            rs.updateInt("AccountBal",10000);
	            
	            rs.updateRow();
	         }
	      }
		con.close();
		
	

	}

}
