package util;

import java.util.Random;

/**
 * This class is to allow programmers the ability to create randomized outputs.
 * @author mjgbenigno
 *
 */
@SuppressWarnings("serial")
public class IDGenerator extends Random{	
	private final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	private final String NUMBERS = "1234567890";
	private final String ALL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
	
	Random r;
	StringBuilder sb;
	
	public IDGenerator() {
		r = new Random();
	}
	
	public IDGenerator(long seed) {
		r = new Random(seed);
	}
	
	/**
	 * Generates and returns a random string of specified length.
	 * @param length
	 * @return
	 */
	public String generateRandomString(int length) {
		sb = new StringBuilder(length); // create a string builder object with specified length
		for(int i = 0; i<length; i++) {
			sb.append(ALL.indexOf(r.nextInt(ALL.length())));
		}
		return sb.toString();
	}
}
