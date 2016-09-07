/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 * @author vgoyal
 *
 */
public class DBMetaData {

	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnect.connectToDB();
		DatabaseMetaData databaseMetaData = connection.getMetaData();
		System.out.println("Driver Name : " + databaseMetaData.getDriverName() + ", Driver version : " + databaseMetaData.getDriverVersion());
		System.out.println("Database product name : " + databaseMetaData.getDatabaseProductName());
	}

}
