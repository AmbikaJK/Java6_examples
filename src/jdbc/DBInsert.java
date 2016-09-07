package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInsert {

	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnect.connectToDB();
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery("Select * from contact");
		System.out.println("id\tfName\tlName\temail\tphoneNo");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" +
					resultSet.getString(2) + "\t" +
					resultSet.getString(3) + "\t" +
					resultSet.getString(4) + "\t" +
					resultSet.getString(5));
		}
		resultSet.moveToInsertRow();
		resultSet.updateString(2, "John");
		resultSet.updateString(3, "taylor");
		resultSet.updateString(4, "john@hotmail.com");
		resultSet.updateString(5, "78787667677");
		resultSet.insertRow();
		
		resultSet = statement.executeQuery("Select * from contact");
		System.out.println("id\tfName\tlName\temail\tphoneNo");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" +
					resultSet.getString(2) + "\t" +
					resultSet.getString(3) + "\t" +
					resultSet.getString(4) + "\t" +
					resultSet.getString(5));
		}
	}
}
