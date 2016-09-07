package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDelete {
	public static void main(String[] args) throws SQLException {
	
		Connection connection = DBConnect.connectToDB();
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery("select * from contact where firstName = 'john'");
		
		while (resultSet.next()) {
			resultSet.deleteRow();
		}
		
		ResultSet resultSet1 = statement.executeQuery("Select * from contact");
		System.out.println("id\tfName\tlName\temail\tphoneNo");
		while(resultSet1.next()) {
			System.out.println(resultSet1.getInt(1) + "\t" +
					resultSet1.getString(2) + "\t" +
					resultSet1.getString(3) + "\t" +
					resultSet1.getString(4) + "\t" +
					resultSet1.getString(5));
		}
		
	}
}
