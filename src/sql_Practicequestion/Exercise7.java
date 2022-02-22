package sql_Practicequestion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sql="Insert into countries (countryId,countryName,regionId) values (?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlPractice", "root", "root");
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("Enter Country Id");
		int cid=sc.nextInt();
		System.out.println("Enter Country Name");
		String cname=sc.next();
		System.out.println("Enter Region Id");
		int rid=sc.nextInt();
		ps.setInt(1, cid);
		ps.setString(2,cname);
		ps.setInt(3, rid);
		ps.executeUpdate(sql);

	}

}

