import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class UnitCircleMain extends JFrame{
	
	public JPanel p, p2;
	public BufferedImage circle, resizeCircle;
	public JLabel pic;
	public JRadioButton sin, cos, tan;
	public ButtonGroup function, angleType;
	public JRadioButton degrees, radians;
	public JLabel givenAngle, answerType, isCorrect, undef, other;
	public JTextField answer;
	public JButton generate, check, solution, sqrtSymbol;	//added sqrtSymbol button
	public GridBagConstraints c;
	
	public static int num = 0;
	public static String answer1 = "";
	
	public AnswerTypeActionListener at;
	public AngleTypeActionListener angt;
	public RandomNumberGeneratorActionListener rng;
	public CheckAnswerActionListener ca;
	public SqrtSymbolActionListener sqrt;
	public GetSolutionActionListener sol;
	
	public UnitCircleMain() {
		
		super("Unit Circle");
		
		try {
			new Circle();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		p = new JPanel(new GridBagLayout());
		p2 = new JPanel();
		
		sin = new JRadioButton("sin", true);
		cos = new JRadioButton("cos");
		tan = new JRadioButton("tan");
		Font f = new Font("serif", Font.PLAIN, 20);
		sin.setFont(f);
		cos.setFont(f);
		tan.setFont(f);
		
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
		
		degrees.setFont(f);
		radians.setFont(f);
		
		// Add circle image
		try {
			circle = ImageIO.read(new File("images/circle blank.png"));
			pic = new JLabel(new ImageIcon(circle));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//pic = new JLabel(new ImageIcon(circle));
		// End
		
		givenAngle = new JLabel("Angle: 0\u00B0 or 360\u00B0");
		givenAngle.setFont(f);
		
		answerType = new JLabel("sin:");
		answerType.setFont(f);
		answer = new JTextField(10);
		answer.setFont(f);
		isCorrect = new JLabel("...");
		isCorrect.setFont(f);
		undef = new JLabel("[Type \"undef\" for undefined]");
		undef.setFont(f);
		other = new JLabel("[Denominator must be rationalized]");
		other.setFont(f);
		
		generate = new JButton("Generate Angle");
		generate.setFont(f);
		check = new JButton("Check Answer");
		check.setFont(f);
		solution = new JButton("Get Solution");
		solution.setFont(f);
		sqrtSymbol = new JButton("\u221A"); //updated
		sqrtSymbol.setFont(f);
		
		at = new AnswerTypeActionListener(answerType, function);
		angt = new AngleTypeActionListener(givenAngle, angleType);
		rng = new RandomNumberGeneratorActionListener(givenAngle, degrees, answer, isCorrect, check, pic);
		ca = new CheckAnswerActionListener(angleType, answer, answerType, isCorrect);
		sqrt = new SqrtSymbolActionListener(sqrtSymbol, answer);
		sol = new GetSolutionActionListener(answer, answerType, check);
		
		// Begin Component Placement
		c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        p.add(sin, c);
        c.gridy = 1;
        p.add(cos,  c);
        
        c.gridy = 2;
        p.add(tan, c);
        
        c.gridx = 1;
        c.gridy = 0;
        p.add(degrees,  c);
        c.gridy = 1;
        p.add(radians,  c);
        
		c.gridy = 3;
		p.add(Box.createVerticalStrut(100),c);
		
		//image pt 2
		setLayout(new BorderLayout());
		p2.add(pic, BorderLayout.WEST);
		
		setLayout(new GridBagLayout());
		
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
		c.gridy = 8;
		p.add(undef, c);
		
		c.gridy = 7;
		p.add(other, c);
	
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
		solution.addActionListener(sol);
		
		check.addActionListener(ca);
		// End ActionListeners
		
		
		add(p2);
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new UnitCircleMain();
	}
}
