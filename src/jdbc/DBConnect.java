package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static Connection connectToDB () {
		String url = "jdbc:mysql://localhost:3306/";
		String database = "addressBook";
		String userName = "root";
		String password = "mysql123";
		try {
			return DriverManager.getConnection(url + database, userName, password);
		} catch (Exception e) {
			System.out.println("Database Connection Failed!!");
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String database = "addressBook";
		String userName = "root";
		String password = "mysql123";
		try {
			Connection connection = DriverManager.getConnection(url + database, userName, password);
			System.out.println("Database Connection Successful!!");
		} catch (Exception e) {
			System.out.println("Database Connection Failed!!");
			e.printStackTrace();
		}
	}
}
