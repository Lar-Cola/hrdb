package core;

import units.*;


/**
 * The purpose of this class is to build usable SQL statements can be used to build simple/general SQL statements
 * or can build complex statements as needed.
 * 
 * For now this only functions one way; from code to SQL.
 * 
 * @author mjgbenigno
 *
 */
public class SQLStatements {
	
	public SQLStatements() {
		
	}
	
	public String insertNewPerson(Person newperson) {
		return "INSERT INTO (firstName, lastName, ssn, phone, email) " + "VALUES(" + newperson.getFirstName() + "," + newperson.getLastName() + "," + newperson.getSSN() + "," + newperson.getPersonalPhoneNumber() + "," + newperson.getPersonalEmail()+")";
	}
	
	public String insertNewPerson(Person newperson, String table) {
		return "INSERT INTO "+table+"(firstName, lastName, ssn, phone, email) " + "VALUES(" + newperson.getFirstName() + "," + newperson.getLastName() + "," + newperson.getSSN() + "," + newperson.getPersonalPhoneNumber() + "," + newperson.getPersonalEmail()+")";
	}
	
	public String insertNewEmployee(Employee newemployee) {
		return "INSERT INTO empInfo VALUES("+newemployee.getEmployeeFirstName()+","+newemployee.getEmployeeeLastName()+","+newemployee.getEmployeePhoneNumber()+","+newemployee.getEmployeeAddress()+","+newemployee.getEmployeeSSN()+","+newemployee.getJobDescription()+")";
	}
	
	public String insertNewCompany(Company newcompany) {
		return null;
	}
	
}
