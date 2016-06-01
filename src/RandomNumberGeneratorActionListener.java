import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class RandomNumberGeneratorActionListener implements ActionListener{
	
	// add image variable
	private JLabel angleType;
	private JRadioButton degrees;
	
	public RandomNumberGeneratorActionListener(JLabel angleType, JRadioButton degrees) {
		this.angleType = angleType;
		this.degrees = degrees;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		UnitCircleMain.num = (int)(Math.random()*16);
		
		if (degrees.isSelected()) {
			angleType.setText("Angle: " + Circle.degree[UnitCircleMain.num]);
		} else {
			angleType.setText("Angle: " + Circle.radian[UnitCircleMain.num]);
		}
		//picture = ImageIO.read(new File("src/circle"+angle+".png"));	
		
	}
	
}
