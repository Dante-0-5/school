package berufsschule;

import javax.swing.*;

public class GUIExperiment {
	public static void main(String [] args) {
		JFrame frame = new JFrame("HelloWorld");
		JLabel label = new JLabel("Hello World");
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		
		frame.setVisible(true);
		
	}

}
