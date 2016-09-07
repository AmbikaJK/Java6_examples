package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUpdate {

	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnect.connectToDB();
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		System.out.println("Before Update");
		ResultSet resultSet = statement.executeQuery("select * from contact");
		System.out.println("id\tfirstName\tlastName\temail\tphoneNo");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t"
				+ resultSet.getString(2) + "\t"
				+ resultSet.getString(3) + "\t"
				+ resultSet.getString(4) + "\t"
				+ resultSet.getString(5) + "\t");
		}
		System.out.println("After Update");
		resultSet.absolute(1);
		resultSet.updateString(5, "8999999999");
		resultSet.updateRow();
		ResultSet resultSet1 = statement.executeQuery("select * from contact");
		System.out.println("id\tfirstName\tlastName\temail\tphoneNo");
		while (resultSet1.next()) {
			System.out.println(resultSet1.getInt(1) + "\t"
				+ resultSet1.getString(2) + "\t"
				+ resultSet1.getString(3) + "\t"
				+ resultSet1.getString(4) + "\t"
				+ resultSet1.getString(5) + "\t");
		}
	}
}
