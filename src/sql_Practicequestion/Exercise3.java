package sql_Practicequestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int bal=0;
		int ano=0;
		System.out.println("Enter AccountNo whose record to be updated");
		ano=sc.nextInt();
		System.out.println("Enter new balance");
		bal=sc.nextInt();
		String sql = "update employee set AccountBal="+bal+"where AccountNo"+ano;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		
	}

}
