/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author vgoyal
 *
 */
public class DBQuery {
	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnect.connectToDB();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from contact");
		System.out.println("id\tfirstName\tlastName\temail\tphoneNo");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t"
				+ resultSet.getString(2) + "\t"
				+ resultSet.getString(3) + "\t"
				+ resultSet.getString(4) + "\t"
				+ resultSet.getString(5) + "\t");
		}
	}
}
