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
	
	public Bridge(boolean debugFlag){
		//setup portion
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
			System.out.println("Bridge object didn't successfully complete...");
			System.out.println("You probably don't have the JDBC/ODBC Driver installed yet.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Bridge object didn't successfully complete...");
			System.out.println("You probably don't have the JDBC/ODBC Driver installed yet.");
			e.printStackTrace();
		}
		
	}
	
	public Bridge() {
		
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
			System.out.println("Bridge object didn't successfully complete...");
			System.out.println("You probably don't have the JDBC/ODBC Driver installed yet.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Bridge object didn't successfully complete...");
			System.out.println("You probably don't have the JDBC/ODBC Driver installed yet.");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Example to passing SQL queries to database this will take a person object; generate a query string from the SQLStatements class and return the string
	 */
	public void bridgeInsert(Person person,String table){
		
		try {
			statement.executeUpdate(s.insertNewPerson(person,table));
		} catch (SQLException e1) {
			System.out.println("Error in bridgeInsert method");
			e1.printStackTrace();
			person.printFullData(); //displays the object that caused the error
		}
		
	}

}
