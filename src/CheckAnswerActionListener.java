import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CheckAnswerActionListener implements ActionListener{

	private ButtonGroup angleType;
	private JTextField answer;
	private JLabel answerType;
	private JLabel isCorrect;
	
	public CheckAnswerActionListener(ButtonGroup angleType, JTextField answer, JLabel answerType, JLabel isCorrect) {
		this.angleType = angleType;
		this.answer = answer;
		this.answerType = answerType;
		this.isCorrect = isCorrect;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		//the user's answer
		String input = answer.getText();
		//angle measure
		String angle = Circle.degree[UnitCircleMain.num];
		System.out.println(angle);
		//cos sin or tan
		String type = answerType.getText();
		
		if (type.equals("cos:") && input.equals(Circle.cos[UnitCircleMain.num])) {
			
			isCorrect.setText("Correct!");
		}
		else if (type.equals("sin:") && input.equals(Circle.sin[UnitCircleMain.num])) {
			
			isCorrect.setText("Correct!");
		}
		else if (type.equals("tan:") && input.equals(Circle.tan[UnitCircleMain.num])) {
			
			isCorrect.setText("Correct!");
		}
		else {
			
			isCorrect.setText("Incorrect");
		}
		
		

	}

}
