package numberguesserGUI;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.lang.Math;

public class NumberguesserGUI extends JComponent {
	public static void defaultWindow() {
		JFrame defaultWindow = new JFrame("Numberguesser");
		int guess = 123467;
		JLabel messageLabel = new JLabel("foobar");
		JTextField input = new JTextField(SwingConstants.CENTER);
		JButton okButton = new JButton("OK");
		
		messageLabel.setBounds(300, 300, 100, 200);
		messageLabel.setBackground(Color.black);
		
		okButton.setBounds(300, 300, 200, 100);
		okButton.addActionListener(new OkButtonListener(guess));
		
		defaultWindow.add(messageLabel);
		defaultWindow.add(okButton);
		defaultWindow.setSize(600, 600);
		defaultWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		defaultWindow.setLayout(null);
		
		defaultWindow.setVisible(true);
	}
	
	
	
	
	public static void main (String [] args) {
		defaultWindow();
	}

}
