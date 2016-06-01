import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;


public class AngleTypeActionListener implements ActionListener {

	JLabel angleType;
	ButtonGroup buttonGroup;
	
	public AngleTypeActionListener(JLabel angleType, ButtonGroup buttonGroup) {
		this.angleType = angleType;
		this.buttonGroup = buttonGroup;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (buttonGroup.getSelection().getActionCommand().equals("Degrees")) {
			angleType.setText("Angle: " + Circle.degree[UnitCircleMain.num]);
		} else {
			angleType.setText("Angle: " + Circle.radian[UnitCircleMain.num]);
		}
	}

}
