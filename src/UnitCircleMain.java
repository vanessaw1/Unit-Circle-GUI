import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class UnitCircleMain extends JFrame{
	
	public JPanel p;
	public BufferedImage circle, resizeCircle;
	public JLabel pic;
	public JRadioButton sin, cos, tan;
	public ButtonGroup function, angleType;
	public JRadioButton degrees, radians;
	public JLabel givenAngle, answerType;
	public JTextField answer;
	public JButton generate, check, solution;
	public GridBagConstraints c;
	
	public AnswerTypeActionListener at;
	
	public UnitCircleMain() {
		
		super("Unit Circle");
		
		p = new JPanel(new GridBagLayout());
		
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
		
		degrees = new JRadioButton("Degrees");
		radians = new JRadioButton("Radians");
		angleType = new ButtonGroup();
		angleType.add(degrees);
		angleType.add(radians);
		
		givenAngle = new JLabel("Angle: [Random angle here]");
		
		answerType = new JLabel("sin: ");
		answer = new JTextField(10);
		
		generate = new JButton("Generate Angle");
		check = new JButton("Check Answers");
		solution = new JButton("Get Solution");
		
		at = new AnswerTypeActionListener(answerType);
		
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
		p.add(degrees, c);
		
		c.gridx = 1;
		p.add(radians, c);
		
		c.gridy = 2;
		p.add(Box.createVerticalStrut(100),c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 3;
		p.add(givenAngle, c);
		
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 4;
		p.add(answerType, c);
		
		c.gridx = 1;
		p.add(answer, c);
		
		c.gridx = 0;
		c.gridy = 5;
		p.add(generate, c);
		
		c.gridx = 1;
		p.add(check, c);
		
		c.gridx = 2;
		p.add(solution, c);
		
		// Begin ActionListeners
		sin.addActionListener(at);
		cos.addActionListener(at);
		tan.addActionListener(at);
		// End ActionListeners
		
		
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
