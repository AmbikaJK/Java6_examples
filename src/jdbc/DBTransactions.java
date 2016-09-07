/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTransactions {
	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnect.connectToDB();
		ResultSet resultSet = null;
		ResultSet resultSet1 = null;
		try {
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery("select * from contact");
			resultSet.absolute(1);
			resultSet.updateString(5, "111111111");
			resultSet.updateRow();
			
			resultSet1 = statement.executeQuery("select * from family_detail");
			resultSet1.moveToInsertRow();
			resultSet1.updateString(2, "fff");
			resultSet1.updateString(3, "lll");
			resultSet1.updateString(4, "fff@mail.com");
			resultSet1.updateString(5, "2222");
			resultSet1.insertRow();
			System.out.println("successfull commit !!!");
			connection.commit();
		} catch (Exception e) {
			connection.rollback();
			System.out.println();
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}
			if (resultSet1 != null) {
				resultSet1.close();
			}
		}
	}
}
