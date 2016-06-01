import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class AnswerTypeActionListener implements ActionListener {
	
	JLabel label;
	ButtonGroup buttonGroup;
	
	public AnswerTypeActionListener(JLabel label, ButtonGroup buttonGroup) {
		this.label = label;
		this.buttonGroup = buttonGroup;
	}
	
	public void actionPerformed(ActionEvent e) {
		label.setText(buttonGroup.getSelection().getActionCommand() + ":");
	}

}
