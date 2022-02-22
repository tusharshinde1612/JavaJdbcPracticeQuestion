package sql_Practicequestion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Exercise4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String user = null;
		String pass = null;
		String url = null;
		Properties prop = new Properties();
		InputStream input = null;
		input = new FileInputStream("db.properties");
		prop.load(input);
		user = prop.getProperty("username");
		url = prop.getProperty("url");
		pass = prop.getProperty("password");
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Database Connection successfull");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
