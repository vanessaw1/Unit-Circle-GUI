import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class SqrtSymbolActionListener implements ActionListener {

	JButton button;
	JTextField answer;

	public SqrtSymbolActionListener(JButton button, JTextField answer) {
		this.button = button;
		this.answer = answer;

	}

	public void actionPerformed(ActionEvent e) {
`		String temp = answer.getText();
		temp += "\u221A";
		answer.setText(temp);
	}

}
