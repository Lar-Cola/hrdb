package core;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GUI extends JFrame implements ActionListener{
	private boolean debug;
	private int[] dim = {1920,1080}; // dim[0] = width; dim [1] = height
	private JFrame frame;
	
	public GUI(boolean debugFlag) {
		this.debug = debugFlag;
		
		if (debug) {
			System.out.println("GUI object initialized with debug set to true...");
		} else {
			System.out.println("GUI initialized...");
		}
		
		//Compose GUI Elements Below
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		
		setSize(dim[0],dim[1]);
		setTitle("HR Database Demo.");
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
}
