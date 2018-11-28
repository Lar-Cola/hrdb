package core;

import units.*;


/**
 * The purpose of this class is to build usable SQL statements can be used to build simple/general SQL statements
 * or can build complex statements as needed.
 * 
 * @author mjgbenigno
 *
 */
public class SQLStatements {
	
	public SQLStatements() {
		
	}
	
	//as of 11/26 no person table exists; this can be just used as an example/template
	public String insertNewPerson(Person newperson) {
		return "INSERT INTO (firstName, lastName, ssn, phone, email) " + "VALUES(" + newperson.getFirstName() + "," + newperson.getLastName() + "," + newperson.getSSN() + "," + newperson.getPersonalPhoneNumber() + "," + newperson.getPersonalEmail()+")";
	}
	
	public String insertNewEmployee(Employee newemployee) {
		return "INSERT INTO empInfo VALUES("+newemployee.getEmployeeFirstName()+","+newemployee.getEmployeeeLastName()+","+newemployee.getEmployeePhoneNumber()+","+newemployee.getEmployeeAddress()+","+newemployee.getEmployeeSSN()+","+newemployee.getJobDescription()+")";
	}
	
	public String insertNewCompany(Company newcompany) {
		return null;
	}
	
	
	//retrieve methods
	
	public String getEmployee(int ID) {
		return null;
	}
	
	public String getEmployee(String firstName, String lastName) {
		return null;
	}
	
	public String getEmployee(String name) {
		return "SELECT empID, SSN_num FROM empInfo WHERE first_name="+name+")OR(last_name="+name+")";
	}
	
	public String getHealthBenefit(String firstName, String lastName) {
		return "SELECT empID, SSN_num FROM empInfo WHERE first_name="+firstName+")AND(last_name="+lastName+")";
	}
	
}
