/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 * @author vgoyal
 *
 */
public class DBRollback {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException{
		Connection connection = DBConnect.connectToDB();
		ResultSet resultSet = null;
		try {
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery("select * from contact");
			resultSet.absolute(1);
			resultSet.updateString(5, "333333");
			resultSet.updateRow();
			Savepoint savepoint = connection.setSavepoint();			
			
			resultSet.absolute(2);
			resultSet.updateString(5, "33333");
			resultSet.updateRow();
			Savepoint savepointSecond = connection.setSavepoint();
			
			resultSet.absolute(3);
			resultSet.updateString(5, "3333333");
			resultSet.updateRow();
			Savepoint savepointThird = connection.setSavepoint();
			
			connection.rollback(savepoint);
			connection.commit();
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
		}
	}

}
