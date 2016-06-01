import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class CheckAnswerActionListener implements ActionListener{

	private ButtonGroup angleType;
	private JTextField answer;
	
	public CheckAnswerActionListener(ButtonGroup angleType, JTextField answer) {
		this.angleType = angleType;
		this.answer = answer;
	}
	
	public void actionPerformed(ActionEvent e) {
			
		String input = answer.getText();
		String label = angleType.getSelection().getActionCommand();
		
		/*if (label.equals("cos:") && input.equals(Circle.cos[1])) {
			// Insert correct/incorrect indicator somewhere
			System.out.println("Correct cos");
		} else if (label.equals("sin:") && input.equals(Circle.sin[1])) {
			System.out.println("Correct sin");
		} else if (label.equals("tan:") && input.equals(Circle.tan[1])) {
			System.out.println("Correct tan");
		} else {
			System.out.println("Error");
		}*/
		
		// Test
		System.out.println("Check Answer button clicked");

	}

}
