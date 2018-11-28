package core;

public class Main {
	private static boolean debugFlag = true;
	private static GUI g;
	private static Bridge b;
	
	public static void main(String[] args) {
		System.out.println("This system works if you see initialization messages below.");
		g = new GUI(debugFlag);
		g.setVisible(true);
		b = new Bridge(debugFlag);
	}
}
