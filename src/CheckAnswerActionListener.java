import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CheckAnswerActionListener implements ActionListener{

	private ButtonGroup angleType;
	private JTextField answer;
	private JLabel answerType;
	private JLabel isCorrect;
	private JLabel scoreLabel;
	private JButton check;
	
	public CheckAnswerActionListener(ButtonGroup angleType, JTextField answer, JLabel answerType, JLabel isCorrect, JLabel scoreLabel, JButton check) {
		this.angleType = angleType;
		this.answer = answer;
		this.answerType = answerType;
		this.isCorrect = isCorrect;
		this.scoreLabel = scoreLabel;
		this.check = check;
	}
	
	public void actionPerformed(ActionEvent e) {
		//User's answer
		String input = answer.getText();
		//Angle measure
		String angle = Circle.degree[UnitCircleMain.num];
		//System.out.println(angle);
		String type = answerType.getText();
		
		if (type.equals("sin:") && input.equals(Circle.sin[UnitCircleMain.num]) || type.equals("cos:") && input.equals(Circle.cos[UnitCircleMain.num])
				|| type.equals("tan:") && input.equals(Circle.tan[UnitCircleMain.num]) || type.equals("sec:") && input.equals(Circle.sec[UnitCircleMain.num])
				|| type.equals("csc:") && input.equals(Circle.csc[UnitCircleMain.num]) || type.equals("cot:") && input.equals(Circle.cot[UnitCircleMain.num])) {
			isCorrect.setText("Correct!");
			UnitCircleMain.score++;
			scoreLabel.setText("Score: " + UnitCircleMain.score);
			check.setEnabled(false);
		} else {
			isCorrect.setText("Incorrect");
		}
	}

}
