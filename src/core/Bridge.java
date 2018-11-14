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
		if (debug) {
			System.out.println("Bridge object initialized with debug set to true...");
		} else {
			System.out.println("Bridge object initialized...");
		}
		
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			connect = DriverManager.getConnection("");
			statement = connect.createStatement();		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Example to passing SQL queries to database this will take a person object; generate a query string from the SQLStatements class and return the string
	 */
	public void bridgeInsert(Person e){
		
		try {
			statement.executeUpdate(s.insertNewPerson(e));
		} catch (SQLException e1) {
			System.out.println("Error in bridgeInsert method");
			e1.printStackTrace();
			e.printFullData(); //displays the object that caused the error
		}
		
	}
}
