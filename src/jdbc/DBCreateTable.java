/**
 * 
 */
package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author vgoyal
 *
 */
public class DBCreateTable {

	public static void main(String[] args) throws SQLException {

		Connection connection = DBConnect.connectToDB();
		Statement statement = connection.createStatement();

		int result = statement.executeUpdate("create table family_detail (id int not null auto_increment,"
				+ " firstName varchar(30) not null,"
				+ " lastName varchar(30),"
				+ " email varchar(30),"
				+ " phoneNo varchar(14),"
				+ " primary key (id));");
		
		System.out.println("Table created successfully!!!" + result);
	}

}
