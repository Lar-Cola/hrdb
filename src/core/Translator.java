package core;

/**
 * Translator class allows the conversion from SQL Database to usable objects for the program to function.
 * @author mjgbenigno
 *
 */
public class Translator {
	Bridge bridge;
	SQLStatements sql;
	
	public Translator()	{
		bridge = new Bridge(false); //access to bridge commands
		sql = new SQLStatements(); //access to SQLStatements commands
		
		
	}
	
	
}
