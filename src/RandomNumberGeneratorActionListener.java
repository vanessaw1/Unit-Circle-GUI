import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class RandomNumberGeneratorActionListener implements ActionListener{
	
	// add image variable
	private JLabel angleType;
	private JRadioButton degrees;
	private JTextField answer;
	private JLabel isCorrect;
	private JButton check;
	
	public RandomNumberGeneratorActionListener(JLabel angleType, JRadioButton degrees, JTextField answer, JLabel isCorrect, JButton check) {
		this.angleType = angleType;
		this.degrees = degrees;
		this.answer = answer;
		this.isCorrect = isCorrect;
		this.check = check;
	}
	
	public void actionPerformed(ActionEvent e) {
		UnitCircleMain.num = (int)(Math.random()*16);
		check.setEnabled(true);
		
		answer.setText("");
		isCorrect.setText("...");
		
		if (degrees.isSelected()) {
			angleType.setText("Angle: " + Circle.degree[UnitCircleMain.num]);
		} else {
			angleType.setText("Angle: " + Circle.radian[UnitCircleMain.num]);
		}
		//picture = ImageIO.read(new File("src/circle"+angle+".png"));	
		
	}
	
}
