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
	
	Random r;
	
	public IDGenerator() {
		r = new Random();
	}
	
	public IDGenerator(long seed) {
		r = new Random(seed);
	}
	
	public String generateRandomString(int length) {
		String s = null;
		String[] randomString = new String[length];
		
		for(int i = 0; i<randomString.length; i++) {
			
		}
		return s;
	}
	
	public String generateRandomGibberish(int length) {
		return null;
	}
}
