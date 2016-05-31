import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class UnitCircleMain extends JFrame{
	
	private JPanel p;
	private BufferedImage circle, resizeCircle;
	private JLabel pic;
	private JRadioButton sin, cos, tan;
	private ButtonGroup function, angleType;
	private JRadioButton degrees, radians;
	
	private JButton angle, check;
	private GridBagConstraints c;
	
	public UnitCircleMain() {
		
		super("Unit Circle");
		
		p = new JPanel(new GridLayout(0,2));
		
		try {
			circle = ImageIO.read(new File("src/circle 0.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//resizeCircle = (BufferedImage) circle.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		//pic = new JLabel(new ImageIcon(resizeCircle));
		
		sin = new JRadioButton("sin");
		cos = new JRadioButton("cos");
		tan = new JRadioButton("tan");
		function = new ButtonGroup();
		function.add(sin);
		function.add(cos);
		function.add(tan);
		
		degrees = new JRadioButton("Degress");
		radians = new JRadioButton("Radians");
		angleType = new ButtonGroup();
		angleType.add(degrees);
		angleType.add(radians);
		
		angle = new JButton("Generate Angle");
		check = new JButton("Check Answers");
		
		c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		p.add(sin, c);
		
		c.gridx = 1;
		p.add(cos, c);
		
		c.gridx = 2;
		p.add(tan, c);
		
		c.gridx = 0;
		c.gridy = 1;
		p.add(degrees);
		
		c.gridx = 1;
		p.add(radians);
		
		add(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new UnitCircleMain();
	}
}
