import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class AnswerTypeActionListener implements ActionListener {
	
	JLabel label;
	
	public AnswerTypeActionListener(JLabel label) {
		this.label = label;
	}
	
	public void actionPerformed(ActionEvent e) {
		label.setText("Works");
	}

}
