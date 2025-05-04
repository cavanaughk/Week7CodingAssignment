/* 
 * Cavanaugh Keys
 * Backend Software Development
 * Week 7 Coding Assignment
 * 
 * All of the exceptions thrown by the Java Database Connectivity (JDBC) API classes are checked 
 * SQLException objects. This class will turn the checked exceptions into unchecked exceptions in 
 * order to keep the code clean.
 */

package projects.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException {
	
	public DbException(String message) {
		
		super(message);
	}

	public DbException(Throwable cause) {
		
		super(cause);
	}

	public DbException(String message, Throwable cause) {
		
		super(message,cause);
	}

}
