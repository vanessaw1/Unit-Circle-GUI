import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
	private JLabel pic;
	private BufferedImage circle;
	
	public RandomNumberGeneratorActionListener(JLabel angleType, JRadioButton degrees, JTextField answer, JLabel isCorrect, JButton check, JLabel pic) {
		this.angleType = angleType;
		this.degrees = degrees;
		this.answer = answer;
		this.isCorrect = isCorrect;
		this.check = check;
		this.pic = pic;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		int temp = UnitCircleMain.num;
		while (temp == UnitCircleMain.num) {
			UnitCircleMain.num = (int)(Math.random()*16);
		}
		
		check.setEnabled(true);
		
		// Add circle image
			try {
				circle = ImageIO.read(new File("images/circle " + UnitCircleMain.num + ".png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		pic.setIcon(new ImageIcon(circle.getScaledInstance(400, 400, Image.SCALE_DEFAULT)));
		// End
		
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
