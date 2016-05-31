import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//import java.io.PrintStream;

public class Circle
{
	public static String [] degree, radian, cos, sin, tan;
	public BufferedImage picture = new BufferedImage(0, 0, 0);
	
	public Circle() throws IOException{		
		degree = new String [] {"0\u00B0 or 360\u00B0","30\u00B0", "45\u00B0", "60\u00B0", "90\u00B0", "120\u00B0", "135\u00B0", "150\u00B0", "180\u00B0", "210\u00B0", "225\u00B0", "240\u00B0", "270\u00B0", "300\u00B0", "315\u00B0", "330\u00B0"}; 
		radian = new String [] {"0 or 2\u03C0","\u03C0/6","\u03C0/4","\u03C0/3","\u03C0/2","2\u03C0/3","3\u03C0/4","5\u03C0/6","\u03C0","7\u03C0/6","5\u03C0/4","4\u03C0/3","3\u03C0/2","5\u03C0/3","7\u03C0/4","11\u03C0/6"};
		cos = new String [] {"1","\u221A3/2","\u221A2/2","1/2","0","-1/2","-\u221A2/2","-\u221A3/2","-1","-\u221A3/2","-\u221A2/2","-1/2","0","1/2","\u221A2/2","\u221A3/2"};
		sin = new String [] {"0","1/2","\u221A2/2","\u221A3/2","1","\u221A3/2","\u221A2/2","1/2","0","-1/2","-\u221A2/2","-\u221A3/2","-1","-\u221A3/2","-\u221A2/2","-1/2"};
		tan = new String [] {"0","1/\u221A3","1","\u221A3","undef","-\u221A3","-1","-1/\u221A3","0","1/\u221A3","1","\u221A3","undef","-\u221A3","-1","-1/\u221A3"};	
		picture = ImageIO.read(new File("src/circle0.png"));
	}
	
	
	public void angle() throws IOException
	{
		int a = (int)(Math.random()*16);
		picture = ImageIO.read(new File("src/circle"+a+".png"));	
	}
	
	
	
}