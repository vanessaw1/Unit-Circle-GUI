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
	public JLabel givenAngle, answerType, isCorrect;
	public JTextField answer;
	public JButton generate, check, solution, sqrtSymbol;	//added sqrtSymbol button
	public GridBagConstraints c;
	
	public static int num = 0;
	public static String answer1 = "";	//add ;) for vanessa
	
	public AnswerTypeActionListener at;
	public AngleTypeActionListener angt;
	public RandomNumberGeneratorActionListener rng;
	public CheckAnswerActionListener ca;
	public SqrtSymbolActionListener sqrt;
	//td - add label = undefined = "undef"; - must be in that spelling to work :)
	public UnitCircleMain() {
		
		super("Unit Circle");
		
		try {
			new Circle();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		p = new JPanel(new GridBagLayout());
		
		//resizeCircle = (BufferedImage) circle.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		//pic = new JLabel(new ImageIcon(resizeCircle));
		
		sin = new JRadioButton("sin", true);
		cos = new JRadioButton("cos");
		tan = new JRadioButton("tan");
		sin.setActionCommand(sin.getText());
		cos.setActionCommand(cos.getText());
		tan.setActionCommand(tan.getText());
		function = new ButtonGroup();
		function.add(sin);
		function.add(cos);
		function.add(tan);
		
		degrees = new JRadioButton("Degrees", true);
		radians = new JRadioButton("Radians");
		degrees.setActionCommand(degrees.getText());
		radians.setActionCommand(radians.getText());
		angleType = new ButtonGroup();
		angleType.add(degrees);
		angleType.add(radians);
		
		givenAngle = new JLabel("Angle: 0\u00B0 or 360\u00B0");
		
		answerType = new JLabel("sin:");
		answer = new JTextField(10);
		isCorrect = new JLabel();
		
		generate = new JButton("Generate Angle");
		check = new JButton("Check Answer");
		solution = new JButton("Get Solution");
		sqrtSymbol = new JButton("\u221A"); //updated
		
		at = new AnswerTypeActionListener(answerType, function);
		angt = new AngleTypeActionListener(givenAngle, angleType);
		rng = new RandomNumberGeneratorActionListener(givenAngle, degrees);
		ca = new CheckAnswerActionListener(angleType, answer, answerType, isCorrect);
		sqrt = new SqrtSymbolActionListener(sqrtSymbol, answer);
				
		// Begin Component Placement
		c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        p.add(sin, c);
        
        c.gridy = 1;
        p.add(cos,  c);
        
        c.gridy = 2;
        p.add(tan, c);
        
        c.gridx = 2;
        c.gridy = 0;
        p.add(degrees,  c);
        c.gridy = 1;
        p.add(radians,  c);
        
		c.gridy = 3;
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
		
		c.gridx = 2;			//add
		p.add(sqrtSymbol, c);	//add
		
		c.gridx = 1;
		c.gridy = 6;
		p.add(isCorrect, c);
		
		c.gridx = 0;
		c.gridy = 5;
		p.add(generate, c);
		
		c.gridx = 1;
		p.add(check, c);
		
		c.gridx = 2;
		p.add(solution, c);
		// End Component Placement
		
		// Begin ActionListeners
		sin.addActionListener(at);
		cos.addActionListener(at);
		tan.addActionListener(at);
		
		degrees.addActionListener(angt);
		radians.addActionListener(angt);
		generate.addActionListener(rng);
		
		sqrtSymbol.addActionListener(sqrt);
		
		
		check.addActionListener(ca);
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
