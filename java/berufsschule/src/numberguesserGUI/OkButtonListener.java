package numberguesserGUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OkButtonListener implements ActionListener {
	int foobar;
	
	public OkButtonListener(int barfoo) {
		this.foobar = barfoo;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println(foobar);
	}

}
