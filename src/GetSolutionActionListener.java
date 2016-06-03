import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class GetSolutionActionListener implements ActionListener {

	private JTextField answer;
	private JLabel answerType;
	
	public GetSolutionActionListener(JTextField answer, JLabel answerType) {
		this.answer = answer;
		this.answerType = answerType;
	}
	
	public void actionPerformed(ActionEvent e) {
		String type = answerType.getText();
		
		if (type.equals("cos:")) {
			answer.setText(Circle.cos[UnitCircleMain.num]);
		} else if (type.equals("sin:")) {
			answer.setText(Circle.sin[UnitCircleMain.num]);
		} else if (type.equals("tan:")) {
			answer.setText(Circle.tan[UnitCircleMain.num]);
		} else {
			answer.setText("Error in GetSolutionActionListener class");
		}
	}

}
