package swing_prgrms;

import javax.swing.*;
import java.io.*;

public class NumberguesserGUI {
	public static void defaultWindow() {
		JFrame defaultWindow = new JFrame("Numberguesser");
		String message = "";
		JLabel messageLabel = new JLabel(message);
		JTextField input = new JTextField();
		JButton okButton = new JButton("OK");
		
		defaultWindow.add(messageLabel);
		defaultWindow.add(input);
		defaultWindow.setSize(600, 600);
		defaultWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		defaultWindow.setVisible(true);
	}
	
	
	
	
	public static void main (String [] args) {
		defaultWindow();
	}

}
