/* 
 * Cavanaugh Keys
 * Backend Software Development
 * Week 7 Coding Assignment
 * 
 * This class obtains a JDBC Connection object from the driver manager.
 */

package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects.exception.DbException;

public class DbConnection {
	
	// Setting connection variables
	private static String HOST = "localhost";
	private static String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";
	
	public static Connection getConnection() {
		
		// Connection string used to obtain a MySQL connection
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s", HOST, PORT, SCHEMA, USER, PASSWORD);
		
		// Start of connection message
		System.out.println("Connecting with url: " + url);
		
		
		// Obtain a JDBC Connection object from the driver manager.
		try {
			
			/* When the main in 'ProjectsApp.java' call DriverManager.getConnection(), the driver manager:
			 * 
			 * 1.  Looks up the MySQL driver and loads it. 
			 * 2.  Establishes a TCP connection between the application and a MySQL server. 
			 * 3a. If the connection cannot be made for some reason, the driver manager throws a 
			 *     checked SQLException. 
			 *  b. This is then converted to an unchecked exception in the catch block below.
			 */
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Successfully obtained a connection!");
			return conn;
		}
		catch (SQLException e) {
			System.out.println("Unable to get a connection at url: " + url);
			throw new DbException(e);
			
		}
	}

}
