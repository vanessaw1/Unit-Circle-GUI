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
	private JLabel isCorrect, pic;
	private JButton check;
	private BufferedImage circle;
	
	private ImageIcon c0 = new ImageIcon(getClass().getResource("circle 0.png"));
	private ImageIcon c1 = new ImageIcon(getClass().getResource("circle 1.png"));
	private ImageIcon c2 = new ImageIcon(getClass().getResource("circle 2.png"));
	private ImageIcon c3 = new ImageIcon(getClass().getResource("circle 3.png"));
	private ImageIcon c4 = new ImageIcon(getClass().getResource("circle 4.png"));
	private ImageIcon c5 = new ImageIcon(getClass().getResource("circle 5.png"));
	private ImageIcon c6 = new ImageIcon(getClass().getResource("circle 6.png"));
	private ImageIcon c7 = new ImageIcon(getClass().getResource("circle 7.png"));
	private ImageIcon c8 = new ImageIcon(getClass().getResource("circle 8.png"));
	private ImageIcon c9 = new ImageIcon(getClass().getResource("circle 9.png"));
	private ImageIcon c10 = new ImageIcon(getClass().getResource("circle 10.png"));
	private ImageIcon c11 = new ImageIcon(getClass().getResource("circle 11.png"));
	private ImageIcon c12 = new ImageIcon(getClass().getResource("circle 12.png"));
	private ImageIcon c13 = new ImageIcon(getClass().getResource("circle 13.png"));
	private ImageIcon c14 = new ImageIcon(getClass().getResource("circle 14.png"));
	private ImageIcon c15 = new ImageIcon(getClass().getResource("circle 15.png"));
	
	public RandomNumberGeneratorActionListener(JLabel angleType, JRadioButton degrees, JTextField answer, JLabel isCorrect, JButton check, JLabel pic) {
		this.angleType = angleType;
		this.degrees = degrees;
		this.answer = answer;
		this.isCorrect = isCorrect;
		this.check = check;
		this.pic = pic;
	}
	
	public void actionPerformed(ActionEvent e) {
		UnitCircleMain.num = (int)(Math.random()*16);
		check.setEnabled(true);
		
		switch(UnitCircleMain.num) {
			case 0:
				pic.setIcon(c0);
				break;
			case 1:
				pic.setIcon(c1);
				break;
			case 2:
				pic.setIcon(c2);
				break;
			case 3:
				pic.setIcon(c3);
				break;
			case 4:
				pic.setIcon(c4);
				break;
			case 5:
				pic.setIcon(c5);
				break;
			case 6:
				pic.setIcon(c6);
				break;
			case 7:
				pic.setIcon(c7);
				break;
			case 8:
				pic.setIcon(c8);
				break;
			case 9:
				pic.setIcon(c9);
				break;
			case 10:
				pic.setIcon(c10);
				break;
			case 11:
				pic.setIcon(c11);
				break;
			case 12:
				pic.setIcon(c12);
				break;
			case 13:
				pic.setIcon(c13);
				break;
			case 14:
				pic.setIcon(c14);
				break;
			case 15:
				pic.setIcon(c15);
				break;
		}
		
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
