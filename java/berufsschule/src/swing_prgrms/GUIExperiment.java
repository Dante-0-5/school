package swing_prgrms;

import javax.swing.*;

public class GUIExperiment {
	public static void main(String [] args) {
		JFrame frame = new JFrame("HelloWorld");
		JLabel label = new JLabel("Hello World");
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		
		frame.setVisible(true);
		
	}

}
