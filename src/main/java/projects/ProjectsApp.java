/* 
 * Cavanaugh Keys
 * Backend Software Development
 * Week 7 Coding Assignment
 * 
 * This main class will call DbConnection.getConnection() to test whether a connection can 
 * be obtained to the MySQL server.
 */

package projects;


import projects.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) {
		
		// Test whether a connection can be obtained to the MySQL server.
		DbConnection.getConnection();

	}

}
