package sql_Practicequestion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO BankDB (AccountNo,AccountBal) VALUES (?,?)");
		System.out.println("how many records you want to insert");
		int n=0;
		int no=sc.nextInt();
		while(n<no) {
			int ano=0;
			int bal=0;
			System.out.println("Enter AccountNo:");
			ano=sc.nextInt();
			System.out.println("Enter balance");
			bal=sc.nextInt();
            preparedStatement.setInt(1, ano);
            preparedStatement.setInt(2, bal);
            preparedStatement.executeUpdate();
		}
	}

}
