package util;

import units.*;

/**
 * The purpose of this class is to provide programmers an easier way to validate inputs
 * @author mjgbenigno
 *
 */
public class InputValidation {
	
	public InputValidation() {
		
	}
	
	/**
	 * Checks if a string meets the minimum length required for entry
	 * @param string input string to be checked.
	 * @param length length of string to be compared to
	 * @return true or false value
	 */
	public boolean checkValidInputLength(String string, int length) {
		if(string.length()==length) return true;
		else return false;
	}
	
	/**
	 * Checks if a string can be parsed to integer.
	 * @param string string to check
	 * @return true or false value
	 */
	public boolean isIntegerParsable(String string) {
		boolean result = false;
		
		if(string.length()==0) {
			System.out.println("ERR: String length is 0; Cannot parse to integer if length is 0.");
			result = false;
		} else {
			try {
				int value = Integer.valueOf(string.trim());
				System.out.println("MSG: String parses to integer; String converts to: " + value);
				result = true;
			} catch (NumberFormatException e) {
				System.out.println("ERR: String is not parsable to integer.");
				e.printStackTrace();
				result = false;
			}
			
		}
		return result;
	}
	
	//TODO check if entry exists in the SQL database
	/**
	 * 
	 * @param emp
	 * @return
	 */
	public boolean checkEmployeeExist(Employee emp) {
		boolean exist = false;
		//send sql statement to database; ask for employee ID, if null then return false else return true
		
		return exist;
	}
}
