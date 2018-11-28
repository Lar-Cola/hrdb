package core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import units.*;

public class Bridge {
	private boolean debug;
	private Connection connect;
	private Statement statement;
	SQLStatements s = new SQLStatements();
	
	/**
	 * Setting this to true will allow debug outputs to be printed to the console. Setting it to false will remove those 
	 * @param debugFlag true or false
	 */
	public Bridge(boolean debugFlag){
		this.debug = debugFlag;
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			connect = DriverManager.getConnection("");
			statement = connect.createStatement();	
			
			if (debug) {
				System.out.println("Bridge object initialized with debug set to true...");
			} else {
				System.out.println("Bridge object initialized...");
			}
			
		} catch (SQLException e) {
			if (debug) {
				System.out.println("Bridge object didn't successfully complete...");
				System.out.println("You probably don't have the JDBC/ODBC Driver installed yet.");
			}
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			if (debug) {
				System.out.println("Bridge object didn't successfully complete...");
				System.out.println("You probably don't have the JDBC/ODBC Driver installed yet.");
			}
			e.printStackTrace();
		}
		
	}
	
	public void bridgeInsert (Person person) {
		try {
			statement.executeUpdate(s.insertNewPerson(person));
		} catch (SQLException e1) {
			
			e1.printStackTrace();
			if (debug) {
				System.out.println("Error in bridgeInsert method");
				person.printFullData(); //displays the object to console that caused the error
			}
		}
	}
	
	public void bridgeInsert (Employee employee) {
		try {
			statement.executeUpdate(s.insertNewEmployee(employee));
		} catch (SQLException e1) {
			e1.printStackTrace();
			if (debug) {
				System.out.println("Error in bridgeInsert method");
				employee.printFullData();
			}
		}
	}
	
	public void bridgeInsert (Department dept) {
		try {
			statement.executeUpdate(s.insertNewDepartment(dept));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
