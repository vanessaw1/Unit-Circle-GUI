import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GetSolutionActionListener implements ActionListener {

	private JTextField answer;
	private JLabel answerType;
	JButton check;
	
	public GetSolutionActionListener(JTextField answer, JLabel answerType, JButton check) {
		this.answer = answer;
		this.answerType = answerType;
		this.check = check;
	}
	
	public void actionPerformed(ActionEvent e) {
		String type = answerType.getText();
		check.setEnabled(false);
			
		if (type.equals("cos:"))
			answer.setText((Circle.cos[UnitCircleMain.num]));
		else if (type.equals("sin:"))
			answer.setText((Circle.sin[UnitCircleMain.num]));
		else if (type.equals("tan:"))
			answer.setText((Circle.tan[UnitCircleMain.num]));
		else if (type.equals("sec:"))
			answer.setText((Circle.sec[UnitCircleMain.num]));
		else if (type.equals("csc:"))
			answer.setText((Circle.csc[UnitCircleMain.num]));
		else if (type.equals("cot:"))
			answer.setText((Circle.cot[UnitCircleMain.num]));
		else
			answer.setText("ERROR...");
	}
}
